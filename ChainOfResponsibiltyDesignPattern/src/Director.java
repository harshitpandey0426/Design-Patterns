public class Director extends Manager {

    public Director(int approvalLimit, String managerName) {
        this.approvalLimit = approvalLimit;
        this.ManagerName = managerName;
    }

    @Override
    protected void processSalary(int employeeSalary) {
        System.out.println(this.ManagerName + " has approved the salary at level 3, for salary amount "+ employeeSalary );
    }
}
