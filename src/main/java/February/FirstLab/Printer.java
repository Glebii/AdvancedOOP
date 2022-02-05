package February.FirstLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Printer {
    Message message;
    @Autowired
    public Printer(Message m){
        message = m;
    }
    public void sayHelloWorld(){
        System.out.println(message);
    }
}
