package ru.ifellow.JSchool.introdution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstSteps {
    /**
     * <b>sum</b> - Возвращает сумму чисел x и y.
     */
    public int sum(int x, int y) {
        return x + y;
    }

    /**
     * <b>mul</b> - Возвращает произведение чисел x и y.
     */
    public int mul(int x, int y) {
        return x * y;
    }

    /**
     * <b>div </b> - Возвращает частное от деления чисел x и y. Гарантируется, что y != 0.
     */
    public int div(int x, int y) {
        return x / y;
    }

    /**
     * <b>mod </b> - Возвращает остаток от деления чисел x и y. Гарантируется, что y != 0.
     */
    public int mod(int x, int y) {
        return x % y;
    }

    /**
     * <b>isEqual </b> - Возвращает true, если x равен y, иначе false.
     */
    public boolean isEqual(int x, int y) {
        return x == y;
    }

    /**
     * <b>isGreater </b> - Возвращает true, если x больше y, иначе false.
     */
    public boolean isGreater(int x, int y) {
        return x > y;
    }

    /**
     * <b>isInsideRect </b> -
     * Гарантируется, что xLeft < xRight и yTop < yBottom.
     * Возвращает true, если точка лежит внутри прямоугольника, иначе false.
     * Если точка лежит на границе прямоугольника, то считается, что она лежит внутри него.
     */
    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return xLeft <= x && yTop <= y && xRight >= x && yBottom >= y;
    }

    /**
     * <b>sum </b> -
     * Возвращает сумму чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает 0.
     *
     * @param array
     */
    public int sum(int[] array) {
        return Arrays.stream(array).sum();
    }

    /**
     * <b>mul </b> -
     * Возвращает произведение чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает 0.
     *
     * @param array
     */
    public int mul(int[] array) {
        if (array.length > 0) {
            int result = 1;
            for (int value : array) {
                result *= value;
            }
            return result;
        } else {
            return 0;
        }
    }

    /**
     * <b>min </b> -
     * Возвращает минимальное из чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает Integer.MAX_VALUE.
     *
     * @param array
     */
    public int min(int[] array) {
        return Arrays.stream(array).min().orElse(Integer.MAX_VALUE);
    }

    /**
     * <b>max </b> -
     * Возвращает максимальное из чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает Integer.MIN_VALUE.
     *
     * @param array
     */
    public int max(int[] array) {
        return Arrays.stream(array).max().orElse(Integer.MIN_VALUE);
    }

    /**
     * <b>average </b> -
     * Возвращает среднее значение для чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает 0.
     *
     * @param array
     */
    public double average(int[] array) {
        return Arrays.stream(array).average().orElse(0);
    }

    /**
     * <b>isSortedDescendant </b> -
     * Возвращает true, если одномерный массив array строго упорядочен по убыванию, иначе false. Пустой одномерный массив считается упорядоченным.
     *
     * @param array
     */
    public boolean isSortedDescendant(int[] array) {
        return Arrays.equals(Arrays.stream(array).boxed().sorted(Collections.reverseOrder()).mapToInt(a -> a).toArray(), array);
    }

    /**
     * <b>cube </b> -
     * Возводит все элементы одномерного массива array в куб.
     *
     * @param array
     */
    public void cube(int[] array) {
        array = Arrays.stream(array).map(a -> a * a * a).toArray();
    }

    /**
     * <b>find </b> -
     * Возвращает true, если в одномерном массиве array имеется элемент, равный value, иначе false.
     *
     * @param array
     * @param value искомое
     */
    public boolean find(int[] array, int value) {
        return Arrays.stream(array).anyMatch(a -> a == value);
    }

    /**
     * <b>reverse </b> -
     * Переворачивает одномерный массив array, то есть меняет местами 0-й и последний, 1-й и предпоследний и т.д. элементы.
     *
     * @param array
     */
    public void reverse(int[] array) {
        int[] res = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            res[array.length - 1 - i] = array[i];
        }

        array = res;
    }

    /**
     * <b>isPalindrome </b> -
     * Возвращает true, если одномерный массив является палиндромом, иначе false. Пустой массив считается палиндромом.
     *
     * @param array
     */
    public boolean isPalindrome(int[] array) {
        int[] res = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            res[array.length - 1 - i] = array[i];
        }

        return Arrays.equals(array, res);
    }

    /**
     * <b>sum </b> - Возвращает сумму чисел, заданных двумерным массивом matrix.
     *
     * @param matrix
     */
    public int sum(int[][] matrix) {
        int sum = 0;
        for (int[] array : matrix) {
            sum += sum(array);
        }
        return sum;
    }

    /**
     * <b>max </b> - Возвращает максимальное из чисел, заданных двумерным массивом matrix.
     * Для пустого двумерного массива возвращает Integer.MIN_VALUE.
     *
     * @param matrix
     */
    public int max(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] array : matrix) {
            if (max < max(array)) max = max(array);
        }
        return max;
    }

    /**
     * <b>diagonalMax </b> - Возвращает максимальное из чисел,
     * находящихся на главной диагонали квадратного двумерного массива matrix.
     * Для пустого двумерного массива возвращает Integer.MIN_VALUE.
     *
     * @param matrix
     */
    public int diagonalMax(int[][] matrix) {
        List<Integer> mainDiagonal = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            mainDiagonal.add(matrix[i][i]);
        }
        return max(mainDiagonal.stream().mapToInt(a -> a).toArray());
    }

    /**
     * <b>isSortedDescendant </b> - Возвращает true, если все строки двумерного массива matrix строго упорядочены по убыванию,
     * иначе false. Пустая строка считается упорядоченной.
     * Разные строки массива matrix могут иметь разное количество элементов.
     *
     * @param matrix
     */
    public boolean isSortedDescendant(int[][] matrix) {
        for (int[] array : matrix) {
            if (!isSortedDescendant(array)) return false;
        }
        return true;
    }

}
