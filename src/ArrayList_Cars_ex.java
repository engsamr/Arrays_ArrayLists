import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Cars_ex {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Porsche");
        cars.add("Bugati");
        cars.add("Ford");
        cars.add("Mercedes");
        cars.add("maserati");
        cars.add("Tesla");
        cars.add("Lamborghini");
        System.out.println(cars);
        cars.add(2, "Bently");
        System.out.println("----------------------------");
        System.out.println(cars);
        System.out.println("----------------------------");
        cars.set(3, "BMW");
        System.out.println(cars);
        System.out.println("----------------------------");

        //printing out each car using for loops
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println("----------------------------");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        //Sort cars
        System.out.println("----------------------------");
        Collections.sort(cars);
        System.out.println(cars);
    }
}
