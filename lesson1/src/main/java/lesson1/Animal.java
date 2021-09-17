package lesson1;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;
    protected double qualification = 0;
    private double runningSpeed;
    private double climbingSpeed;
    private double swimmingSpeed;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void voice();

    public double isQualification (){return qualification;}

    public void setQualification (double time){qualification = time;}
    public void addTime (double time){qualification += time;}

    public double getRunningSpeed() {        return runningSpeed;
    }
    public void setRunningSpeed(double speedRun) {        this.runningSpeed = speedRun;
    }
    public double getClimbingSpeed() {        return climbingSpeed;
    }
    public void setClimbingSpeed(double climbing) {this.climbingSpeed = climbing;    }
    public double getSwimmingSpeed() {return swimmingSpeed;    }
    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }


}
