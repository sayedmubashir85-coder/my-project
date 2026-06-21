

public class StringMethodes{
    public static void main(String[] args) {
        String text ="java is better";
    System.out.println("replacing"+text.replace('a', 'A'));
    System.out.println("replace all"+text.replaceAll("better", "great"));

//spliting
    String fruits= "apple=grapes=mango";
String[]arr = fruits.split("=");
System.out.println("spliting: ");
for (String fruit : arr) {
    System.out.println(fruit);
    
}
    }
}