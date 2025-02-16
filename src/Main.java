import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(150, true, 200, 5000000, "A123BC", "BMW"));
        cars.add(new Car(300000, false, 100, 100000, "D456EF", "LADA"));

        List<Plane> planes = new ArrayList<>();
        planes.add(new Plane(800, 50000000, "123SSS", "JET", 50));
        planes.add(new Plane(500, 10000000, "777AAA", "JET VIP", 100));


        //Найти стоимость и пробег заданного автомобиля
        Car car = cars.get(0);
        System.out.println("Стоимость автомобиля: " + car.getCost() + ". Пробег: " + car.getMileage());

        // налог на регистрацию всех машин (5% от стоимости)
        double CarTax = 0; // налог на авто
        for (Car s : cars){
            double carTax = s.getCost() * 0.05;
        }
        System.out.println("Налог на регистрацию всех машин составляет: " + CarTax);

        //прошел ли техосмотр владелец самой дорогой машины

        //ищем самую дорогую машину
        Car mostExpensiveCar = cars.get(0); //предпологаем что 1 машина самая дорогая
        for (Car s : cars){
            if (s.getCost() > mostExpensiveCar.getCost()) {
                mostExpensiveCar = s; // если нашли дороже то обновляем переменную
            }
        }
        // проверяем прошла ли она техосмотр
        System.out.println("Самая дорогая машина" + mostExpensiveCar);
        if(mostExpensiveCar.isTechInsp()){
            System.out.println(" прошла тех осмотр");
        } else {
            System.out.println(" не прошла тех осмотр");
        }

    }
}
