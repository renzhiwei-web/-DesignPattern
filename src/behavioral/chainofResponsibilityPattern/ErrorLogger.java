package behavioral.chainofResponsibilityPattern;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(){
        this.level = AbstractLogger.ERROR;
        setNextLogger(null);
    }

    @Override
    protected void write(String message) {
        System.out.println("Error COnsole::Logger:" + message);
    }
}
