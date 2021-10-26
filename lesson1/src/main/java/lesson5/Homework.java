package lesson5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Homework {
    public static void main(String[] args) {
        AppData appData = new AppData();
        AppData.save(appData);



    }
    public static class AppData{
        private String[] header = {"Value 1", "Value 2", "Value 3"};
        private int[][] data = {{1,2,3},{4,5,6},{7,8,9}};
        public static void save (AppData task){
            try ( PrintWriter printWriter  = new PrintWriter("new_students.csv")){
                String mainHeader = new String("");
                for (String o : task.header){
                    mainHeader += o;
                    mainHeader += ",";

                }
                printWriter.println(mainHeader);
                for (int[] row : task.data){
                    mainHeader = "";
                    for (int elem : row){
                        mainHeader += elem;
                        mainHeader += ",";

                    }
                    printWriter.println(mainHeader);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}

