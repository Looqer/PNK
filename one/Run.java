package one;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Run {

    public static void main(String[] args) {

        Sign humanChoiceSign = null;
        String humanChoice = "null";

        /* --Other game modes are commented-- */
        
        //RockPaperScissors machineChoice = new RandomRockPaperScissors();
        //RockPaperScissors machineChoice = new SmartRockPaperScissors();
        RockPaperScissors machineChoice = new SmarterRockPaperScissors();

        while (humanChoice != "0") {

        System.out.println("1- paper, 2 - scissors, 3 - rock, 0 - quit");

        //player input
        Scanner in = new Scanner(System.in);
        humanChoice = in.nextLine();

        if(humanChoice.equals("0") || humanChoice.equals("1") || humanChoice.equals("2") || humanChoice.equals("3")) {

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
                        System.exit(0);
                        break;
                }


                machineChoice.play(humanChoiceSign);
                System.out.println("Player wins: " + machineChoice.getPlayerWins());
                System.out.println("Player loses: " + machineChoice.getMachineWins());
                System.out.println("Ties: " + machineChoice.getTies());
                System.out.println("----------------");

                //System.out.println(SmarterRockPaperScissors.mySignList);
                //System.out.println(SmarterRockPaperScissors.mySignList.get(0));





        }

        else {
            System.out.println("Error - Wrong input data");
        }

    }

    }
}
