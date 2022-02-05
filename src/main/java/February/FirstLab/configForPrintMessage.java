package February.FirstLab;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config.properties")
public class configForPrintMessage {
    @Bean
    public Printer printer(){
        return new Printer(message());
    }
    @Bean
    @Value("${message.text}")
    public Message message(){
        return new Message();
    }
}
