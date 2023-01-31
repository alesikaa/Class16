package Class16;

public class StudentTester {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="Olesea";
        student.id="123";
        student.age=22;
        student.weight=60;
        student.schoolName="Syntax";

        Student student1=new Student();
        student1.name="Diana";
        student1.id="163";
        student1.age=36;
        student1.weight=65;
       // student1.schoolName="Syntax";

       Student student2=new Student();
        student2.name="Mary";
        student2.id="457";
        student2.age=29;
        student2.weight=70;
       student2.schoolName="Syntax";


        System.out.println( student2.schoolName);
        System.out.println(student2.name);
    }
}
