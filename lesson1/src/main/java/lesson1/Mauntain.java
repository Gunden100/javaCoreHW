package lesson1;

public class Mauntain extends Obstacle {

    public Mauntain(double length) {setDistance(length);    }
    @Override
    public double getTimeToDo(Animal mate){
        return getDistance()/mate.getClimbingSpeed();
    }

}
