public class CommerceGroup extends Group implements Result{
    private double accounting;
    private double finance;
    private double marketing;
    private double management;

    public CommerceGroup(double bangla, double english, double ict, double accounting, double finance, double marketing, double management) {
        super(bangla, english, ict);
        this.accounting=accounting;
        this.finance=finance;
        this.marketing=marketing;
        this.management=management;
    }
    public CommerceGroup(){
        super();
    }

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
    public String getResult(){
        gpaTotal=0;
        double totalMarks = (bangla + english + accounting + finance + marketing + management) * 2 + ict;
        double percentage = Math.round(totalMarks / 13)*100;

        return "\n"+
                "Subject    " + "     " + "              Marks" + "    " + "Grade" + "   " + "Letter Grade\n"+
                "_________________________________________________________________________"+"\n"+
                "BANGLA      [COMBINED]   " + "     " + gradeGenerator(bangla)+"\n"+
                "ENGLISH     [COMBINED]   " + "     " + gradeGenerator(english)+"\n"+
                "ICT                      " + "     " + gradeGenerator(ict)+"\n"+
                "ACCOUNTING  [COMBINED]   " + "     " + gradeGenerator(accounting)+"\n"+
                "FINANCE     [COMBINED]   " + "     " + gradeGenerator(finance)+"\n"+
                "MARKETING   [COMBINED]   " + "     " + gradeGenerator(marketing)+"\n"+
                "MANAGEMENT  [COMBINED]   " + "     " + gradeGenerator(management)+"\n"+
                "_________________________________________________________________________"+"\n"+
                "Total marks" + "                 " + totalMarks + "    " + "Percentage" + "   " + percentage / 100 + "%" + "                    [Total marks with both papers]"+"\n"+
                "GPA             " + "              " + gpaGenerator() + "                                          [Without 4th subject]";
    }

}
