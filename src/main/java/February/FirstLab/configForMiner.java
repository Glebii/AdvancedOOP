package February.FirstLab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config.properties")
public class configForMiner {
    @Bean
    public Algorithm sha256(){
        return new SHA256();
    }
    @Bean
    public Algorithm ethash(){
        return new Ethash();
    }
    @Bean
    public Miner miner(){
        return new Miner(sha256());
    }
}
