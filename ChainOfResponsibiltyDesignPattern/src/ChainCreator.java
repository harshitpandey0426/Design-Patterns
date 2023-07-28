public class ChainCreator {
    public Manager createChain(){
        //start from hiring manager and return hiring manager
        HiringManager hiringManager = new HiringManager(10000,"Mike");
        SeniorManager seniorManager = new SeniorManager(30000, "Bill");
        Director director  = new Director(50000, "Ayush");

        hiringManager.setManager(seniorManager);
        seniorManager.setManager(director);
        return hiringManager;
    }
}
