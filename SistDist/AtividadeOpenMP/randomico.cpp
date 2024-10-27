#include <iostream>
#include <cmath>
#include<bits/stdc++.h>
#include <chrono>
#include <random>
#include <limits>
#include "omp.h"
//export OMP_NUM_THREADS=8
typedef std::chrono::high_resolution_clock Clock;
using namespace std;

#define PONTOS 10000000

//apenas para facilitar o entendimento do código
typedef double (*funcao) (double);

//funcao 4/(1+x^2)
inline double funcao_1(double x) {
   double d = (1+pow(x,2));
   if( d!=0.0D) {
      return 4.0D/d;
   }
   throw string("Divisão por zero.");
}
//derivada
inline double funcaod_1(double x) {
   return -((8*x)/(pow(pow(x,2)+1,2)));
}

class FuncoesMonteCarlo {
public:
   static double calculaF(vector <double> amostra, funcao f) {
      long double somatorio = 0.0D;
      for( int i=0; i<PONTOS; ++i) {
         somatorio += f(amostra[i]);
      }
      //cout << somatorio << endl;
      return (double)(1.0D/amostra.size()) * somatorio;
   }

      static double calculaFP(vector <double> amostra, funcao f) {
      long double somatorio = 0.0D;
      #pragma omp parallel for reduction(+:somatorio)
      for( int i=0; i<PONTOS; ++i) {
         somatorio += f(amostra[i]);
        //  cout << i << " thread " << omp_get_thread_num() << endl;
      }
      //cout << somatorio << endl;
      return (double)(1.0D/amostra.size()) * somatorio;
   }
};

int main ()
{
   //quanto tempo se passou
   unsigned seed = std::chrono::system_clock::now().time_since_epoch().count();

   std::mt19937_64 aleatorio(seed);

   int n = PONTOS;

   int nprocs = omp_get_num_procs();
//    cout << "O computador tem " << nprocs << " processadores." << endl;
 
   vector <double> amostra;
   cout.precision(15);
   while( amostra.size() < n) {
      double numero =( (double)aleatorio() / LLONG_MAX); //0 até 1, slide
      amostra.push_back(numero);
   }

   try {
    //   cout << "Resultados para a funcao: 4/(1+sqrt(x))" << endl;
      auto t1 = Clock::now();
      double resultado = FuncoesMonteCarlo::calculaF(amostra,funcao_1);
      auto t2 = Clock::now();
    //   cout << "Tempo necessário:" << chrono::duration_cast<chrono::nanoseconds>(t2 - t1).count()/1000000000.0F << endl;
    //   cout << "Calculo:" << resultado << endl << endl;

      t1 = Clock::now();
      resultado = FuncoesMonteCarlo::calculaFP(amostra,funcao_1);
      t2 = Clock::now();
    //   cout << "Tempo necessário:" << chrono::duration_cast<chrono::nanoseconds>(t2 - t1).count()/1000000000.0F << endl;
    //   cout << "Calculo:" << resultado << endl;
   }
   catch( string e) {
    //   cout << e << endl;
   }


   return 0;
}