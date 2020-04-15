package one;

import java.io.*;
import java.util.ArrayList;

public class SmarterRockPaperScissors extends RockPaperScissors {

    Result oldResult = null;
    int iteration = 0, pattern = 0, patternP, patternS, patternR;
    Sign aichoice;
    public static ArrayList<Sign> mySignList = new ArrayList<>();
    Sign[] playerSignList = new Sign[4];

    @Override
    public void play(Sign player) {

        pattern = 0;
        patternR = 0;
        patternP = 0;
        patternS = 0;

        if (iteration == 0) {
            try {
                FileInputStream fileIn = new FileInputStream("D:\\test\\test.ser");
                ObjectInputStream ins = new ObjectInputStream(fileIn);
                SmarterRockPaperScissors.mySignList = (ArrayList<Sign>) ins.readObject();
                ins.close();
                fileIn.close();
            } catch (IOException i) {
                i.printStackTrace();
            } catch (ClassNotFoundException c) {
                System.out.println("Sign file not found");
                c.printStackTrace();
            }
        } // load sign array

        playerSignList[0] = playerSignList[1];
        playerSignList[1] = playerSignList[2];
        playerSignList[2] = playerSignList[3];
        playerSignList[3] = player;


        System.out.println("msl: " + mySignList.size());
        if (mySignList.size() < 5 || iteration < 4) {
            System.out.println("Not enough data");
        } else {
            System.out.println(playerSignList[0].toString() + "*" + playerSignList[1].toString() + "*" + playerSignList[2].toString() + "*" + playerSignList[3].toString());
        }

        aichoice = Sign.getRandom();

        for (int i = 0; i < mySignList.size() - 3; i++) {
            if (playerSignList[0] == mySignList.get(i) && playerSignList[1] == mySignList.get(i + 1) && playerSignList[2] == mySignList.get(i + 2) && playerSignList[3] == mySignList.get(i + 3)) {
                if ((i + 4) < mySignList.size()) {
                    System.out.println("pattern 4: " + (i + 1));
                    pattern++;
                    System.out.println("win by " + aichoice.getSignWinningOver(mySignList.get(i + 4)).toString());
                    if (aichoice.getSignWinningOver(mySignList.get(i + 4)) == Sign.PAPER) {
                        patternP++;
                        if (patternP > patternR && patternP > patternS) {
                            aichoice = Sign.PAPER;
                        }
                    } else if (aichoice.getSignWinningOver(mySignList.get(i + 4)) == Sign.SCISSORS) {
                        patternS++;
                        if (patternS > patternP && patternS > patternR) {
                            aichoice = Sign.SCISSORS;
                        }
                    } else if (aichoice.getSignWinningOver(mySignList.get(i + 4)) == Sign.ROCK) {
                        patternR++;
                        if (patternR > patternP && patternR > patternS) {
                            aichoice = Sign.ROCK;
                        }
                    }
                }
            }
            else {
                    pattern = 0;
                }
        }
        if (pattern == 0) {
            for (int i = 0; i < mySignList.size() - 2; i++) {
                if (playerSignList[1] == mySignList.get(i) && playerSignList[2] == mySignList.get(i + 1) && playerSignList[3] == mySignList.get(i + 2)) {
                    if ((i + 3) < mySignList.size()) {
                        System.out.println("pattern 3: " + (i + 1));
                        pattern++;
                        System.out.println("win by " + aichoice.getSignWinningOver(mySignList.get(i + 3)).toString());
                        if (aichoice.getSignWinningOver(mySignList.get(i + 3)) == Sign.PAPER) {
                            patternP++;
                            if (patternP > patternR && patternP > patternS) {
                                aichoice = Sign.PAPER;
                            }
                        } else if (aichoice.getSignWinningOver(mySignList.get(i + 3)) == Sign.SCISSORS) {
                            patternS++;
                            if (patternS > patternP && patternS > patternR) {
                                aichoice = Sign.SCISSORS;
                            }
                        } else if (aichoice.getSignWinningOver(mySignList.get(i + 3)) == Sign.ROCK) {
                            patternR++;
                            if (patternR > patternP && patternR > patternS) {
                                aichoice = Sign.ROCK;
                            }
                        }
                    }
                }
                else {
                    pattern = 0;
                }
            }
        }

        if (pattern == 0) {
            for (int i = 0; i < mySignList.size() - 1; i++) {
                if (playerSignList[2] == mySignList.get(i) && playerSignList[3] == mySignList.get(i + 1)) {
                    if ((i + 2) < mySignList.size()) {
                        System.out.println("pattern 2: " + (i + 1));
                        pattern++;
                        System.out.println("win by " + aichoice.getSignWinningOver(mySignList.get(i + 2)).toString());
                        if (aichoice.getSignWinningOver(mySignList.get(i + 2)) == Sign.PAPER) {
                            patternP++;
                            if (patternP > patternR && patternP > patternS) {
                                aichoice = Sign.PAPER;
                            }
                        } else if (aichoice.getSignWinningOver(mySignList.get(i + 2)) == Sign.SCISSORS) {
                            patternS++;
                            if (patternS > patternP && patternS > patternR) {
                                aichoice = Sign.SCISSORS;
                            }
                        } else if (aichoice.getSignWinningOver(mySignList.get(i + 2)) == Sign.ROCK) {
                            patternR++;
                            if (patternR > patternP && patternR > patternS) {
                                aichoice = Sign.ROCK;
                            }
                        }
                    }
                }
                else {
                    pattern = 0;
                }
            }
        }

        if (pattern == 0) {
            for (int i = 0; i < mySignList.size(); i++) {
                if (playerSignList[3] == mySignList.get(i)) {

                    if ((i + 1) < mySignList.size()) {
                        System.out.println("pattern 1: " + (i + 1));
                        pattern++;
                        System.out.println("win by " + aichoice.getSignWinningOver(mySignList.get(i + 1)).toString());
                        if (aichoice.getSignWinningOver(mySignList.get(i + 1)) == Sign.PAPER) {
                            patternP++;
                            if (patternP > patternR && patternP > patternS) {
                                aichoice = Sign.PAPER;
                            }
                        } else if (aichoice.getSignWinningOver(mySignList.get(i + 1)) == Sign.SCISSORS) {
                            patternS++;
                            if (patternS > patternP && patternS > patternR) {
                                aichoice = Sign.SCISSORS;
                            }
                        } else if (aichoice.getSignWinningOver(mySignList.get(i + 1)) == Sign.ROCK) {
                            patternR++;
                            if (patternR > patternP && patternR > patternS) {
                                aichoice = Sign.ROCK;
                            }
                        }
                    }
                }
            }


            Sign playerchoice = player;

            mySignList.add(player);
            System.out.println(mySignList.get(iteration));

            System.out.println("human: " + playerchoice.toString());
            System.out.println("machine: " + aichoice.toString());

            System.out.println(SmarterRockPaperScissors.mySignList);

            oldResult = aichoice.getResultVs(playerchoice);
            this.updateStats(oldResult);


            iteration++;
            System.out.println(iteration);


            try {
                FileOutputStream fileOut = new FileOutputStream("D:\\test\\test.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(SmarterRockPaperScissors.mySignList);
                out.close();
                fileOut.close();
                System.out.println("Serialized data is saved in test folder");
            } catch (IOException i) {
                i.printStackTrace();
            }


        }
    }
}
