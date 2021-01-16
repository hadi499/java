public class ManagerApp {
    public static void main(String[] args) {


        var manager = new Manager();
        manager.name = "alex";
        manager.sayHello("Budi");

        var vp = new VicePresident();
        vp.name = "boby";
        vp.sayHello("Budi");

    }
}
