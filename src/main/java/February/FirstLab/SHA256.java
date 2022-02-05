package February.FirstLab;
import org.springframework.stereotype.Component;

import java.util.Random;
//@Component("SHA256")
public class SHA256 implements Algorithm{
    String name ="SHA256";
    Random random = new Random();
    @Override
    public int calculate() {
        return random.nextInt();
    }

    @Override
    public String getName() {
        return name;
    }
}
