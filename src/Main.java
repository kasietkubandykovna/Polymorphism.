public class Main {
    public static void main(String[] args) {
Person person1=new Dancer();
Person person2=new Programmer();
Person person3=new Singer();
        Person[] person ={person1,person2,person3};
        person1.walk();
        person2.walk();
        person3.walk();
    }
}