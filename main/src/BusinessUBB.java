import java.util.ArrayList;
import java.util.List;

public class BusinessUBB {
    Student UBBStudent;
    Fee UBBFee;


    //     O sa contina o lista de studenti
//     o sa avem metoda pay
//
    private List<Student> studentList = new ArrayList<Student>();


    private void setStudentList() {


        Student a1 = new Student(0001, "Ioan", "Popescu", 1);
        Student a2 = new Student(0002, "Dragos", "Popa", 1);
        Student a3 = new Student(0003, "Emanuel", "Tanasa", 3);
        studentList.add(a1);
        studentList.add(a2);
        studentList.add(a3);
    }
}

