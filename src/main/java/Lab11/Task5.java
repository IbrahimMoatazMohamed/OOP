package Lab11;

interface TrafficLightState {
    void transitionToRed();
    void transitionToGreen();
    void transitionToYellow();
}

class RedLightState implements TrafficLightState{
    @Override
    public void transitionToRed() {
        System.out.println("Red");
    }

    @Override
    public void transitionToGreen() {
        System.out.println("no it is red");
    }

    @Override
    public void transitionToYellow() {
        System.out.println("no it is red");
    }
}
class GreenLightState implements TrafficLightState{
    @Override
    public void transitionToRed() {
        System.out.println("no it is green");
    }

    @Override
    public void transitionToGreen() {
        System.out.println("Green");
    }

    @Override
    public void transitionToYellow() {
        System.out.println("no it is green");
    }
}
class YellowLightState implements TrafficLightState{
    @Override
    public void transitionToRed() {
        System.out.println("no it is yellow");
    }

    @Override
    public void transitionToGreen() {
        System.out.println("no it is yellow");
    }

    @Override
    public void transitionToYellow() {
        System.out.println("yellow");
    }
}

class TrafficLightContext implements TrafficLightState{
    private TrafficLightState state;

    public TrafficLightContext() {
        this.state = new RedLightState();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    @Override
    public void transitionToRed() {
        state.transitionToRed();
    }

    @Override
    public void transitionToGreen() {
        state.transitionToGreen();
    }

    @Override
    public void transitionToYellow() {
        state.transitionToYellow();
    }

}

class TrafficLightController {
    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();
    }
}