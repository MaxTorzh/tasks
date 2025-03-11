package ru.yandex.practicum.codingpractice.ghostTask;

public class Ghost {
    private double age;
    private boolean isFly;

    public Ghost(double age, boolean isFly) {
        this.age = age;
        this.isFly = isFly;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public String say(){
        return "Бу!";
    }
}

class GhostShip extends Ghost {
    public GhostShip(double age, boolean isFly) {
        super(age, isFly);
    }

    @Override
    public String say() {
        return super.say();
    }
}
