public class TrafficLight {
    private TrafficLightState currentState;

    public TrafficLight() {
        // By default, start with Red Light
        currentState = new RedLightState();
    }

    public void setState(TrafficLightState state) {
        currentState = state;
    }

    public void changeState() {
        if (currentState instanceof RedLightState) {
            setState(new GreenLightState());
        } else if (currentState instanceof GreenLightState) {
            setState(new YellowLightState());
        } else if (currentState instanceof YellowLightState) {
            setState(new RedLightState());
        }
    }

    public void showState() {
        currentState.handleRequest();
    }
}
