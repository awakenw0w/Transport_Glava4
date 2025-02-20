import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(150, true, 200, 5000000, "A123BC", "BMW"));
        cars.add(new Car(300000, false, 100, 100000, "D456EF", "LADA"));

        List<Plane> planes = new ArrayList<>();
        planes.add(new Plane(800, 50000000, "123SSS", "JET", 50));
        planes.add(new Plane(500, 10000000, "777AAA", "JET VIP", 100));

        // Для заданного автомобиля найти стоимость и пробег.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номерной знак автомобиля, который хотите найти: ");
        String inputeCarNumber = scanner.nextLine();
        //поиск автомобиля по номеру
        for (Car car : cars) {
            if (car.getNumber().equals(inputeCarNumber)) {
                System.out.println("Автомобиль с номером " + car.getNumber() + " имеет пробег " + car.getMileage() + " и стоит " + car.getCost());
                break;
            }
        }

        // налог на регистрацию всех машин (5% от стоимости)
        double CarTax = 0; // налог на авто
        for (Car s : cars){
            double carTax = s.getCost() * 0.05;
            CarTax += carTax;
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
        String soutTechInsp;
        if(mostExpensiveCar.isTechInsp()){
            soutTechInsp = " прошла тех осмотр";
        } else {
            soutTechInsp = " не прошла тех осмотр";
        }

        System.out.println("Самая дорогая машина " + mostExpensiveCar.getBrand() + soutTechInsp);

        // Для заданного самолета найти мощность и максимальную высоту полета.
        System.out.println("Введите номерной знак самолета, который хотите найти: ");
        String inputPlaneNumber = scanner.nextLine();
        for(Plane plane : planes){
            if(plane.getNumber().equals(inputPlaneNumber)){
                System.out.println("Самолет с номером " + plane.getNumber() + " имеет мощность " + plane.getPower() + " и максимальнуюв высоту полета " + plane.getFlyingHeight());
                break;
            }
        }

        //налог с регистрации всех самолетов 3%
        double PlaneTax = 0; //налог на самолеты
        for (Plane p : planes) {
            double planeTax = p.getCost() * 0.03;
            PlaneTax += planeTax;
        }
        System.out.println("Налог на регистрацию всех самолетов составляет: " + PlaneTax);

        //определить мощность стоимость и марку самого дорого самолета
        //ищем сначала самый дорогй самолет
        Plane mostExpensivePlane = planes.get(0); // препдпологаем  что 1 самолет самыйдорогой
        for (Plane i : planes){
            if (i.getCost() > mostExpensivePlane.getCost()){
                mostExpensivePlane = i;
            }
        }
        // определяем мощность стоимость и марку
        System.out.println("Мощность, стоимость и марка самого дорого самолета: " + mostExpensivePlane.getPower() + "; " + mostExpensivePlane.getCost() + "; " + mostExpensivePlane.getBrand());
    }
}
