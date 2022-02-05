package February.FirstLab;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public  class Message {
    String text;
    @Value("${message.text}")
    public void setText(String newText){
        text=newText;
    }

    @Override
    public String toString() {
        return "I want to say "+text;
    }
}
