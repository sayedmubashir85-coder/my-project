public class circle{
    static final double PI = Math.PI;
     double radius =2;
    static int numobj=0;
    circle(){
        numobj++;
    
    

    }
public double getarea(){
    return radius*radius*PI;
}
public static void numobj(){
    System.out.println(  numobj    );
}
}
