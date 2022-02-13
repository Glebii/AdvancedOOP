package February.FirstLab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class LabDemo {
    public static void main(String[] args) {
        //Task 1
        //FXMl ; FXML + Annotations
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Printer printer = context.getBean("printer",Printer.class);
//        printer.sayHelloWorld();
        // Java Code
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(configForPrintMessage.class);
//        Printer printer = context.getBean(Printer.class);
//        printer.sayHelloWorld();
        //Task 2
        //FXMl ; FXML + Annotations
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Miner miner = context.getBean("miner",Miner.class);
//        miner.showSomeInfo();
        // Java Code
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(configForMiner.class);
        Miner miner = context.getBean(Miner.class);
        miner.showSomeInfo();

    }
}
