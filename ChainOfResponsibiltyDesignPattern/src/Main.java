public class Main {
    public static void main(String[] args) {
        ChainCreator chainCreator = new ChainCreator();
        Manager manager = chainCreator.createChain();
        manager.approveSalary(5000);
        manager.approveSalary(15000);
        manager.approveSalary(45000);
        manager.approveSalary(5000000);
    }
}