package org.example;

import February.FirstLec.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("somePet", Pet.class);
        Person per = context.getBean("somePerson",Person.class);
        per.callPet();
        System.out.println(per.getName()+" "+per.getAge());

    }
}
