import java.util.Scanner;

public class Student {
    protected String name;
    protected int age;
    protected String id;
    protected String group;
    protected String fatherName;
    protected String address;

    /*public Student(String name, int age, String id, String group, String fatherName, String address){
        this.name=name;
        this.age=age;
        this.id=id;
        this.address=address;
        this.fatherName=fatherName;
    }*/
    public void setStudentDetails(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student name: ");
        this.name= scan.nextLine();
        System.out.println("Enter age: ");
        this.age=scan.nextInt();
        System.out.println("Enter subject group: ");
        this.group= scan.nextLine();
        System.out.println("Enter ID: ");
        this.id= scan.nextLine();
        System.out.println("Enter father's name: ");
        this.fatherName= scan.nextLine();
        System.out.println("Enter address: ");
        this.address= scan.nextLine();
    }
    public String getStudentName(){
        return name;
    }
    public int getStudentAge (){
        return age;
    }
    public String getStudentId (){
        return id;
    }
    public String getStudentGroup (){
        return group;
    }
    public String getStudentFatherName (){
        return fatherName;
    }
    public String getStudentAddress (){
        return address;
    }
}

