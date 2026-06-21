public class shuffaling{
    public static void main(String[] args) {
        int [][]arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}

        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
int i1 = (int)(Math.random()*arr.length);
int j1 = (int)(Math.random()*arr[i].length);
int temp = arr[i][j];
arr[i][j]=arr[i1][j1];
arr[i1][j1]=temp;
                
            }
            
        }
    }
}