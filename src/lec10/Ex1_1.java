package lec10;

/**
 * Створення "екземплярів" абстрактного класу Animal
 */
public class Ex1_1 {
    public static void main(String[] args) {

        //Анонімний внутрішній клас як реалізація абстрактного класу
        Animal cat = new Animal("cat") {
            @Override
            String say() {
                return "m-rrr";
            }
        };
        System.out.printf("%d. %S < %S\n", cat.getCounter(), cat.kind, cat.say());

        //Анонімний внутрішній клас як реалізація абстрактного класу
        Animal dog = new Animal("dog") {
            @Override
            String say() {
                return "gav-vvv";
            }
        };
        System.out.printf("%d. %S < %S\n", dog.getCounter(), dog.kind, dog.say());
    }
}
