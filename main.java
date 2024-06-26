// Main.java
public class Main {
    public static void main(String[] args) {
        // Singleton pattern
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Strategy pattern
        Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy();

        context = new Context(new ConcreteStrategyB());
        context.executeStrategy();

        // Facade pattern
        Facade facade = new Facade();
        facade.operationFacade();
    }
}
