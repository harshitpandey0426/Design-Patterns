class GreenLightState implements TrafficLightState {
    public void handleRequest() {
        System.out.println("Traffic Light is now GREEN.");
    }
}