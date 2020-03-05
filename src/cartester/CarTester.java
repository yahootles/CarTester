/*
 * Andrew Thompson
 * March 5, 2020
 * Makes and displays information of cars
 */
package cartester;

/**
 *
 * @author antho6229
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car1 = new Car("Black", 2006, "Toyota", "Matrix", "meep", 2000);
        Car car2 = new Car(2010, "Subaru", "Forester");
        Car car3 = new Car();

        //Car1.name = "spot";
        System.out.println(car1.getPrice());
        System.out.println(car2.getPrice());
        System.out.println(car3.getPrice());

        //Print the details of each Car
        System.out.println(car1.toString());
        System.out.println("--------------------------");

        System.out.println(car2.toString());
        System.out.println("--------------------------");

        //toString is called by default, no need to write it!
        System.out.println(car3);
        System.out.println("--------------------------");

        //honk horns
        System.out.println(car1.honkHorn());
        System.out.println(car2.honkHorn());
        System.out.println(car3.honkHorn());

    }

}
