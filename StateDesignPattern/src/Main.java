public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.showState();

        trafficLight.changeState();
        trafficLight.showState();

        trafficLight.changeState();
        trafficLight.showState();

        // Output:
        // Traffic Light is now RED.
        // Traffic Light is now GREEN.
        // Traffic Light is now YELLOW.
    }
}