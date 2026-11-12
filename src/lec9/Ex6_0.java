package lec9;

/**
 * В патерні делегування (Delegation) один клас передає виконання частини своїх обов'язків
 * іншому класу через посилання на конкретний об'єкт
 */
public class Ex6_0 {
    public static void main(String[] args) {

        class Engine {
            void start() {
                System.out.println("Двигун запущено");
            }
        }

        // Замість успадкування
        // class Car extends Engine { }
        // використовується делегування

        class Car {
            private Engine engine;

            public Car(){
                engine=new Engine();
            }

            void startCar() {
                engine.start(); // делегування
            }
        }
        //Сценарій роботи
        Car car=new Car();
        car.startCar();
    }
}
