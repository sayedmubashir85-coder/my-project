import java.io.File;
import java.util.Scanner;
public class lottoNum{
    public static void main(String[] args) throws Exception {
        boolean[] covered = new boolean[100]; // index 1–99 used
        Scanner input = new Scanner(new File("lotto.txt"));
        while (input.hasNextInt()) {
            int num = input.nextInt();
     if (num == 0)
                break;
            if (num >= 1 && num <= 99) {
                covered[num] = true;    }
        }
        input.close();
        // check if all numbers 1–99 are covered
        boolean allCovered = true;
        for (int i = 1; i <= 99; i++) {
            if (!covered[i]) {
                System.out.println("Missing number: " + i);
                allCovered = false;
            }
        }
        if (allCovered) {
            System.out.println("All numbers from 1 to 99 are covered!");
        } else {
            System.out.println("Not all numbers are covered.");
        }
    }
}