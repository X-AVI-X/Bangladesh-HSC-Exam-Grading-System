public class ScienceGroup extends Group implements Result{
    protected double physics=-1;
    protected double chemistry=-1;
    protected double math=-1;
    protected double biology=-1;

    public ScienceGroup(double bangla, double english, double ict, double physics, double chemistry, double math, double biology){
        super (bangla, english, ict);
        this.physics=physics;
        this.chemistry=chemistry;
        this.math=math;
        this.biology=biology;
    }
    public ScienceGroup(){
        super();
    }

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
    public String getResult() {
        gpaTotal = 0;
        double totalMarks = (bangla + english + physics + chemistry + math + biology) * 2 + ict;
        double percentage = Math.round(totalMarks / 13) * 100;

        return "\n"+
        "Subject    " + "     " + "              Marks" + "    " + "Grade" + "   " + "Letter Grade\n"+
        "_________________________________________________________________________"+"\n"+
        "BANGLA      [COMBINED]   " + "     " + gradeGenerator(bangla)+"\n"+
        "ENGLISH     [COMBINED]   " + "     " + gradeGenerator(english)+"\n"+
        "ICT                      " + "     " + gradeGenerator(ict)+"\n"+
        "PHYSICS     [COMBINED]   " + "     " + gradeGenerator(physics)+"\n"+
        "CHEMISTRY   [COMBINED]   " + "     " + gradeGenerator(chemistry)+"\n"+
        "MATH        [COMBINED]   " + "     " + gradeGenerator(math)+"\n"+
        "BIOLOGY     [COMBINED]   " + "     " + gradeGenerator(biology)+"\n"+
        "_________________________________________________________________________"+"\n"+
        "Total marks" + "                 " + totalMarks + "    " + "Percentage" + "   " + percentage / 100 + "%" + "                    [Total marks with both papers]"+"\n"+
        "GPA             " + "              " + gpaGenerator() + "                                          [Without 4th subject]";
    }

}
