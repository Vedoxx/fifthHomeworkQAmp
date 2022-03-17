import java.util.Scanner;

public class taskTwo {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        Student student=new Student(1,"Vedad");
        int answer;
        char answerSecond;
        do {
            System.out.println("1-View all names of students:");
            System.out.println("2-Vies all indexes of students");
            System.out.println("3-Add new student to hash map");
            System.out.println("4-Change existing students");
            System.out.println("5-Erase existing students");
            System.out.println("6-EXIT");
            System.out.print("Your answer:");
            answer = object.nextInt();
            if (answer == 1) {
                student.allStudentNames();
            }
            if (answer == 2) {
                student.allStudentIndexes();
            }
            if (answer == 3) {
                student.addStudent();
            }
            if(answer==4){
                student.changeStudent();
            }
            if(answer==5){
                student.eraseElement();
            }
            if (answer == 6) {
                System.exit(0);
            }
            System.out.print("Would you like to continue(y/n):");
            answerSecond=object.next().charAt(0);
        }while(answerSecond=='Y' || answerSecond=='y');
    }



}
