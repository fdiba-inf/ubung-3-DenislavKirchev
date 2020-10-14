package exercise3;

import java.util.Scanner;

public class NumberCounter{
  
  public static void main (String[] args){

    Scanner input = new Scanner(System.in);
    int sum = 0;
    double average = 0;
    int positiveCounter=0;
    int negativeCounter = 0;
    int counter = 0;
    System.out.println("Enter number: ");
    int num = input.nextInt();
    
    while(num != 0){
      if(num>0){
        positiveCounter++;
      }else{
        negativeCounter++;
      }
      counter++;
      sum +=num;
      average = sum;
      num = input.nextInt();
    }

    System.out.println("Positive numbers: "+positiveCounter);
    System.out.println("Negative numbers: "+negativeCounter);
    System.out.println("Sum:  "+sum);
    System.out.println("Average:  "+ (average/counter));

  }
}