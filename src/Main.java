public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "X5", "Black", "V8");

        Car audi = new Car("Audi", "A8", "White", "V12");

        System.out.println(bmw);

        System.out.println(audi);

        System.out.println("My dream car " + bmw.getMarka() + " " + bmw.getModel());
    }
}