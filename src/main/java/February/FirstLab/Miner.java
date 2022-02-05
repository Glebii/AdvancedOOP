package February.FirstLab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Miner {
//    @Autowired
//    @Qualifier("SHA256")
    Algorithm algorithm;
    @Autowired
    public Miner(Algorithm na){
        algorithm=na;
    }
    public void showSomeInfo(){
        System.out.println("This miner using "+algorithm.getName()+" and your number is "+ algorithm.calculate());
    }
}
