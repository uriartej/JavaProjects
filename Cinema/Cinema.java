package cinema;

import java.util.Scanner;

public class Cinema {
    static char[][] cinemaLayout;

    public static int calculateTicketPrice(int numRows, int numCols, int chosenRow) {
        int totalSeats = numRows * numCols;
        int frontHalf = numRows / 2;
        if (totalSeats <= 60) {
            return 10;
        } else {
            if (chosenRow <= frontHalf) {
                return 10;
            } else {
                return 8;
            }
        }
    }

    public static void printStatistics(int numRows, int numCols) {
        int purchasedTickets = 0;
        int totalSeats = numRows * numCols;
        int currentIncome = 0;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (cinemaLayout[i][j] == 'B') {
                    purchasedTickets++;
                    currentIncome += calculateTicketPrice(numRows, numCols, i + 1);
                }
            }
        }

        double percentage = (double) purchasedTickets / totalSeats * 100;
        int totalIncome = currentIncome;

        System.out.println("Number of purchased tickets: " + purchasedTickets);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + totalIncome);
    }

    public static void buyTicket(int numRows, int numCols) {
        Scanner scanner = new Scanner(System.in);
        int chosenRow = 0;
        int chosenCol = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("\nEnter a row number:");
            chosenRow = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            chosenCol = scanner.nextInt();

            if (chosenRow < 1 || chosenRow > numRows || chosenCol < 1 || chosenCol > numCols) {
                System.out.println("Wrong input!");
                continue;
            }

            if (cinemaLayout[chosenRow - 1][chosenCol - 1] == 'S') {
                cinemaLayout[chosenRow - 1][chosenCol - 1] = 'B';
                System.out.println("Ticket price: $" + calculateTicketPrice(numRows, numCols, chosenRow));
                validInput = true;
            } else {
                System.out.println("That ticket has already been purchased!");
            }
        }
    }

    public static void printCinema() {
        System.out.println("Cinema:");
        int numRows = cinemaLayout.length;
        int numCols = cinemaLayout[0].length;

        System.out.print("  ");
        for (int j = 1; j <= numCols; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < numRows; i++) {
            System.out.printf("%2d ", i + 1);
            for (int j = 0; j < numCols; j++) {
                System.out.print(cinemaLayout[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numCols = scanner.nextInt();

        cinemaLayout = new char[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                cinemaLayout[i][j] = 'S';
            }
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\n1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    printCinema();
                    break;
                case 2:
                    buyTicket(numRows, numCols);
                    break;
                case 3:
                    printStatistics(numRows, numCols);
                    break;
                default:
                    System.out.println("Invalid input! Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
