

public class studentsAnswer{
    public static void main(String[] args) {
       circle c1 = new circle();
    
       System.out.println(c1.getarea());
        char [][] answers = {
            {'A','D','D','B'},
            {'D','A','C','A'},
            {'A','C','B','A'},
            {'B','C','C','A'},
            {'A','C','D','A'}};
            char [] keys  = {'A','C','B','A'};
            for (int i = 0; i < answers.length; i++) {
                int count = 0;
                for (int j = 0; j < answers[i].length; j++) {
                    if(answers[i][j]==keys[j]){
                        count++;

                    }
                    
                }

                System.out.println("students: "    +i + "  correct:  "+count);
            }
        
        
    }
}
