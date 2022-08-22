import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int [] a = {2,4,6,8,10,12,14,16,18,20};
        int [] b = {1,3,4,7,10,11,12,14,17,20};
        // Declaring 2 arrays containing different integers
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        // Converting the arrays to strings so they can be printed outside the loop

        for (int x : a) {
            for (int y : b) {
                if (x == y)
                    System.out.println("a[] and b[] both contain " + x);
            }
        }
        // Nested for loop to compare both arrays and then if any value is the same in both it is printed out on a seperate line

    }
}
