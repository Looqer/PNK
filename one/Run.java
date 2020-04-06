package one;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Sign humanChoiceSign = null;
        String humanChoice = "null";


        RockPaperScissors machineChoice = new RandomRockPaperScissors();

        while (humanChoice != "0") {

        System.out.println("1- paper, 2 - scissors, 3 - rock, 0 - quit");

        //player input
        Scanner in = new Scanner(System.in);
        humanChoice = in.nextLine();
        int i = Integer.parseInt(humanChoice);

        if (i == 0 || i == 1 || i == 2 || i == 3){
            switch (humanChoice) {
                case "1":
                    humanChoiceSign = Sign.PAPER;
                    break;
                case "2":
                    humanChoiceSign = Sign.SCISSORS;
                    break;
                case "3":
                    humanChoiceSign = Sign.ROCK;
                    break;
                case "0":
                    humanChoiceSign = null;
                    System.out.println("Exit game");
                    break;
            }
            machineChoice.play(humanChoiceSign);
            System.out.println("Player wins: " + machineChoice.getPlayerWins());
            System.out.println("Player loses: " + machineChoice.getMachineWins());
            System.out.println("Ties: " + machineChoice.getTies());

        }
        else {
            humanChoiceSign = null;
            System.out.println("Error - Wrong input data");
        }
    }
        System.exit(0);
    }
}
