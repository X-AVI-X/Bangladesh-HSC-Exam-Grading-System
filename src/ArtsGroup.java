public class ArtsGroup extends Group implements Result{
    private double sociology;
    private double civics;
    private double economics;
    private double logic;

    public ArtsGroup(double bangla, double english, double ict, double sociology,double civics,double economics,double logic){
        super(bangla, english, ict);
        this.sociology=sociology;
        this.civics=civics;
        this.economics=economics;
        this.logic=logic;
    }
    public ArtsGroup(){
        super();
    }

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
    public String getResult(){
        gpaTotal=0;
        double totalMarks = (bangla + english + sociology + civics + economics + logic) * 2 + ict;
        double percentage = Math.round(totalMarks / 13)*100;
        return "\n"+
                "Subject    " + "     " + "              Marks" + "    " + "Grade" + "   " + "Letter Grade\n"+
                "_________________________________________________________________________"+"\n"+
                "BANGLA      [COMBINED]   " + "     " + gradeGenerator(bangla)+"\n"+
                "ENGLISH     [COMBINED]   " + "     " + gradeGenerator(english)+"\n"+
                "ICT                      " + "     " + gradeGenerator(ict)+"\n"+
                "SOCIOLOGY   [COMBINED]   " + "     " + gradeGenerator(sociology)+"\n"+
                "CIVICS      [COMBINED]   " + "     " + gradeGenerator(civics)+"\n"+
                "ECONOMICS   [COMBINED]   " + "     " + gradeGenerator(economics)+"\n"+
                "LOGIC       [COMBINED]   " + "     " + gradeGenerator(logic)+"\n"+
                "_________________________________________________________________________"+"\n"+
                "Total marks" + "                 " + totalMarks + "    " + "Percentage" + "   " + percentage / 100 + "%" + "                    [Total marks with both papers]"+"\n"+
                "GPA             " + "              " + gpaGenerator() + "                                          [Without 4th subject]";
    }

}
