package com.example;
import java.util.*;

/**
 * Created by godzillakotm on 10/23/2016.
 */
public class CameraSelect
{
    public static void main(String []args)
    {

        // The two higher end camera models
        Camera Hero5Black = new Camera(true, true, true, true, true, true);
        Camera Hero5Session = new Camera(false, false, false, true, true, true);

        // Used for use input
        Scanner userNeeds = new Scanner(System.in);

        // variable declarations
        boolean a = true;
        boolean heroBlackCamera = false;
        boolean heroSession5Cam = false;


        do { // This loop will execute as long as the variable "a" is set to true

            // The user will be asked the below question and then will respond with either the number 1 or number 2
            System.out.println("Do your activities require you to shoot raw photos?\n1. Yes\n2. No"); // This is functionality that only the Hero5Black camera has
            int activities = userNeeds.nextInt();

            // This method converts the number 1 to true and 2 to false
            boolean userActivities = userSelection(activities);

            // The functionality in the camera is returned
            heroBlackCamera = Hero5Black.returnRawPhotos();

            // if the below if statement evaluates to true than the Hero5 Black camera is suggested and then the loop is broken out of
            if (userActivities == heroBlackCamera)
            {
                System.out.println("I recommend the Hero5 Black camera. It is the only camera with this capability.");
                break;
            }

            // If the top question is evaluated to as no, then this question will be asked. This also functionality that only the Hero5Black has
            System.out. println("Do your activities require you to be able to capture the location of your videos?\n1. Yes\n2. No");
            activities = userNeeds.nextInt();

            // This method converts the number 1 to true and 2 to false
            userActivities = userSelection(activities);

            // returns the capture location variable from the Camera class for comparison
            heroBlackCamera = Hero5Black.returnLocationCapture();

            // If this if statement evaluates to true than the Hero5Black camera is recommended and the loop is broken out of
            if(userActivities == heroBlackCamera)
            {
                System.out.println("I recommend the Hero5 Black camera. It is the only camera with this capability.");
                break;

            }


            // If the top two questions evaluate to false then the next question is asked. This is also functionality that only the Hero5Black has
            System.out. println("Do your activities require you to have a touch display?\n1. Yes\n2. No");
            activities = userNeeds.nextInt();

            // Converts the user input from 1 to true or 2 to false
            userActivities = userSelection(activities);

            // retrieves the touchDisplay variable from the Camera class for the Hero5Black camera
            heroBlackCamera = Hero5Black.returnTouchDisplay();

            // If the if statement evaluates to true, than the Hero5Black camera is recommended and the loop is broken out of
            if(userActivities == heroBlackCamera)
            {
                System.out.println("I recommend the Hero5 Black camera. It is the only camera with this capability.");
                break;

            }

            // If the top three questions are evaluated to false, then the program will ask the next question. This is functionality that both the Hero5Black and the Hero5Session have
            System.out.println("Do your activities require you to be able to upload your photos to cloud?\n1. Yes\n2. No");
            activities = userNeeds.nextInt();

            // Converts the user inputted integer to a boolean value
            userActivities = userSelection(activities);

            // Retrieves the uploadToCloud variable for both the Hero5Black and the Hero5Session
            heroBlackCamera = Hero5Black.returnUploadToCloud();
            heroSession5Cam = Hero5Session.returnUploadToCloud();

            // If both conditions evaluate to true, then it will ask the user if price is a factor
            if(userActivities == heroBlackCamera && userActivities == heroSession5Cam)
            {
                System.out.println("Is price a factor?\n1. Yes\n2. No");
                int price = userNeeds.nextInt();

                // converts the 1 of 2 the user inputted to either true or false
                boolean userPrice = userSelection(price);

                // If the price is a factor, then the Hero5Session is recommended. Otherwise the Hero5Black is recommended. In either case, the loop is broken out of.
                if(userPrice == true)
                {
                    System.out.println("I would recommend the Hero 5 Session");
                    break;
                }
                else
                {
                    System.out.println("I would recommend the Hero 5 Black. It is our most advanced camera.");
                    break;
                }



            }

            // If the top four questions are evaluated to false, then the program will ask the next question. This is functionality that both the Hero5Black and the Hero5Session have
            System.out. println("Do your activities require video stabilization?\n1. Yes\n2. No");
            activities = userNeeds.nextInt();

            // Converts the 1 or 2 the user inputs to true or false
            userActivities = userSelection(activities);

            // gets the value of the videoStabilization variable in the Camera class
            heroBlackCamera = Hero5Black.returnVideoStabilization();
            heroSession5Cam = Hero5Session.returnVideoStabilization();

            // If both of these conditions evaluate to true, then the user will be asked if price is a factor
            if(userActivities == heroBlackCamera && userActivities == heroSession5Cam)
            {
                System.out.println("Is price a factor?\n1. Yes\n2. No");
                int price = userNeeds.nextInt();

                // Converts the 1 in price to true and 2 to false
                boolean userPrice = userSelection(price);

                // If price is a factor, then the Hero5Session is recommended. If not, then the Hero5Black is suggested
                if (userPrice == true) {
                    System.out.println("I would recommend the Hero 5 Session");
                    break;
                } else {
                    System.out.println("I would recommend the Hero 5 Black. It is our most advanced camera.");
                    break;
                }
            }

                // This is the final question and is functionality that both the Hero5Session and Hero5Black have
                System.out.println("Do your activities require voice control?\n1. Yes\n2. No");
                activities = userNeeds.nextInt();

                // Converts 1 to true and 0 to false
                userActivities = userSelection(activities);

                // Gets the voiceControl variable from the Camera class for the two cameras
                heroBlackCamera = Hero5Black.returnVoiceControl();
                heroSession5Cam = Hero5Session.returnVoiceControl();

                // If both conditions evaluate to true than the user will be asked if price is a factor. If it is, then it will suggest the Hero5Session. If not, then it will suggest the Hero5Black
                if(userActivities == heroBlackCamera && userActivities == heroSession5Cam)
                {
                    System.out.println("Is price a factor?\n1. Yes\n2. No");
                    int price = userNeeds.nextInt();
                    boolean userPrice = userSelection(price);
                    if(userPrice == true)
                    {
                        System.out.println("I would recommend the Hero 5 Session");
                        break;
                    }
                    else
                    {
                        System.out.println("I would recommend the Hero 5 Black. It is our most advanced camera.");
                        break;
                    }



                }

                // If the users selects no to all six questions, then the Hero Session will be recommended
                System.out.println("I would recommend the Hero Session. This camera will meet your needs.");
                a = false; // Ends the loop



        }while(a == true);


    }

    // A method that takes the 1 or 0 from each question and converts it to true or false. This method is called multiple times within the program
    public static boolean userSelection(int activities)
    {
        if(activities == 1)
        {
            return true;
        }

        else
        {
            return false;
        }




    }

}

