package academy.learnprogramming;


public class Main {


    public static void main(String[] args) {

        Goblin g= new Goblin();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                g.board[i][j] = "_";
            }
        }
        System.out.println("*****Lets Play Humans \"♀\" Vs Goblins \uD83D\uDE31");
        System.out.println("As you try to move closer to the opponent, avoid random HotSpots on the GRID!" +
                "\nThis will result into an automatic GAME OVER!");


        g.Play();

    }

}
