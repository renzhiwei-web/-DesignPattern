package behavioral.statePattern;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Playre is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
