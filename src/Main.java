import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Student student = new Student("Avijit Paul",459856,"Science", "Prof. Kanai Paul","Rangpur",
                "American International University Bangladesh");
        ScienceGroup s = new ScienceGroup(87,87,67,87,98,90,89);
        CommerceGroup c = new CommerceGroup(87,89,67,87,77,99,78);
        ArtsGroup a = new ArtsGroup(77,88,99,87,98,78,98);

        WriteStuInfo resultWriter = new WriteStuInfo();
        ReadStuInfo resultReader = new ReadStuInfo();

        System.out.println(student.getStudentAllPersonalInfo());
        System.out.print(a.getResult());

        //System.out.println("Writing start..");
        resultWriter.writer(student.getStudentRoll(),student.getStudentAllPersonalInfo(),a.getResult());
        // System.out.println("Writing successful!");
        //System.out.println("Reading start");
        System.out.println("\n");
        resultReader.reader(student.getStudentRoll());
        //System.out.println("Reading successful.");*/      //For testing the code.

        //Final structure for inputting information from console.
        Student createStudent = new Student();
        ScienceGroup s = new ScienceGroup();
        CommerceGroup c = new CommerceGroup();
        ArtsGroup a = new ArtsGroup();

        WriteStuInfo resultWriter = new WriteStuInfo();
        ReadStuInfo resultReader = new ReadStuInfo();

        Scanner scan = new Scanner(System.in);
        boolean i= true;
        while (i){
            System.out.println();
            System.out.println("Welcome!");
            System.out.println("Please select what do you want to do.");
            System.out.println("1. Create new student result file.");
            System.out.println("2. See old student result file.");
            System.out.println("3. Modify student result file.");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choiceOfMainMenu = scan.nextInt();

            if (choiceOfMainMenu == 1 || choiceOfMainMenu == 3) {
                createStudent.setStudentDetails();
                switch (createStudent.getStudentGroup()) {
                    case "Science":
                        s.setScienceMarks();
                        resultWriter.writer(createStudent.getStudentRoll(), createStudent.getStudentAllPersonalInfo(), s.getResult());
                        System.out.println();
                        System.out.println(createStudent.getStudentAllPersonalInfo());
                        System.out.println(s.getResult());
                        break;
                    case "Commerce":
                        c.setCommerceMarks();
                        resultWriter.writer(createStudent.getStudentRoll(), createStudent.getStudentAllPersonalInfo(), c.getResult());
                        System.out.println();
                        System.out.println(createStudent.getStudentAllPersonalInfo());
                        System.out.println(c.getResult());
                        break;
                    case "Arts":
                        a.setArtsMarks();
                        resultWriter.writer(createStudent.getStudentRoll(), createStudent.getStudentAllPersonalInfo(), a.getResult());
                        System.out.println();
                        System.out.println(createStudent.getStudentAllPersonalInfo());
                        System.out.println(a.getResult());
                        break;
                }
            } else if (choiceOfMainMenu == 2) {
                System.out.print("Enter roll no: ");
                int roll = scan.nextInt();
                System.out.println();
                resultReader.reader(roll);
            } else if (choiceOfMainMenu == 4) {
                System.out.println();
                System.out.println("System is exiting now...");
                System.exit(0);
            }
            else System.out.println("Enter choice correctly.");
        }
    }
}