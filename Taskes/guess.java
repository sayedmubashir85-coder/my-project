import java.util.Scanner;
public class guess{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = (int)(Math.random()*50);
        System.out.println("enter your guess between 1 to 50");
        int guess=0;
        while (num!=guess) {
             guess=scn.nextInt();
            if (num==guess) {
               
                System.out.println("congraturlation you guess is right. you win");               
            }else if (num>guess) {System.out.println("your guess is lower");
                
            }else if (num<guess) {System.out.println("your guess is higher ");
                
            }else if (guess>=50||guess<=1) {
                System.out.println("invaild numbber");
                
            }
        
            
        }
    }
}