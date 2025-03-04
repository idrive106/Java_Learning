public class Car {
    private String marka;
    private String model;
    private String color;
    private String engine;

    public Car(String marka, String model, String color, String engine) {
        this.marka = marka;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Марка " + marka + '\n' +
                "Модель " + model + '\n' +
                "Цвет " + color + '\n' +
                "Двигатель " + engine + '\n' +
                "---------------------";
    }
}
