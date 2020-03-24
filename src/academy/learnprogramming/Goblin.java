package academy.learnprogramming;


import java.util.Scanner;



public class Goblin extends Land  {

    public int row;
    public int col;
    public Scanner scan = new Scanner(System.in);
    public String[][] board = new String[4][4];
    public  String turn = "\uD83D\uDE31";

   /*// public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = "_";
            }
        }
        Play();

    }*/

    public  void Play() {
        boolean playing = true;
        PrintBoard();
        while (playing) {
            System.out.println("Please enter a row and a column: \nBe careful of the random HotSpots on the board! \nThis would be considered an automatic GAME OVER!  ");

            try {
                row = scan.nextInt() - 1;   // starting the count from 1 and not 0
                col = scan.nextInt() - 1;
                board[row][col] = turn;
            }catch (Exception e){
                System.out.println("Invalid Option...");
                scan.nextInt();
            }

            if ((GameOver(row, col))) {
                playing = false;
                System.out.println(turn + " landed on a HOTSPOT near the opponent, " + turn + " LOSE!!! \n***** GAME OVER *****");
            }

            PrintBoard();
            if (turn.equals("\uD83D\uDE31")) {          //Goblin

                turn = "♀";    //Human lady
            } else {
                turn = "\uD83D\uDE31";           //Goblin

            }
        }
    }

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



    public  boolean GameOver(int rMove, int cMove) {

        //Check for a "lost" based on HOT SPOTS on the grid.
        return (board[rMove][cMove].equals(board[1][1])) || (board[rMove][cMove].equals(board[1][2]))
                || (board[rMove][cMove].equals(board[2][2]))
                || (board[rMove][cMove].equals(board[2][1]));


    }

    }








