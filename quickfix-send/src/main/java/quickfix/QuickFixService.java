package quickfix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuickFixService {
    private static final String pathSpecification = "spec/CustomFIX.xml";
    static Logger logger = LoggerFactory.getLogger(QuickFixService.class);

    public QuickFixService() {
        logger.info("Create QuickFixService");
    }

    public DataDictionary getDataDictionary() {
        logger.info("Get DataDictionary");
        try {
            return new DataDictionary(pathSpecification);
        } catch (ConfigError configError) {
            logger.info("" + configError + "; at " + configError.getStackTrace()[0]);
        } catch (Exception exception) {
            logger.info("" + exception + "; at " + exception.getStackTrace()[0]);
        }
        return null;
    }
}
