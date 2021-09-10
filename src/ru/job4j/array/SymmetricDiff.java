package ru.job4j.array;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] tempArr = new int[left.length + right.length];
        int index = 0;
        boolean match = false;
        for (int i = 0; i < left.length; i++) {
            match = false;
            for (int j = 0; j < tempArr.length; j++) {
                if (left[i] == tempArr[j]) {
                    match = true;
                }
            }
            if (!match) {
                tempArr[index] = left[i];
                index++;
            }
        }
        match = false;
        for (int i = 0; i < right.length; i++) {
            match = false;
            for (int j = 0; j < tempArr.length; j++) {
                if (right[i] == tempArr[j]) {
                    match = true;
                    tempArr[j] = 0;
                }
            }
            if (!match) {
                tempArr[index] = right[i];
                index++;
            }
        }
        int newSize = 0;
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] != 0) {
                newSize++;
            }
        }
        index = 0;
        int[] newArr = new int[newSize];
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] != 0) {
                newArr[index] = tempArr[i];
                index++;
            }
        }
        return newArr;
    }
}
