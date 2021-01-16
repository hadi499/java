class Person {
    String name;
    String address;


    Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    Person(String name){
        this(name, null);
    }
    Person(){

    }




    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }
}