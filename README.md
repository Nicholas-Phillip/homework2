# Homework2

## Introduction

Image Switcher
It is an element which helps add transitions on the images. It is mainly useful to animate an image on screen and smoothly switches between two images ,providing a way of transitioning from one Image to another.

## History
The Image switcher is a predefined subtype of UI configis, and available in Android from v1.6+.  It is used to implement numberious images in a sequence, and is triggered using onClick. 

## Code Example

 int ImageList[] = {R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,
            R.drawable.image5,R.drawable.image6,R.drawable.image7}; - used to store images
            
            image.setImageResource(ImageList[count]); - used to call images and display when image is switch

##  Major methods/attributes 

The major methods used in this assisngment where setImageDrawable, setImageResource(), setImageURI ().  The setImageDrawable enables the image with image switcher.  The setImageResource(int resid) enables the image to be  passed in the form of an integer ID.  

## Tests

Describe and show how to run the tests with code examples.

## Code
An array was initialized and created with the images that will be displayed.  The functions used this assignment were FindAllViews(), Previous(), Next(),and status().  The FindAllViews function was to initialize the buttons and text boxes with names that will be used later.  The previous function enables the user to switch to the previous image.  However if the user is at the first image the function prohibits the user from switching the image, a message is also displayed.  

The Next function enables the user to cycle/switch to the next image  ,and continue until the end of the array.  In this function there is also a counter to display what image number the user is at, and when the user is about to reach the last image.  If the user is at the last image the function prohibits the user from switching the images, and will display a message. 

The status function is used to update the status of the images and let the user know what image they are at in the array.  There is also a quit option that will close the application.        

## Reference
The references used in this project were:
https://www.tutorialspoint.com/android/android_imageswitcher.htm,
https://abhiandroid.com/ui/imageswitcher,
https://www.tutlane.com/tutorial/android/android-imageswitcher-with-examples,
https://developer.android.com/reference/android/widget/ImageSwitcher?hl=en

## Motivation
This was an assignment for Software Project
