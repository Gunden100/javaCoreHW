package lesson1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Course {
    List<Obstacle> db = new ArrayList<Obstacle>();
   public void addObstacle(Obstacle c){
    db.add(c);
   }
   public void doIt (Team team) {
       for (Animal mate : team.teamMate) {
           for (Obstacle obs: db){
mate.addTime(obs.getTimeToDo(mate));
           }


       }
   }


}




