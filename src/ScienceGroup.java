public class ScienceGroup extends Group implements Result{
    protected double physics=-1;
    protected double chemistry=-1;
    protected double math=-1;
    protected double biology=-1;

    public void setScienceMarks (){
        setCommonSubMarks ();
        while (physics==-1)
        physics= doublePaperAvg("Physics");
        while (chemistry==-1)
        chemistry= doublePaperAvg("Chemistry");
        while (math==-1)
        math = doublePaperAvg("Higher math");
        while (biology==-1)
        biology = doublePaperAvg("Biology");
    }
    public void getResult(){
        gpaTotal=0;
        System.out.println();
        System.out.println("Subject    "+"     "+"Marks"+"    "+"Grade"+"   "+"Letter Grade");
        System.out.println("_____________________________________________");
        System.out.println("BANGLA     "+"     "+gradeGenerator(bangla));
        System.out.println("ENGLISH    "+"     "+gradeGenerator(english));
        System.out.println("ICT        "+"     "+gradeGenerator(ict));
        System.out.println("PHYSICS    "+"     "+gradeGenerator(physics));
        System.out.println("CHEMISTRY  "+"     "+gradeGenerator(chemistry));
        System.out.println("MATH       "+"     "+gradeGenerator(math));
        System.out.println("BIOLOGY    "+"     "+gradeGenerator(biology));
        System.out.println("_____________________________________________");
        double totalMarks = (bangla + english + physics + chemistry + math + biology) * 2 + ict;
        double percentage = Math.round(totalMarks / 13)*100;
        System.out.println("Total marks"+"     "+ totalMarks +"    "+"Percentage"+"   "+ percentage/100 +"%"+"           [Total marks with both papers]");
        double gpaAvg= Math.round((gpaTotal/7)*100);
        System.out.println("GPA        "+"     "+gpaAvg/100);
        gpaTotal=0;
    }

}
