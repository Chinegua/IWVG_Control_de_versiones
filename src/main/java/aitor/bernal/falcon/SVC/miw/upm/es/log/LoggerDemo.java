package aitor.bernal.falcon.SVC.miw.upm.es.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoggerDemo {
    public void logs() {
        Logger logger = LogManager.getLogger(this.getClass().getName());
        logger.debug("Log de debug");
        logger.info("Log de info");
        logger.error("Log de error");
    }

}
