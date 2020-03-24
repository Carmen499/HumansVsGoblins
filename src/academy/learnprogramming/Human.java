package academy.learnprogramming;

public class Human extends Goblin {




    public  boolean GameOver(int rMove, int cMove) {

        //Check for a "lost" based on HOT SPOTS on the grid.
        return (board[rMove][cMove].equals(board[1][1])) || (board[rMove][cMove].equals(board[1][2]))
                || (board[rMove][cMove].equals(board[2][2]))
                || (board[rMove][cMove].equals(board[2][1]));
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
