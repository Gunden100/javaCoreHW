package lesson2;

public class Homework2 {
    public static int summing(String[][] array) throws MyArraySizeException {
        int summ = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("RowBadSize");
        }
        for (int i = 0; i < array.length; ++i) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("ColumBadSize");
            }
            for (int j = 0; j < array[i].length; ++j) {
                int number = stringToInt(array[i][j], i, j);
                summ += number;
            }

        }
        return summ;
    }

    public static int stringToInt(String string, int i, int j) {
        int number = 0;
        try {
            number = Integer.parseInt((string));

        } catch (NumberFormatException e) {
            System.out.println("Incorrect field format! In Row: " + i + ", In Colum: " + j);
        }
        return number;
    }

    public static void main(String[] args) throws MyArraySizeException {
        String[][] array = {{"b", "d", "15", "8"}, {"c", "e", "2", "5"}, {"7", "9", "22", "12"}, {"36", "3", "4", "6"}};
        try {
           int summ = summing(array);
            System.out.println(summ);
        } catch (MyArraySizeException e) {
            System.out.println("Incorrect size");
        }
    }
}




