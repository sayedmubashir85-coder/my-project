public class Course {
   private String courseName;
   private String[] students = new String[55];
    private int numberOfStudents;
    public Course(String courseName) {
      this.courseName = courseName;
   }
   public void addStudent(String student) { 
          students[numberOfStudents] = student;
     numberOfStudents++; 
      }
   public String[] getStudents() { 
     return students;
   }

    public int getNumofstudents() { 
     return numberOfStudents;
 }

    public String getCourseName() {
          return courseName;
   }
  public void OutStudent(String student) { 
}
 }
