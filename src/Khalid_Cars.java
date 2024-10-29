import java.util.ArrayList;

public class Khalid_Cars {
    public static void main(String[] args) {
        //creating an arraylist of strings
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Porsche");
        cars.add("G Class");
        cars.add("Bentley");
        cars.add("Lambo");
        cars.add("Honda");
        cars.set(4, "Bugatti");

        System.out.println(cars); // print out the tostring
        System.out.println("---------------");

        //printing cars using foreach loop
        for (String car : cars) {
            System.out.println(car);
        }


    }
}
