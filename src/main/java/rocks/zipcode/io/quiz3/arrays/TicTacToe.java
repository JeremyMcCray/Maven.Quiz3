package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;
    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String[] answer = {board[value][0],board[value][1],board[value][2]};

        return answer;
    }

    public String[] getColumn(Integer value) {
        String[] answer = {board[0][value],board[1][value],board[2][value]};

        return answer;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        if(board[rowIndex][1].equals(board[rowIndex][0]) && board[rowIndex][2].equals(board[rowIndex][0])){
        return true;
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        if(board[1][columnIndex].equals(board[0][columnIndex]) && board[2][columnIndex].equals(board[0][columnIndex])){
            return true;
        }
        return false;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return this.board;
    }
}
