import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
    Scanner input = new Scanner(System.in);
    Integer number;
    String name;
    HashMap<Integer, String> studentinfo = new HashMap<>();

    Student(Integer number, String name) {
        this.number = number;
        this.name = name;
        this.studentinfo.put(this.number, this.name);
    }

    public void addStudent(Integer number, String name) {
        this.number = number;
        this.name = name;
        studentinfo.put(this.number, this.name);
    }

    public void allStudentNames() {
        System.out.print("Students:");
        for (Map.Entry<Integer, String> entry : studentinfo.entrySet()) {
            System.out.print(entry.getValue()+" ");
        }
    }

    public void allStudentIndexes() {
        for (Map.Entry<Integer, String> entry : studentinfo.entrySet()) {
            System.out.print("Student indexes:");
            System.out.println(entry.getKey());
        }
    }

    public void addStudent() {
        input.nextLine();
        System.out.print("Enter name of student:");
        String name = input.nextLine();
        this.name = name;
        System.out.print("Enter index for the new student:");
        Integer number = input.nextInt();
        this.number = number;
        studentinfo.put(this.number, this.name);
        System.out.println("New student is added");
        System.out.println(studentinfo);
    }

    public void changeStudent() {
        System.out.println("Enter index of the student and new name for the student:");
        studentinfo.replace(input.nextInt(),input.next());
        System.out.println("Student new data"+studentinfo);
    }
  public void eraseElement(){
      System.out.println("Enter index of the student you want to remove:");
      Integer index=input.nextInt();
      this.number=index;
      studentinfo.remove(index);
      System.out.println("Student is removed!");
  }
}
