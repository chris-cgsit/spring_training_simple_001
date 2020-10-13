package at.cgsit.training.firstexample.qualifier;


import at.cgsit.training.firstexample.services.DevChatMessageServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TestQuaifierComponent implements TestQualifier {

  Logger logger = LoggerFactory.getLogger(TestQuaifierComponent.class);


  @Override public String echo(String echo) {

    logger.info("TestQuaifierComponent:echo");
    logger.info("TestQuaifierComponent:echo LOG 5");

    return "TestQuaifierComponent";

  }

}
