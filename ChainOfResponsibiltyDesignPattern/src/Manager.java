public abstract class Manager {
    protected Manager manager;
    int approvalLimit;
    String ManagerName;

    public void setManager(Manager manager){
        this.manager = manager;
    }

    public void approveSalary(int employeeSalary){
        if(this.approvalLimit > employeeSalary){
            processSalary(employeeSalary);
        }else if(manager != null) manager.approveSalary(employeeSalary);
        else System.out.println("Cannot make the offer to candidate");
    }

    protected abstract void processSalary(int employeeSalary);

}