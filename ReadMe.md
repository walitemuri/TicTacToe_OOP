# Project Title

TicTacToe OOP Design

## Description

This Project is a simple TicTacToe game designed to be played by 2 players using the same device and interface. The main purpose for this project was to further my understanding of OOP Design.
The program consists of three main files, Board.java, Player.java, and TicTacToeRun.Java. The two main objects used to implement the game is the Board and Player objects, the Runner file contains the main
and is responsible for facilitating the user interaction with the Objects. The main attribute variables of each Object are as follows:

Board:
* 3 * 3 integer matrix representing the squares of a tictactoe Board

Player:
* String, playerSymbol for storing if player is "X" or "O"
* Integer, currentMove for storing the current intended move of player
## Getting Started

### Dependencies

* Describe any prerequisites, libraries, OS version, etc., needed before installing and running your program.
* Windows 7, 8, 10, 13
* MacOsX Monetery
* util.Scanner Library was imported
* JDK
* Terminal

### Executing program

* How to build and run the program
* Step-by-step bullets

* First you must use gradle to build files
```
gradle build
```
* This will output the following:
```
BUILD SUCCESSFUL in 698ms
```
* Next you must run gradle run command
```
gradle run
```
* The output should be the following:
```
To run the program:
java -cp build/classes/java/main tictactoe.TicTacToeRun
```
* Finally you must copy and paste the outputed cmnd into your cmnd line
```
java -cp build/classes/java/main tictactoe.TicTacToeRun
```

## Limitations

What isn't done? What things cause errors?  

## Author Information
Name: Wali Temuri - 1183379
Contact: wtemuri@uoguelph.ca
## Development History

Keep a log of what things you accomplish when.  You can use git's tagging feature to tag the versions or you can reference commits.
* 0.3.2
    * Finished Documentation
* 0.3.1
    * Added input verification
* 0.3.0
    * Completed all class Templates
    * Methods are finished
* 0.2.1
    * Added Functions: setGameState() --Later Deleted
    * Checking Win Function started
* 0.2.0
    * Added Class: Board, Player
    * Added Functions: getSymbol(), getCurrMove(), placePiece()
    * See [commit change]() or See [release history]()
* 0.1.0
    * Initial Inception 

## Acknowledgments

Inspiration, code snippets, etc.
* [awesome-readme](https://github.com/matiassingers/awesome-readme)
* [simple-readme] (https://gist.githubusercontent.com/DomPizzie/7a5ff55ffa9081f2de27c315f5018afc/raw/d59043abbb123089ad6602aba571121b71d91d7f/README-Template.md)



