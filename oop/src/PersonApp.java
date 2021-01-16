public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Eko", "Subang");
        person1.sayHello("Budi");

        var person2 = new Person("joko");
        person2.sayHello("Budi");

        var person3 = new Person();
        person3.sayHello("eko");


    }
}
