package wildcodeschool.quests.Java04.Arrays_and_iteration;

public class Movies {

    // You can run this code in: https://www.jdoodle.com/online-java-compiler/

    public static void main(String[] args) {

        // Initialization of an one-dimensional array containing the movie names
        String[] movies = {"Indiana Jones and the Temple of Doom",
                "Indiana Jones and the Last Crusade",
                "Indiana Jones and the Kingdom of the Crystal Skull"};

        // Initialization of a two-dimensional array containing the actors names
        String[][] actors = {{"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"},
                {"Harrison Ford", "Sean Connery", "Denholm Elliott"},
                {"Harrison Ford", "Cate Blanchett", "Karen Allen"}};

        // Declaration of the row-counter
        int iRowCount;
        // Definition of the loop to iterate through the array containing the movie names
        for (iRowCount = 0; iRowCount < movies.length; iRowCount++){
            System.out.print("In the movie: " + movies[iRowCount] + ", the main actors are: ");
            // Definition of the loop to iterate through the array containing the actors names
            for (int iColCount = 0; iColCount < actors[0].length; iColCount++){
                if (iColCount < actors[0].length - 1) {
                    System.out.print(actors[iRowCount][iColCount] + ", ");
                } else {
                    System.out.print(actors[iRowCount][iColCount] + ".");
                }
            }
            System.out.println();
        }

        // Lösung von Christiane
        int i = 0;
        System.out.println("Lösung von Christiane: ");
        for (String movie : movies) {
            System.out.println("In the movie " + movie + ", the main actors are: " + String.join(", ", actors[i]));
            i++;
        }

        /* Bisl weniger kompliziert
        for (int iCount = 0; iCount < movies.length; iCount++){
            System.out.println("In the movie: " + movies[iCount] + ", the main actors are: " +
                        actors[iCount][0] + ", " + actors[iCount][1] + "and " + actors[iCount][2] );
        }
        */
    }
}

