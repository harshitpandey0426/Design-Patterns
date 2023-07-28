public class HiringManager extends Manager {
    public HiringManager(int approvalLimit, String managerName) {
        this.approvalLimit = approvalLimit;
        this.ManagerName = managerName;
    }

    @Override
    protected void processSalary(int employeeSalary) {
        System.out.println(this.ManagerName + " has approved the salary at level 1, for salary amount "+ employeeSalary );
    }
}
