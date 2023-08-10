# Coffee Machine Simulation (Java)

Welcome to the Coffee Machine Simulation! This Java program allows you to interact with a virtual coffee machine. You can perform various actions, such as buying coffee, refilling resources, taking money, and checking the remaining resources.

## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)
- [Usage](#usage)
- [Examples](#examples)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Running a coffee machine involves managing resources, making coffee, and handling user interactions. The Coffee Machine Simulation simplifies this process by providing an interactive menu where users can choose actions such as buying coffee, refilling resources, taking money, and checking remaining resources.

## Installation

1. **Clone the Repository:** Clone this repository to your local machine using `git clone https://github.com/YourUsername/Coffee-Machine-Simulation.git`.
2. **Navigate to Directory:** Enter the project directory using `cd Coffee-Machine-Simulation`.

## Usage

1. **Run the Program:** Compile and execute the Java program, such as `javac CoffeeMachine.java` followed by `java CoffeeMachine`.
2. **Menu Options:**
   - Buy: Purchase a cup of coffee (espresso, latte, or cappuccino).
   - Fill: Refill the coffee machine's resources (water, milk, coffee beans, cups).
   - Take: Collect money from the coffee machine.
   - Remaining: View the current status of available resources.
   - Exit: Terminate the program.

## Examples

```
Write action (buy, fill, take, remaining, exit): 
> remaining

The coffee machine has:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$550 of money

Write action (buy, fill, take, remaining, exit): 
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 
> 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit): 
> remaining

The coffee machine has:
50 ml of water
465 ml of milk
100 g of coffee beans
8 disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit): 
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 
> 2
Sorry, not enough water!

Write action (buy, fill, take, remaining, exit): 
> fill

Write how many ml of water you want to add: 
> 1000
Write how many ml of milk you want to add: 
> 0
Write how many grams of coffee beans you want to add: 
> 0
Write how many disposable cups you want to add: 
> 0

Write action (buy, fill, take, remaining, exit): 
> remaining

The coffee machine has:
1050 ml of water
465 ml of milk
100 g of coffee beans
8 disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit): 
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 
> 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit): 
> take

I gave you $557

Write action (buy, fill, take, remaining, exit): 
> remaining

The coffee machine has:
1050 ml of water
465 ml of milk
100 g of coffee beans
8 disposable cups
$0 of money

Write action (buy, fill, take, remaining, exit): 
> exit
```

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to create a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

---

Experience the world of coffee machine management with the Coffee Machine Simulation. Interact with resources, brew coffee, and manage finances with ease. Dive into the world of virtual coffee-making and enjoy the experience!
