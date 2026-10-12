package lec5;

import java.util.Arrays;

/**
 * Створення і вивидення "зубчастого" масива на прикладі "трикутної" матриці
 */

public class Ex3_2 {

    public static void main(String[] args) {


        int[][] nums = new int[5][];//Створюємо контейнер контейнерів
        //Заповнюєм контейнер іншими контейнерами
        nums[0] = new int[]{1, 1, 1, 1, 1};
        nums[1] = new int[]{1, 1, 1, 1};
        nums[2] = new int[]{1, 1, 1};
        nums[3] = new int[]{1, 1};
        nums[4] = new int[]{1};

        //Виведення масиву
        System.out.println("Масив: \n " + Arrays.deepToString(nums));

        //Виведення матриці
        System.out.println("\nМатриця:");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        //Альтернативний спосіб виведення матриці
        System.out.println("\nАльтернатива:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
    }
}
