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
    public void setStudentDetails(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student name: ");
        this.name= scan.nextLine();
        System.out.println("Enter subject group: ");
        this.group= scan.nextLine();
        System.out.println("Enter roll: ");
        this.roll= scan.nextInt();
        System.out.println("Enter father's name: ");
        this.fatherName= scan.nextLine();
        System.out.println("Enter address: ");
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

