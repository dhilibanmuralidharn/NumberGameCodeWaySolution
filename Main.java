import java.util.*;


class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int numberOfRounds = 1;

        while (numberOfRounds <= 5){
            int generatedNumber = random.nextInt(1, 101);
            int attempts = 0;
            int attemptLimit = 5;

            System.out.println("Round " + numberOfRounds);
            System.out.println("Guess a number between 1 and 100.");
            System.out.println(generatedNumber);

            while (attempts < attemptLimit){
                System.out.println("Enter your guess: ");
                int userGuess = input.nextInt();
                attempts++;

                if (userGuess < generatedNumber){
                    System.out.println("Too Low! Try again.");
                } else if (userGuess > generatedNumber) {
                    System.out.println("Too High! Try again.");
                }else {
                    System.out.println("Congratulation! You Guessed the Correct Number: " + generatedNumber);
                    System.out.println("It took you " + attempts + " attempts.");
                    score += attempts;
                    break;
                }
                if (attempts == attemptLimit) {
                    System.out.println("You didn't guess the correct number within the limit if "+ attemptLimit + " attempts");
                    System.out.println("The correct number was: " + generatedNumber);
                }
            }
            numberOfRounds++;
        }
        System.out.println("Your total score is: " + score);
        System.out.println("Thanks for playing");
        input.close();
    }
}