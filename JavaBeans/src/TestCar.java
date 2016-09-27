/**
 * Created by samwa on 9/27/2016.
 */
public class TestCar {

    public static void main(String[] args) {
        BeanCar car = new BeanCar();

        car.setName("Mustang");
        car.setColor("Red");
        car.setAge(5);

        System.out.println(car.getColor());
        System.out.println(car.getName());
        System.out.println(car.getAge());

    }
}
