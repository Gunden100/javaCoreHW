package lesson3;

import java.util.Arrays;

public class Homework3 {

    public static void  main(String[] args){
        System.out.println("\nЗадание №1");
       Integer[] arr = {3, 4, 6, 234, -1324, 111};
       System.out.println("Massive\n" + Arrays.toString(arr));
        SwapBox<Integer> a = new SwapBox<Integer>();
        a.swapElement(arr, 2, 5);
        System.out.println(Arrays.toString(arr));
        System.out.println("\nЗадание №2");
        Apple ap = new Apple(4.0f);
        Box b = new Box<Apple>();
        b.addObj(ap);
        b.addObj(ap);
        Orange or = new Orange(5.0f);
        Box c = new Box<Orange>();
        c.addObj(or);
        c.addObj(or);
        System.out.println(Box.compare(b, c));
        System.out.println("Вес коробки = " + b.getWeight());

    }
}
class SwapBox<T> {
    public void swapElement(T[] arr, int i, int i1) {
        if (i >= arr.length || i1 >= arr.length){
            System.out.println("Один из индексов выходит за пределы массива");
            return;
        }
        T t;
        t = arr[i];
        arr[i] = arr[i1];
        arr[i1] = t;
    }

}

