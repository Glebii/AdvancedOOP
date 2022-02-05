package February.FirstLab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;
//@Component("ET")
public class Ethash implements Algorithm{
    String name = "Ethash";
    @Value("${et.range}")
    int range;
    Random random = new Random();

//    public Ethash(int newrange){
//        range = newrange;
//    }
    @Override
    public int calculate() {
        return random.nextInt(range);
    }

    @Override
    public String getName() {
        return name;
    }
}
