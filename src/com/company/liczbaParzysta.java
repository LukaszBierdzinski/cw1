package com.company;

import java.util.Scanner;

public class liczbaParzysta {

    public static void main(String[] args) {
	int number;
        System.out.println("Podaj liczbę");
        Scanner console = new Scanner(System.in);
        number = console.nextInt();

        if (number % 2 == 0)
        {
            System.out.println("Liczba jest parzysta");
        }
        else
        {
            System.out.println("Liczba jest nieparzysta");
        }
    }
}
