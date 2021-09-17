package lesson1;

public class Pool extends Obstacle {
    public Pool(double length) {setDistance(length);    }
    @Override
    public double getTimeToDo(Animal mate){
        return getDistance()/mate.getSwimmingSpeed();
    }
 }
