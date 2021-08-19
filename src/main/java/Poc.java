import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Poc {
    private final Logger logger;

    Poc() {
        this.logger = Logger.getLogger(this.getClass());
        BasicConfigurator.configure();
    }

    public void log(String message) {
        this.logger.log(Level.INFO, message);
    }

    public static void main(String[] args) {
        Poc poc = new Poc();
        poc.log("Hello World!");
    }
}
