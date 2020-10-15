package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double angle = input.nextDouble();
        char unit = input.next().charAt(0);

        do{
          if(unit == 'r'){

            double grad = angle*(180.00/Math.PI);
            System.out.println("Angle: " + grad + "d");

          }else{

            double radiant = angle * (Math.PI/180.00);
            System.out.println("Radiant: " + radiant + "r");

          }
          angle = input.nextDouble();
          unit = input.next().charAt(0);
          
        }while(unit == 'r' || unit == 'd');
    }
}