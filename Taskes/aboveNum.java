import java.util.Scanner;

public class aboveNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[100];
        double sum = 0;

        // Read 100 numbers
        for (int i = 0; i < 100; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        // Calculate average
        double average = sum / 100;

        // Count numbers above average
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

        // Display results
        System.out.println("Average = " + average);
        System.out.println("Numbers above average = " + count);

        input.close();
    }
}