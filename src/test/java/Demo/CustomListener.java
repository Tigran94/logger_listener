package Demo;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

    private static final Logger logger = LogManager.getLogger(CustomListener.class.getName());
    private final String level = System.getProperty("level","FATAL");

    private void setLevel(){
        switch (level){
            case "TRACE": Configurator.setLevel(logger.getName(), Level.TRACE); break;
            case "DEBUG": Configurator.setLevel(logger.getName(), Level.DEBUG); break;
            case "INFO": Configurator.setLevel(logger.getName(), Level.INFO); break;
            case "WARN": Configurator.setLevel(logger.getName(), Level.WARN); break;
            case "ERROR": Configurator.setLevel(logger.getName(), Level.ERROR); break;
            case "FATAL": Configurator.setLevel(logger.getName(), Level.FATAL); break;
        }
    }
    @Override
    public void onStart(ITestContext context) {
        setLevel();
        System.out.println();
        System.out.println("ALL TESTS COUNT IS = " + context.getAllTestMethods().length);
        logger.error("error on start");
        logger.warn("warn on start");
        logger.info("info on start");
        logger.fatal("fatal on start");
        logger.debug("debug on start");
        logger.trace("trace on start");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("The " + result.getName() + "test is started");

        logger.error("error on test start " + result.getName());
        logger.warn("warn on test start " + result.getName());
        logger.info("info on test start " + result.getName());
        logger.fatal("fatal on test start " + result.getName());
        logger.debug("debug on test start " + result.getName());
        logger.trace("trace on test start " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("The " + result.getName() + "test is skipped");

        logger.error("error on test skipped " + result.getName());
        logger.warn("warn on test skipped " + result.getName());
        logger.info("info on test skipped " + result.getName());
        logger.fatal("fatal on test skipped " + result.getName());
        logger.debug("debug on test skipped " + result.getName());
        logger.trace("trace on test skipped " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("The " + result.getName() + "test is failed");

        logger.error("error on test failure " + result.getName());
        logger.warn("warn on test failure " + result.getName());
        logger.info("info on test failure " + result.getName());
        logger.fatal("fatal on test failure " + result.getName());
        logger.debug("debug on test failure " + result.getName());
        logger.trace("trace on test failure " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("The " + result.getName() + "test is successed");

        logger.error("error on test success " + result.getName());
        logger.warn("warn on test success " + result.getName());
        logger.info("info on test success " + result.getName());
        logger.fatal("fatal on test success " + result.getName());
        logger.debug("debug on test success " + result.getName());
        logger.trace("trace on test success " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println();

        logger.error("error on finish");
        logger.warn("warn on finish");
        logger.info("info on finish");
        logger.fatal("fatal on finish");
        logger.debug("debug on finish");
        logger.trace("trace on finish");
    }

}
