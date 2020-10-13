package at.cgsit.training.firstexample.config;

import at.cgsit.training.firstexample.repository.ChatMessageRepository;
import at.cgsit.training.firstexample.services.ChatMessageService;
import at.cgsit.training.firstexample.services.ChatMessageServiceImpl;
import at.cgsit.training.firstexample.services.DevChatMessageServiceImpl;
import at.cgsit.training.firstexample.translator.ChatMessageDTOToChatMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/*
@Configuration
@Profile("dev")
public class DevChatMessageServiceConfig {

  Logger logger = LoggerFactory.getLogger(DevChatMessageServiceConfig.class);

    @Bean
    public ChatMessageService chatMessageService() {
      logger.info("chatMessageService bean constructor callback");
      return new DevChatMessageServiceImpl();
    }

}
*/
