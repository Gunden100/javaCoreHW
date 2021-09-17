package lesson1;

public class Obstacle {
    private double distance;

    public Obstacle() {

    }

    public double getDistance(){ return distance;}
    public void setDistance(double distance){this.distance = distance; }
    public Obstacle(int distance) {this.distance = distance;    }
    public double getTimeToDo(Animal mate){return 0;}


    }
