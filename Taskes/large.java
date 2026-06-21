


public class large{
    public static void main(String[] args) {
        int [] elements={1,2,3,4,5};
        int campare=0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i]>campare) 
                campare =elements[i];
                
            
            
        }
System.out.println("the largest number is :"+campare);

    }
}