import java.util.Scanner;

public class Group{
    protected double bangla=-1;
    protected double english=-1;
    protected double ict=-1;
    public static double gpaTotal=0;

    public Group(double bangla, double english, double ict) {
        this.bangla=bangla;
        this.english=english;
        this.ict=ict;
    }

    public Group() {
    }

    public void setCommonSubMarks (){
        Scanner scan = new Scanner(System.in);
        while (bangla==-1)
            bangla = doublePaperAvg("Bangla");
        while (english==-1)
        english= doublePaperAvg("English");
        System.out.print("Enter ICT marks: ");
        ict = scan.nextDouble();
        while (ict < 0 || ict > 100) {
            System.out.print("Invalid. Input (0-100): ");
            ict = scan.nextDouble();
        }
    }
    public double doublePaperAvg(String subjectName){
        double p1=-1,p2=-1,avg=0;
        int count=1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter "+ subjectName +" 1st paper mark: ");
            while (p1 > 100 || p1 < 0) {
                try {
                    if (count>=2)
                    System.out.print("Invalid. Input (0-100): ");
                    p1 = s.nextDouble();
                    count++;
                }catch (Exception e){
                    System.out.println("Invalid. Input (0-100).");
                    return -1;
                }
            }
            count=1;
            System.out.print("Enter " + subjectName + " 2nd paper mark: ");
            while (p2 > 100 || p2 < 0) {
                try{
                    if(count>=2)
                    System.out.print("Invalid. Input (0-100): ");
                    p2 = s.nextDouble();
                    count++;
                }catch (Exception e){
                    System.out.println("Invalid. Input (0-100)");
                    return -1;
                }
            }
            count=1;
            avg = (p1 + p2) / 2;
            return avg;
    }
    public String gradeGenerator (double marks){
        if (marks>=80 && marks<=100){
            gpaTotal=gpaTotal+5;
            return marks+"      5       A+";
        }
        if (marks>=70 && marks<=79 ){
            gpaTotal=gpaTotal+4;
            return marks+"      4       A";
        }
        if (marks>=60 && marks<=69){
            gpaTotal=gpaTotal+3.5;
            return marks+"      3.5     A-";
        }
        if (marks>=50 && marks<=59){
            gpaTotal=gpaTotal+3;
            return marks+"      3       B";
        }
        if (marks>=40 && marks<=49){
            gpaTotal=gpaTotal+2;
            return marks+"      2       C";
        }
        if (marks>=33 && marks<=39){
            gpaTotal=gpaTotal+1;
            return marks+"      1       D";
        }
        if (marks>=0 && marks<=32){
            gpaTotal=gpaTotal+1;
            return marks+"      0       F";
        }
        else return "Invalid";
    }
    public double gpaGenerator(){
        double gpa=Math.round((gpaTotal/7)*100);
        return gpa/100;
    }

}
