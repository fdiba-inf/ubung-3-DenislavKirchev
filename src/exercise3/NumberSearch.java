package exercise3;

import java.util.Scanner;

public class NumberSearch {

    public static void main(String[] args) {

      int counter=0;
      for(int i=100;i<=1000;i++){
        if(i % 30 == 0){
          System.out.print(i + " ");
          counter++;
          if(counter == 10){
            counter=0;
            System.out.println();
          }
        }
      }
    }
}