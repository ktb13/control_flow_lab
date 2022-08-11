import java.util.Scanner;

public class WhatToWear {

    public static void main(String[] args) {

        System.out.println("What is the weather like?");

        Scanner reader = new Scanner(System.in);
        String whatsWeatherLike = reader.nextLine();

        System.out.println("What is the temperature?");
        int stateTemperature = reader.nextInt();

        if (whatsWeatherLike.equals("rainy")) {

            System.out.println("take brolly");

        } else if (whatsWeatherLike.equals("sunny")) {

            System.out.println("wear fave t-shirt");

        } else if (whatsWeatherLike.equals("sunny") && stateTemperature == 27) {

            System.out.println("put your fave dress on and go dance in the rain");

            {


            }


        }


    }

}