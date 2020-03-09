package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    PAPER,
    ROCK,
    SCISSOR;

    public RockPaperScissorHandSign getWinner() {
        if (RockPaperScissorHandSign.valueOf("PAPER") ==  PAPER){
            return ROCK;
        } else if(RockPaperScissorHandSign.valueOf("ROCK") == ROCK) {
            return PAPER;
        } else

        return SCISSOR;
    }

    public RockPaperScissorHandSign getLoser() {
        if (RockPaperScissorHandSign.valueOf("PAPER") ==  PAPER){
            return ROCK;
        } else if(RockPaperScissorHandSign.valueOf("ROCK") == ROCK) {
            return PAPER;
        } else

            return ROCK;
    }
}
