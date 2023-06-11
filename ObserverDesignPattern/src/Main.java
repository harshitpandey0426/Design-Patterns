public class Main {
    public static void main(String[] args) {
        WeatherStation iObservable = new WeatherStation();
        IObserver iObserver1 = new PhoneDisplay("Harshit"); //have to create object of type weatherStation only to get other implemented methods.
        IObserver iObserver2 = new PhoneDisplay("Abhinav");
        iObservable.add(iObserver1);
        iObservable.add(iObserver2);

        iObservable.setTemperature(20);
        iObservable.notifyObserver();

        iObservable.remove(iObserver1);

        iObservable.setTemperature(30);
        iObservable.notifyObserver();
    }
}