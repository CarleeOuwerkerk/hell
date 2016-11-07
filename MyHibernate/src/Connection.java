import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by samwa on 11/3/2016.
 */
public class Connection {

    private List<CarDatabase> car;
    private Config theConfig;

    public Connection(){
        theConfig = new Config();
    }

    public static void main(String[] args){
        Connection theConnection = new Connection();
       theConnection.addCar();

    }

    private void addCar(){
        Session session = theConfig.getCurrentSession();
        Transaction trans = session.beginTransaction();

        CarDatabase cars = new CarDatabase();
        cars.setCarName("Mustang");
        cars.setCarColor("Red");
        cars.setCarAge(3);

        session.save(cars);
        trans.commit();

        System.out.println("Car ID: " + cars.getCarKey());
    }

    private void showCar(){
        Session session = theConfig.getCurrentSession();

        Transaction trans = session.beginTransaction();
    }



}
