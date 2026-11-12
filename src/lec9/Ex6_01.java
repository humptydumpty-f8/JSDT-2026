package lec9;

/**
 * Той самий приклад з використанням інтерфейсу, щоб можна було швидко змінювати реалізацію
 */
public class Ex6_01 {

    //Інтерфейс
    public interface Engine {
        void start();
    }

    public static void main(String[] args) {

        //Реалізації інтерфейсу
        class PetrolEngine implements Engine {

            @Override
            public void start() {
                System.out.println("Бензиновий двигун запущено");
            }
        }

        class ElectricEngine implements Engine {

            @Override
            public void start() {
                System.out.println("Електричний двигун увімкнено");
            }
        }

        //Клас, що делегує роботу
         class Car {

            private Engine engine;

            public Car(Engine engine) {
                this.engine = engine;
            }

            public void startCar() {
                engine.start(); // делегування
            }
        }

        //Сценарій роботи
        Car car1 = new Car(new PetrolEngine());
        Car car2 = new Car(new ElectricEngine());

        car1.startCar();
        car2.startCar();
    }
}
