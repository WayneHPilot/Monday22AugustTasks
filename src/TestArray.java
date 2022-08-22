public class TestArray {
    public static void main(String[] args) {
            int[] numbers = {2,4,6,8,10,12,14,16,18,20};
            int sum = 0;
            int length = numbers.length;
            // Declaring int values as well as the array values

            for(int i = 0; i < numbers.length; i++){
                numbers[i] += sum;
                sum = numbers[i];
            }
            // for loop to go through each value and add it to the next value in the array
        System.out.println("The sum of all numbers in the array is: " +sum);

            //prints out the sum of all numbers in the array

        double average = sum / length;
            // declared outside the sum loop, else it will just divide 0 by 10
        System.out.println("The average of all numbers in the array is: " +average);
            // prints out the average of all numbers of the array
                }


}
