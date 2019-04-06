package com.unsta.flight;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    class Flight {

      int passengers;
      int seats;

      void Flight() {
        passengers = 0;
        seats = 300;
      }

      void addPassengers(int quantity) {
        passengers += quantity;
      }
    }

    Flight bueToMia = new Flight();

    System.out.println("Passengers Bue to Mia: " + bueToMia.passengers);
    int quantity = sc.nextInt();
    bueToMia.addPassengers(quantity);
    System.out.println("Passengers Bue to Mia: " + bueToMia.passengers);

    Flight miaToBue = new Flight();
    System.out.println("Passengers Mia to Bue: " + miaToBue.passengers);
  }
}