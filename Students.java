package Class16;

public class Students {
    /*
    Create a Class called Students
    Create three variables Name, ID and numberOfStudents
    Create three objects of the Students Class
    Set the Value for each studentName, studentID and increment the numberOfStudents for each object
    Print out total number of students
     */
    String name;
    String id;
    static int nmOfStudents;

    public static void main(String[] args) {
        Students nezir=new Students();
        nezir.name="Nezir";
        nezir.id="2";
        nezir.nmOfStudents++;

        Students olesea=new Students();
        olesea.name="Olesea";
        olesea.id="3";
        olesea.nmOfStudents++;
        System.out.println(Students.nmOfStudents);
    }

}
