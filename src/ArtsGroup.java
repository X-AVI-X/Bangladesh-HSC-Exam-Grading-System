public class ArtsGroup extends Group implements Result{
    private double sociology;
    private double civics;
    private double economics;
    private double logic;

    public void setScienceMarks () {
        setCommonSubMarks();
        while (sociology == -1)
            sociology = doublePaperAvg("Sociology");
        while (civics == -1)
            civics = doublePaperAvg("Civics");
        while (economics == -1)
            economics = doublePaperAvg("Economics");
        while (logic == -1)
            logic = doublePaperAvg("Logic");
    }
    public void getResult(){
        gpaTotal=0;
        System.out.println();
        System.out.println("Subject    "+"     "+"Marks"+"    "+"Grade"+"   "+"Letter Grade");
        System.out.println("_____________________________________________");
        System.out.println("BANGLA     "+"     "+gradeGenerator(bangla));
        System.out.println("ENGLISH    "+"     "+gradeGenerator(english));
        System.out.println("ICT        "+"     "+gradeGenerator(ict));
        System.out.println("SOCIOLOGY  "+"     "+gradeGenerator(sociology));
        System.out.println("CIVICS     "+"     "+gradeGenerator(civics));
        System.out.println("ECONOMICS  "+"     "+gradeGenerator(economics));
        System.out.println("LOGIC      "+"     "+gradeGenerator(logic));
        System.out.println("_____________________________________________");
        double totalMarks = (bangla + english + sociology + civics + economics + logic) * 2 + ict;
        double percentage = Math.round(totalMarks / 13)*100;
        System.out.println("Total marks"+"     "+ totalMarks +"    "+"Percentage"+"   "+ percentage/100 +"%"+"           [Total marks with both papers]");
        double gpaAvg= Math.round((gpaTotal/7)*100);
        System.out.println("GPA        "+"     "+gpaAvg/100);
        gpaTotal=0;
    }

}
