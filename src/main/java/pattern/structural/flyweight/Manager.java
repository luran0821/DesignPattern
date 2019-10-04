package pattern.structural.flyweight;

public class Manager implements Employee {
    //外部状态
    private String department;
    //内部状态
    private String title = "部门经理";
    private String reportContent;

    public void report() {
        System.out.println(reportContent);
    }
    public Manager(String department){
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
