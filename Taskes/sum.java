
import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [][]arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };
    int total=0;
    System.out.println(arr.length+" rows  "+arr[0].length+" columns" );
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            
            total+=arr[i][j];
        
        }   
    }
      System.out.println(total);
    int col = arr[0].length;
    int []colum = new int[col];
    for (int i =0; i<col;i++) {

        
    }

    }
}