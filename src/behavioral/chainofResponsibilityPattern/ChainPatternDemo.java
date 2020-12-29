package behavioral.chainofResponsibilityPattern;

public class ChainPatternDemo{
    private static AbstractLogger getChainOfLoggers(){

        ConsoleLogger consoleLogger = new ConsoleLogger();
        return consoleLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.ERROR, "错误信息");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.DEBUG, "测试信息");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.INFO, "控制台信息");
    }

}
