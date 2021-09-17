package lesson1;

public class Wolf extends Animal {
    private int swimmingSpeed;

    public Wolf(String name, String color, int age) {
        super(name, color, age);
    }

//    public void setSwimmingSpeed(int swimmingSpeed) {
//        this.swimmingSpeed = swimmingSpeed;
//    }

    @Override
    public void voice() {
        System.out.println("Волк воет!");
    }

}
