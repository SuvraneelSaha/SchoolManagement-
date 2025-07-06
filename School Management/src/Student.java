public class Student {

    private String name ;
    private int roll_number ;
    private int standard ;
    private double physicsMarks;
    private double mathsMarks;
    private double computerMarks;

    public double getPhysicsMarks() {
        return physicsMarks;
    }

    public double getMathsMarks() {
        return mathsMarks;
    }

    public double getComputerMarks() {
        return computerMarks;
    }

    public Student(String name, int roll_number, int standard, double physicsMarks, double mathsMarks, double computerMarks) {
        this.name = name;
        this.roll_number = roll_number;
        this.standard = standard;
        this.physicsMarks = physicsMarks;
        this.mathsMarks = mathsMarks;
        this.computerMarks = computerMarks;
    }

    public String getName() {
        return name;
    }

    public int getRoll_number() {
        return roll_number;
    }


    public int getStandard() {
        return standard;
    }

    public Student nameUpdate(String name){
        this.name = name; ;
        return this;
    }

    public void averageMarks(Student student){
        double avg =  (student.getPhysicsMarks() + student.getMathsMarks() + student.getComputerMarks() ) /3 ;
        System.out.println("Average Marks : " + String.format("%.2f", avg));
    }



}
