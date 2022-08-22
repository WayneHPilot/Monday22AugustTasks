import java.util.Objects;
import java.util.Scanner;

public class ExistinArray {
    public static void main(String[] args) {
    boolean found = false;
    int search = 0;
    // declaring variables to be used
    Scanner exist = new Scanner(System.in);
    int [] numbers = {0,2,4,6,8,10,12,14,16,18,20};
    // array full of numbers

        System.out.print("Please enter a number: ");
        search = exist.nextInt();
        // asks user to input a value and then declaring search as the next integer

        for(int i = 0; i< numbers.length; i++ ){
            if(numbers[i]==(search)){
                System.out.println("It's in the array, at position " +i);
                found=true;
                 }
            // for loop to search the array and find if the number entered matches any value in the array and prints out if it is and at what position
        }
        if(!found)
            System.out.println("Number does not exist in array!");
    }
        // if no value is matched, then this is printed out instead
}
