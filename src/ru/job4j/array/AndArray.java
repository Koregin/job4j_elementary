package ru.job4j.array;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        // Определяем размер нового массива
        int sizeNewArr = 0;
        for (int number : left) {
            for (int number2: right) {
                if (number == number2) {
                    sizeNewArr++;
                }
            }
        }
        System.out.println("Размер массива: " + sizeNewArr);
        int[] newArr = new int[sizeNewArr];
        int index = 0;
        // Заполняем новый массив пересечениями
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    newArr[index] = left[i];
                    index++;
                }
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        AndArray.and(new int[] {1, 2, 3}, new int[] {4, 5});
        AndArray.and(new int[] {1, 2, 3}, new int[] {1, 4, 5});
        AndArray.and(new int[] {1, 2, 3, 4, 5}, new int[] {4, 5});
    }
}
