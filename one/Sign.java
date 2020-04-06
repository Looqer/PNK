package one;

import java.util.List;
import java.util.Random;

public enum Sign {
    ROCK,
    PAPER,
    SCISSORS;


    static List<Sign> getAll (){
        return java.util.Arrays.asList(Sign.values());
    }

    public Result getResultVs(Sign other){

        Result presentResult = null;

        switch (Sign.this){
            case ROCK:
                switch (other){
                    case ROCK:
                        presentResult = Result.TIE;
                        break;
                    case PAPER:
                        presentResult = Result.WIN;
                        break;
                    case SCISSORS:
                        presentResult = Result.LOSE;
                        break;
                }
                break;
            case PAPER:
                switch (other){
                    case ROCK:
                        presentResult = Result.LOSE;
                        break;
                    case PAPER:
                        presentResult = Result.TIE;
                        break;
                    case SCISSORS:
                        presentResult = Result.WIN;
                        break;
                }
                break;
            case SCISSORS:
                switch (other){
                    case ROCK:
                        presentResult = Result.WIN;
                        break;
                    case PAPER:
                        presentResult = Result.LOSE;
                        break;
                    case SCISSORS:
                        presentResult = Result.TIE;
                        break;
                }
                break;
        }
        System.out.println(presentResult);
        return presentResult;
    }


    static Sign getRandom(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }


    public Sign getSignWinningOver(Sign other){
        Sign winningResult = null;

        switch (other){
            case ROCK:
                winningResult = Sign.PAPER;
                break;
            case PAPER:
                winningResult = Sign.SCISSORS;
                break;
            case SCISSORS:
                winningResult = Sign.ROCK;
                break;
        }
        return winningResult;

    }






}
