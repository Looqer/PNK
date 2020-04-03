public enum Sign {
    ROCK,
    PAPER,
    SCISSORS


    static Sign[] getAll (){
        Sign[] signsAll = new Sign[]{Sign.ROCK, Sign.PAPER, Sign.SCISSORS};
        return signsAll;
    }

    Result getResultVs(Sign other){
        Result presentResult = Result.WIN;
        return presentResult;
    }

    static Sign getRandom(){
        Sign randomSign = Sign.PAPER;
        return randomSign;
    }

    static Sign getSignWinningOver(Sign other){
        Sign signWinningOver = Sign.PAPER;
        return signWinningOver;
    }



}
