import numpy as np
import cv2
from matplotlib import pyplot as plt

img1 = cv2.imread('C:/Users/cirog/source/SegundoAno/VisaoComp/Aula4/Placas.jpg',0) # o 0 converte para cinza 
img2 = cv2.imread('C:/Users/cirog/source/SegundoAno/VisaoComp/Aula4/Placa.jpg',0) 

# Initiate SIFT detector
sift = cv2.SIFT()

# find the keypoints and descriptors with SIFT
kp1, des1 = sift.detectAndCompute(img1,None)
kp2, des2 = sift.detectAndCompute(img2,None)

kp1_image = cv2.drawKeypoints(img1, kp1, None, color=(0, 255, 0), flags=cv2.DRAW_MATCHES_FLAGS_DRAW_RICH_KEYPOINTS)
kp2_image = cv2.drawKeypoints(img2, kp2, None, color=(0, 255, 0), flags=cv2.DRAW_MATCHES_FLAGS_DRAW_RICH_KEYPOINTS)

cv2.imshow('SIFT1', kp1_image)
cv2.imshow('SIFT2', kp2_image)
cv2.waitKey(0)


# BFMatcher with default params
bf = cv2.BFMatcher()
matches = bf.knnMatch(des1, des2, k=2)

# Apply ratio test
good = []
for m,n in matches:
    if m.distance < 0.75*n.distance:
        good.append([m])

# cv2.drawMatchesKnn expects list of lists as matches.
img3 = cv2.drawMatchesKnn(img1,kp1,img2,kp2,good,flags=2)

cv2.imshow(img3),cv2.show()