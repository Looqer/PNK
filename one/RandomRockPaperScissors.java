package one;

public class RandomRockPaperScissors extends RockPaperScissors {

    public void play(Sign player){
        Sign aichoice = Sign.getRandom();
        Sign playerchoice = Sign.PAPER;

        System.out.println(Sign.getRandom().toString());

        this.updateStats(aichoice.getResultVs(playerchoice));

    }
}
