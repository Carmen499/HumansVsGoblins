package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {




        String myLand [][] = {{"[]", "[]", "[]",},
                { "[]", "[]", "[]"},
                {"[]", "[]", "[]"}};

        for (int rows = 0; rows < 3; rows++){         // iterating through the rows
            System.out.println();
            for(int columns = 0; columns < 3; columns++){
                System.out.print( myLand[rows][columns] + " ");  // iterating through the columns
            }
        }


    }

}
