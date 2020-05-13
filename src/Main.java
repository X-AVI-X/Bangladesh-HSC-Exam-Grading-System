public class Main {
    public static void main(String[] args){
        Student student = new Student("Avijit Paul",459856,"Science", "Prof. Kanai Paul","Rangpur",
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
        //System.out.println("Reading successful.");
    }
}