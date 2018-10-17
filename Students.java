import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Students {

    private String name;
    private String fName;
    private long contact;
    private double cgpa;
    public Students(){}
    public Students(String name, String fName, long contact, double cgpa) {
        this.name = name;
        this.fName = fName;
        this.contact = contact;
        this.cgpa = cgpa;
    }
    public Students(String name){
        this.name=name;
    }

//    List<Students> student = new LinkedList<Students>();
    public void addStudents(Students students){
//       student.add(new Students("Ahsan","Anwer",053513,3.34));
       student.add();

    }
    public void removeStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Naame of Student That You Want To Delete");
        String dName = scanner.nextLine();


        if(dName.equalsIgnoreCase(student.)
    }
}
