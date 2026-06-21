import java.util.Random;

public class RandomLettersCount {
    public static void main(String[] args) {

        char[] letters = new char[100];
        int[] count = new int[26];

        Random rand = new Random();

      
        for (int i = 0; i < 100; i++) {
            letters[i] = (char) ('a' + rand.nextInt(26));
            count[letters[i] - 'a']++;
        }

        System.out.println("Generated letters:");
        for (int i = 0; i < 100; i++) {
            System.out.print(letters[i] + " ");
        }

        System.out.println("Letter counts:");

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char)(i + 'a') + " = " + count[i]);
            }
        }
    }
}