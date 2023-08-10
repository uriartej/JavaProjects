package machine;

import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachine {
    private static final Scanner scanner = new Scanner(System.in);
    private static int mlWater = 400;
    private static int mlMilk = 540;
    private static int gCoffee = 120;
    private static int disposableCups = 9;
    private static int totalMoney = 550;

    public static void main(String[] args) {


        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            if (Objects.equals(action, "buy")) {
                    buyCoffee();

            } else if (Objects.equals(action, "fill")) {
                fillCoffee();

            } else if (Objects.equals(action, "take")) {
                takeCoffee();

            } else if (Objects.equals(action, "remaining")) {
                remaining();

            } else if (Objects.equals(action, "exit")) {
                exit();

            } else {
                System.out.println("Try again");
            }
        }
    }

    public static void printState() {
        System.out.println("The coffee machine has:");
        System.out.println(mlWater + " ml of water");
        System.out.println(mlMilk + " ml of milk");
        System.out.println(gCoffee + " g of coffee beans");
        System.out.println(disposableCups + " g disposable cups");
        System.out.println("$" + totalMoney + " of money");
        System.out.println();
    }

    public static void buyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String coffeeType = scanner.next();

        switch (coffeeType) {
            case "1":

                if (250 <= mlWater && 16 <= gCoffee) {
                    System.out.println("I have enough resources, making you a coffee!");
                    mlWater = mlWater - 250;
                    gCoffee = gCoffee - 16;
                    disposableCups = disposableCups - 1;
                    totalMoney = totalMoney + 4;
                } else {
                    System.out.println("Sorry, not enough water!");
                }
                break;

            case "2":

                if (350 <= mlWater && 75 <= mlMilk && 20 <= gCoffee) {
                    System.out.println("I have enough resources, making you a coffee!");
                    mlWater = mlWater - 350;
                    mlMilk = mlMilk - 75;
                    gCoffee = gCoffee - 20;
                    disposableCups = disposableCups - 1;
                    totalMoney = totalMoney + 7;
                } else {
                    System.out.println("Sorry, not enough water!");
                }
                break;

            case "3":

                if (200 <= mlWater && 100 <= mlMilk && 12 <= gCoffee) {
                    System.out.println("I have enough resources, making you a coffee!");
                    mlWater = mlWater - 200;
                    mlMilk = mlMilk - 100;
                    gCoffee = gCoffee - 12;
                    disposableCups = disposableCups - 1;
                    totalMoney = totalMoney + 6;
                } else {
                    System.out.println("Sorry, not enough water!");
                }
                break;

            default:
                break;
        }
    }
    public static void fillCoffee(){
        System.out.println("Write how many ml of water you want to add:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        int cups = scanner.nextInt();

        mlWater = mlWater + water;
        mlMilk = mlMilk + milk;
        gCoffee = gCoffee + coffeeBeans;
        disposableCups = disposableCups + cups;
    }

    public static void takeCoffee(){
        System.out.println("I gave you $" + totalMoney);
        totalMoney = 0;
    }

    public static void remaining() {
        printState();
    }

    public static void exit() {
        System.exit(0);
    }
}