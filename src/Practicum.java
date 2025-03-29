abstract class Transport {
    public void turnOnEngine() {
        System.out.println("Двигатель включён!");
    }
}

class Car extends Transport {
}

class Motocycle extends Transport {
}

public class Practicum {
    public static void main(String[] args) {
        Transport motocycle = new Motocycle();
        motocycle.turnOnEngine();
        Transport car = new Car();
        car.turnOnEngine();
    }
}
