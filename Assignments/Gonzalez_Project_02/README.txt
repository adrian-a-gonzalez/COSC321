Program was created by Adrian A. Gonzalez
On November 14, 2023
Written on Visual Studio Code

Inputs can be a number, a new line character via the Enter key,
the user can input any other characters but will be read as invalid.

Player 1 starts with being asked a number between 0 and 99.

Player 2 will then be prompted to enter in a 2 digit value
(it can be single digit if the player presses the Enter key
after entering the first digit).

The program will then parse the values of the guess since it's implied
that the user will put in a int value. If at any point either of the digits
are not integers, the program will output "Invalid input." and then need
to put another input in.


After doing math:

• if the guess is greater than the number, they will be told
that their guess is too high and need to put in another value

• if the guess is less than the number, they be told so and will
need to plug another number in

• if the guess equates the number, they be told that they win along
with how many guesses it took


After 5 incorrect guesses, player 2 will be told that they lost
along with the correct answer.


*BONUS*

The user will finally be asked if they want to play again, answerring
with a lowercase y will result in a new game being played, else if
any other value is found, the program will end.