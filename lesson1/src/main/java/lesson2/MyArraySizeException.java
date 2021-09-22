package lesson2;

public class MyArraySizeException extends Throwable {
    public MyArraySizeException(String rowBadSize) {
        System.out.println(rowBadSize);
    }
}
