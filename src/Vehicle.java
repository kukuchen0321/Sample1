public class Vehicle {
    String model;
    String size;

    public Vehicle(String model, String size) {
        this.model = model;
        this.size = size;
    }

    public String getSize() {
        return size;
    }
    public String getModel() {
        return model;
    }

    public static void main(String[] args) {
        Vehicle car1 = new car("Audi");
        System.out.println(car1.getModel());
        System.out.println(car1.getSize());
    }

    static class motorcycle extends Vehicle {
        public motorcycle(String model) {
            super(model, "small");
        }

    }

    static class car extends Vehicle {
        public car(String model) {
            super(model, "medium");
        }

    }

    static class truck extends Vehicle {
        public truck(String model) {
            super(model, "large");
        }

    }
}
