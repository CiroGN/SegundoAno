import cv2
import numpy as np
# imagem original
img = cv2.imread('C:/Users/cirog/source/2Ano/VisaoComp/Aula2/praia.jpg')
cv2.imshow('praia', img)
cv2.waitKey(0)
#conversao para formato RGB
rgbimg = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)
cv2.imshow('RGB', rgbimg)
cv2.waitKey(0)
# conversao para formato em nivel de cinza
imggray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
cv2.imshow('Nivel de cinza', imggray)
cv2.waitKey(0)
# binarizacao imagem em nivel de cinza
(thres, imgba) = cv2.threshold(imggray, 155, 255, cv2.THRESH_OTSU)
cv2.imshow('Binarizada', imgba)
cv2.waitKey(0)
print(thres)
# binarizacao imagem em nivel de cinza
(thres, imgba) = cv2.threshold(imggray, 200, 255, cv2.THRESH_OTSU)
cv2.imshow('Binarizada 2', imgba)
cv2.waitKey(0)
print(thres)
cv2.destroyAllWindows()