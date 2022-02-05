package February.FirstLec;

public class Person {
    Pet littleFriend;
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setLittleFriend(Pet p){
        littleFriend = p;
    }

    public Pet getLittleFriend() {
        return littleFriend;
    }

    public void callPet(){
        System.out.println("Hi buddy!Say something :\n"+littleFriend.saySomething());
    }

}
