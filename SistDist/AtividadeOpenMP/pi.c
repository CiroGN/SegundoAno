#include <omp.h>
#include <stdio.h>

int main ()  {

int nprocs, nthreads, tid;
long int i, n = 1000000000;

double area, pi, x;

area = 0.0;


 /* Only master thread does this */

    nprocs = omp_get_num_procs();
    // printf("Number of processors = %d\n", nprocs);

   /* use the same number of threads */
   omp_set_num_threads(nprocs);

   /* Test FOR */ 
 #pragma omp parallel for private(x) reduction (+:area)
   for (i = 0; i < n; i++)
   {
      x = (i + 0.5)/n;
      area += 4.0/(1.0 + x * x);
    //   printf("Thread = %d, i = %d, Area = %lf\n", omp_get_thread_num(), i, area);
    }  
    pi = area/n;
    // printf("Pi = %.20lf\n", pi);
}