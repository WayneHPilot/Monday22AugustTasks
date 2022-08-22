import java.util.*;

public class MaxAndMin {

    public static void main(String[] args) {
        Random rand = new Random();
        int [] random = new int[10];
        int max = 0;
        int min = random[0];
        // declaring the random function, as well as the array and the max and min variables

        for (int i = 0; i < 10; i++){
            int randNum = rand.nextInt(10)+1;
            random[i] = randNum;

            if (i == 0) System.out.print("[");

            System.out.print(random[i] + " ");

            if (i==9) System.out.print("]");

            if (randNum>max) {
                max = randNum;
            }
            if (i > 0){
                if (randNum < random[0]){
                    min = randNum;
                }
            // This statement compares the random values in the array and if they meet the min and max conditions they are assigned to min and max
            }
        }

        System.out.println("");
        System.out.println("Minimum value in the array is: " +min);
        System.out.println("Maximum value in the array is: " +max);
        // prints out the min and max values in 2 seperate lines

    }
}
