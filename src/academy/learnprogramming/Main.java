package academy.learnprogramming;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Goblin g= new Goblin();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                g.board[i][j] = '_';
            }
        }
        System.out.println("*****Lets Play Humans Vs.Goblins.\n Try to stay as far away from your opponent, " +
                "AVOID RANDOM HOT SPOTS*****");
        g.Play();

    }

}
