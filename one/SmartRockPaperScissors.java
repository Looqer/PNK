package one;

public class SmartRockPaperScissors extends RockPaperScissors {

    Result oldResult = null;
    Sign aichoice, lastAiChoice, oldPlayerChoice;

    @Override
    public void play(Sign player) {

        if (oldResult == null || oldResult == Result.TIE){
            aichoice = Sign.getRandom();
        }

        else if (oldResult == Result.WIN){

            aichoice = aichoice.getSignWinningOver(oldPlayerChoice);

        }

        else if (oldResult == Result.LOSE){

            switch (oldPlayerChoice){
                case ROCK:
                    aichoice = Sign.SCISSORS;
                    break;
                case PAPER:
                    aichoice = Sign.ROCK;
                    break;
                case SCISSORS:
                    aichoice = Sign.PAPER;
                    break;
            }

        }

        Sign playerchoice = player;
        oldPlayerChoice = player;

        System.out.println("human: " + playerchoice.toString());
        System.out.println("machine: " + aichoice.toString());

        oldResult = aichoice.getResultVs(playerchoice);
        this.updateStats(oldResult);
        lastAiChoice = aichoice;
    }
}
