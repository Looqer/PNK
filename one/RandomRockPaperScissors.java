package one;

public class RandomRockPaperScissors extends RockPaperScissors {

    public void play(Sign player){

        Sign aichoice = Sign.getRandom();
        Sign playerchoice = player;

        System.out.println("human: " + playerchoice.toString());
        System.out.println("machine: " + aichoice.toString());

        this.updateStats(aichoice.getResultVs(playerchoice));

    }
}
