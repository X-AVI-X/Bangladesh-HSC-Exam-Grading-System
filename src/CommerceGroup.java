public class CommerceGroup extends Group implements Result{
    private double accounting;
    private double finance;
    private double marketing;
    private double management;

    public void setCommerceMarks () {
        setCommonSubMarks();
        while (accounting == -1)
            accounting = doublePaperAvg("Accounting");
        while (finance == -1)
            finance = doublePaperAvg("Finance");
        while (marketing == -1)
            marketing = doublePaperAvg("Marketing");
        while (management == -1)
            management = doublePaperAvg("Management");
    }
    public void getResult(){
        gpaTotal=0;
        System.out.println();
        System.out.println("Subject    "+"     "+"Marks"+"    "+"Grade"+"   "+"Letter Grade");
        System.out.println("_____________________________________________");
        System.out.println("BANGLA     "+"     "+gradeGenerator(bangla));
        System.out.println("ENGLISH    "+"     "+gradeGenerator(english));
        System.out.println("ICT        "+"     "+gradeGenerator(ict));
        System.out.println("ACCOUNTING "+"     "+gradeGenerator(accounting));
        System.out.println("MARKETING  "+"     "+gradeGenerator(marketing));
        System.out.println("FINANCE    "+"     "+gradeGenerator(finance));
        System.out.println("MANAGEMENT "+"     "+gradeGenerator(management));
        System.out.println("_____________________________________________");
        double totalMarks = (bangla + english + accounting + marketing + finance + management) * 2 + ict;
        double percentage = Math.round(totalMarks / 13)*100;
        System.out.println("Total marks"+"     "+ totalMarks +"    "+"Percentage"+"   "+ percentage/100 +"%"+"           [Total marks with both papers]");
        double gpaAvg= Math.round((gpaTotal/7)*100);
        System.out.println("GPA        "+"     "+gpaAvg/100);
        gpaTotal=0;
    }

}
