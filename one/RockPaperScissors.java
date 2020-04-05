package one;

abstract class RockPaperScissors {

    int aiwins = 0, aities = 0, ailoses = 0;

    public void updateStats(Result oldResult){
        switch(oldResult){
            case WIN:
                ailoses += 1;
                break;
            case TIE:
                aities += 1;
                break;
            case LOSE:
                aiwins += 1;
                break;
        }

    }

    public int getPlayerWins(){
        return ailoses;
    }

    public int getTies(){
        return aities;
    }

    public int getMachineWins(){
        return aiwins;
    }

    public void printMachineChoice(){
        System.out.println(Sign.getRandom().toString());
    }

    abstract void play(Sign player);





}
