package com.jrf.designPattern.chainOfResponsibilityPattern;

/**
 * @Author ruofa
 * @Date 2021/2/23 10:33
 */
public class Test {
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger consoleLogger=new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger=new FileLogger(AbstractLogger.DEBUG);
        consoleLogger.setNextLogger(errorLogger);
        errorLogger.setNextLogger(fileLogger);
        return consoleLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain=getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.DEBUG,"debug");
        loggerChain.logMessage(AbstractLogger.ERROR,"error");
        loggerChain.logMessage(AbstractLogger.INFO,"info");
    }
}
