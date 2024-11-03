import numpy as np
import cv2
from matplotlib import pyplot as plt

# Read the image
image = cv2.imread("C:/Users/cirog/source/SegundoAno/VisaoComp/Aula7/coins.png")
# Grayscale image
grayscale_image = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
# Binary image
(thresh, im_bw) = cv2.threshold(grayscale_image, 155, 255, cv2.THRESH_OTSU)
# Mathematical Morphology - closing image
kernel = np.ones((3, 3), np.uint8)
closing = cv2.morphologyEx(im_bw, cv2.MORPH_CLOSE, kernel, iterations=2)
# Objects counting
cont_img = closing.copy()
contours, hierarchy = cv2.findContours(cont_img, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)
# Definition of objects by area
for cnt in contours:
   area = cv2.contourArea(cnt)
   if area < 2000 or area > 5000:
       continue
   if len(cnt) < 5:
       continue
   ellipse = cv2.fitEllipse(cnt)
   cv2.ellipse(image, ellipse, (0,255,0), 2)  
cv2.imshow("Detection", image)
cv2.waitKey(0)