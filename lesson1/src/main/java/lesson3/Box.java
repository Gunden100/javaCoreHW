package lesson3;

import java.util.ArrayList;

public class Box <A> {
ArrayList<A> fruits = new ArrayList<A>();

    public float getWeight() {
        float totalWeight = 0.0f;
       if (fruits.size() == 0) return 0.0f;
        for (A fruit : fruits){
            totalWeight += getWeightF((Fruit) fruit);
        }
return totalWeight;
    }
//    public float getWeightF(A fruit){
//        return 0;
//    }

    public float getWeightF(Fruit fruit){
        return fruit.getWeightF();
    }
    public void addObj(A object){
        fruits.add(object);
    }
    public static boolean compare(Box a, Box b){
        return a.getWeight() == b.getWeight();

    }
    public static void send(Box a, Box b){
        b.fruits.add(a.fruits);
        a.fruits.clear();

    }
}
