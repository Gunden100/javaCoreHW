package lesson1;

public class roadRunning extends Obstacle {


    public roadRunning(double length) {setDistance(length);    }
    @Override
    public double getTimeToDo(Animal mate){
        return getDistance()/mate.getRunningSpeed();
    }

}

