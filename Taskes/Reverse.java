import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Straight : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        // Second loop: reverse order
        System.out.println("Reverse r:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}