import java.util.Scanner;

public class Student {
    protected String name;
    protected int roll;
    protected String group;
    protected String institute;
    protected String fatherName;
    protected String address;

    public Student(String name, int roll, String group, String fatherName, String address, String institute){
        this.name=name;
        this.roll=roll;
        this.group=group;
        this.fatherName=fatherName;
        this.address=address;
        this.institute=institute;
    }
    public Student(){

    }
    public void setStudentDetails() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student name: ");
        this.name = scan.nextLine();
        System.out.print("Enter subject group (Write 'Science'/'Commerce'/'Arts'): ");
        this.group = scan.nextLine();
        System.out.print("Enter roll: ");
        this.roll= scan.nextInt();
        scan.nextLine();
        System.out.print("Enter institute's name: ");
        this.institute=scan.nextLine();
        System.out.print("Enter father's name: ");
        this.fatherName= scan.nextLine();
        System.out.print("Enter address: ");
        this.address= scan.nextLine();
    }

    public String getStudentName(){
        return name;
    }
    public int getStudentRoll (){
        return roll;
    }
    public String getStudentGroup (){
        return group;
    }
    public String getStudentInstitute(){return institute;}
    public String getStudentFatherName (){
        return fatherName;
    }
    public String getStudentAddress (){
        return address;
    }

    public String getStudentAllPersonalInfo (){
        return "Student's information:\n"+
                "_________________________________________________________________________\n"+
                "Name:       "+getStudentName()+"        Father's name:   "+getStudentFatherName()+"\n"+
                "Address:    "+getStudentAddress()+"\n"+
                "Roll:       "+getStudentRoll()+"\n"+
                "Group:      "+getStudentGroup()+"\n"+
                "Institute:  "+getStudentInstitute()+"\n"+
                "_________________________________________________________________________\n";
    }
}

