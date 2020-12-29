package behavioral.chainofResponsibilityPattern;

public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(){
        this.level = AbstractLogger.INFO;
        setNextLogger(new FileLogger());
    }

    @Override
    protected void write(String message) {
        System.out.println("Console::Logger:" + message);
    }
}
