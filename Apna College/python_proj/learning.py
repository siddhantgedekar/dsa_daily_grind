import cv2
from mss import mss
import mss.tools

img = cv2.imread('hot_beauti.jpeg')
# extract height and width
h, w, d = img.shape[:3]
print("Image Dimensions -> Height: {}, Width: {}, Depth: {}".format(h,w, d))
print("Image shape: " , img.shape)
# extract RGB values from the image
R, G, B = img[100, 100] # provided pixel position (random)
print("Pixel values -> RED: {}, GREEN: {}, BLUE: {}".format(R,G,B))

# maybe I can use a loop
print("Printing pixel column wise using loop")
# for i in range(w-1):
#     for j in range(h-1):
#         print(img[i, j])

# calculate region of interest
roi = img[50 : 250, 200 : 430] # I think it's the crop dimensions first two tell height, next two tell width sizes.
cv2.imshow("ROI", roi)
cv2.waitKey(0) # when pressed 0 it'll exit

# resize the image. resize() function takes to parameters
# the image and the dimension
resize = cv2.resize(img, (500, 600))
cv2.imshow("Resized Image", resize)
cv2.waitKey(0)

# Calculating the ratio
ratio = 180 / 360
# Creating a tuple containing width and height
dim = (300, int(h * ratio))
# Resizing the image
resize_aspect = cv2.resize(img, dim)
cv2.imshow("Resized Image", resize_aspect)
cv2.waitKey(0)