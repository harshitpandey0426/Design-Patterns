public class PhoneDisplay implements IObserver{
    String userName;
    PhoneDisplay(String userName){ //needed only for display purpose
        this.userName = userName;
    }
    @Override
    public void update(int temperature) {
        System.out.println("Updated temperature to "+ temperature + " for " + this.userName);
    }
}
