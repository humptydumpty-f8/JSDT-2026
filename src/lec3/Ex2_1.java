package lec3;

/**
 * Простий приклад форматованого виведення чисел
 */

public class Ex2_1 {
    public static void main(String[] args) {

        double x = -33.3;
        int y = 22;
        int z = -1;
        System.out.printf("%n x=%-10.2f %n y=%+10d %n z=%+010d", x, y, z);
        System.out.printf("%n%n");
        System.out.printf("x=%-10.2f %n y=%+10d %n z=%+010d", x, y, z);
    }
}

