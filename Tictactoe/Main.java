package tictactoe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] table = new char[3][3];
        initializeGrid(table);

        char currentPlayer = 'X';
        boolean gameInProgress = true;

        while (gameInProgress) {
            int row, col;
            while (true) {
                System.out.printf("Player %c, enter the coordinates (row column): ", currentPlayer);
                if (scanner.hasNextInt()) {
                    row = scanner.nextInt();
                    if (scanner.hasNextInt()) {
                        col = scanner.nextInt();
                        if (isValidMove(row, col, table)) {
                            table[row - 1][col - 1] = currentPlayer;
                            displayGrid(table);

                            if (checkWin(table, currentPlayer)) {
                                System.out.printf("%c wins%n", currentPlayer);
                                gameInProgress = false;
                            } else if (isDraw(table)) {
                                System.out.println("Draw");
                                gameInProgress = false;
                            }

                            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                            break;
                        } else {
                            System.out.println("This cell is occupied! Choose another one!");
                        }
                    } else {
                        System.out.println("You should enter numbers!");
                        scanner.next();
                    }
                } else {
                    System.out.println("You should enter numbers!");
                    scanner.next();
                }
            }
        }

        scanner.close();
    }

    private static void initializeGrid(char[][] table) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = '_';
            }
        }
    }

    private static boolean checkWin(char[][] table, char player) {
        for (int i = 0; i < 3; i++) {
            if (table[i][0] == player && table[i][1] == player && table[i][2] == player) { //check if any of the rows have the same value
                return true;
            }
            if (table[0][i] == player && table[1][i] == player && table[2][i] == player) { //check if any of the columns have the same value
                return true;
            }
        }
        return (table[0][0] == player && table[1][1] == player && table[2][2] == player ||
                table[0][2] == player && table[1][1] == player && table[2][0] == player); //check diagonals for same values
    }

    private static boolean isDraw(char[][] table) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == '_') {
                    return false; //if there are '_' game cannot be a draw because all cells need to be filled
                }
            }
        }
        return true; //all cells are filled, game is draw
    }

    private static void displayGrid ( char[][] table) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " "); //prints array
            }
            System.out.println("|");
        }
        System.out.println("---------"); //give me the structure of the game
    }

    private static boolean isValidMove (int row, int col, char[][] table) {
        if (row < 1 || row > 3 || col < 1 || col > 3) {
            return false;
        }
        return table[row - 1][col - 1] == '_';
    }
}
