package academy.learnprogramming;


public class Land {


    public static char [][] board = new char[4][4];


    public void PrintBoard() {
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                if (j == 0)                // This give me an "| " on the left had side when the loop starts from 0
                {
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " | ");

            }
        }
        System.out.println();

    }




}


