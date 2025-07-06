import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String choice = "yes";
        System.out.println("Welcome to the Student Management System");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students that you want to enter their Info ");
        int n = in.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Do you want to enter a student Information");
            System.out.println("Enter Yes to enter a student info ");
            System.out.println("Enter No to Stop");

            String userChoice = in.nextLine();
            if (userChoice.equalsIgnoreCase("no")) {
                break;
            }
            in.nextLine();
            System.out.println("Enter the student's name");
            String name = in.nextLine();
            System.out.println("Enter the student's roll_number");
            int roll_number = in.nextInt();
            System.out.println("Enter the student's class or Standard");
            int standard = in.nextInt();
            System.out.println("Enter the student's marks in Physics");
            double physicsMarks = in.nextDouble();
            System.out.println("Enter the student's marks in mathsMarks");
            double mathsMarks = in.nextDouble();
            System.out.println("Enter the student's marks in computerMarks");
            double computerMarks = in.nextDouble();

            students[i] = new Student(name, roll_number, standard, physicsMarks, mathsMarks, computerMarks);

            System.out.println("Student info " + "name - " + students[i].getName() + " standard - " + students[i].getStandard() + " roll number" + students[i].getRoll_number() + " physics marks " + students[i].getPhysicsMarks() + " maths marks - " + students[i].getMathsMarks() + " computer marks" + students[i].getComputerMarks());
            in.nextLine();
            System.out.println("Do you want to change its Name ");
            System.out.println("Enter Yes to change and No for Not changing");

            String nameChoice = in.nextLine();
            if (nameChoice.equalsIgnoreCase("yes")) {
                System.out.println("Enter the name");
                String changedName = in.nextLine();
                students[i].nameUpdate(changedName);
            }


            System.out.println("Updated Student info " + "name - " + students[i].getName() + "standard - " + students[i].getStandard() + " roll number" + students[i].getRoll_number() + "physics marks " + students[i].getPhysicsMarks() + "maths marks - " + students[i].getMathsMarks() + "computer marks" + students[i].getComputerMarks());

            students[i].averageMarks(students[i]);

            System.out.println("Do you want to delete any Student Object ");
            System.out.println("Enter Yes for Deleting or No for not deleting ");
            String delChoice = in.nextLine();
            if (delChoice.equalsIgnoreCase("yes")) {
                System.out.println("Enter the student's name");
                String studentName = in.nextLine();
                deleteStudent(students, studentName);

            }



        }

        for (int j = 0 ; j < students.length;j++){
            if(students[j] == null){
                continue;
            }
            System.out.println("Updated Student info " + " name - " + students[j].getName() + " standard - " + students[j].getStandard() + " roll number" + students[j].getRoll_number() + " physics marks " + students[j].getPhysicsMarks() + " maths marks - " + students[j].getMathsMarks() + " computer marks" + students[j].getComputerMarks());
        }





    }

    public static void deleteStudent(Student[] students, String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getName().equalsIgnoreCase(name)) {
                students[i] = null;
                System.out.println("Student Object" + name + "Deleted");
                break;
            }

//            if (i == students.length - 1) {
//                System.out.println("That requested person is not employed at this firm.");
//            }

        }
    }
}