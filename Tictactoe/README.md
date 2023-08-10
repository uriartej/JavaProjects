# Simple Tic-Tac-Toe Game (Java)

Welcome to the Simple Tic-Tac-Toe Game! This Java program allows two players to enjoy the classic game of tic-tac-toe. Players take turns marking cells on the grid with "X" or "O" until one player wins or the game ends in a draw.

## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)
- [Usage](#usage)
- [Examples](#examples)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Experience the thrill of the timeless tic-tac-toe game with this Java application. Players alternate making moves on the grid, aiming to form a line of their symbol ("X" or "O") horizontally, vertically, or diagonally. The game continues until a player wins or the grid is filled, resulting in a draw.

## Installation

1. **Clone the Repository:** Clone this repository to your local machine using `git clone https://github.com/YourUsername/Simple-Tic-Tac-Toe.git`.
2. **Navigate to Directory:** Enter the project directory using `cd Simple-Tic-Tac-Toe`.

## Usage

1. **Run the Program:** Compile and execute the Java program, such as `javac TicTacToe.java` followed by `java TicTacToe`.
2. **Gameplay:**
   - Players take turns entering the coordinates of the cell they want to mark (e.g., `1 1`).
   - The program validates the move and updates the grid accordingly.
   - The game ends when one player wins or the grid is full.
   - The final result (win, draw, or ongoing) is displayed at the end.

## Examples

```
---------
|       |
|       |
|       |
---------
> 2 2
---------
|       |
|   X   |
|       |
---------
> 2 2
This cell is occupied! Choose another one!
> two two
You should enter numbers!
> 1 4
Coordinates should be from 1 to 3!
> 1 1
---------
| O     |
|   X   |
|       |
---------
> 3 3
---------
| O     |
|   X   |
|     X |
---------
> 2 1
---------
| O     |
| O X   |
|     X |
---------
> 3 1
---------
| O     |
| O X   |
| X   X |
---------
> 2 3
---------
| O     |
| O X O |
| X   X |
---------
> 3 2
---------
| O     |
| O X O |
| X X X |
---------
X wins
```

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to create a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

---

Engage in a game of strategy and wits with the Simple Tic-Tac-Toe Game. Experience the excitement of competing against a friend in the classic game of tic-tac-toe. Sharpen your skills and emerge victorious in this timeless battle of Xs and Os!
