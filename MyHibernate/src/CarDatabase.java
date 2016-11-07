import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by samwa on 11/3/2016.
 */

@Entity
@Table(name = "Car")

public class CarDatabase {
    @Id
    @GeneratedValue
        private int CarKey;
        private String CarName;
        private String CarColor;



    public CarDatabase() {

        CarName = "";
        CarColor = "";
        CarAge = 0;
    }

    @Override
    public String toString() {
        return "CarDatabase{" +
                "CarKey=" + CarKey +
                ", CarName='" + CarName + '\'' +
                ", CarColor='" + CarColor + '\'' +
                ", CarAge=" + CarAge +
                '}';
    }

    public void setCarKey(int carKey) {
        CarKey = carKey;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public void setCarColor(String carColor) {
        CarColor = carColor;
    }

    public void setCarAge(int carAge) {
        CarAge = carAge;
    }

    public int getCarKey() {

        return CarKey;
    }

    public String getCarName() {
        return CarName;
    }

    public String getCarColor() {
        return CarColor;
    }

    public int getCarAge() {
        return CarAge;
    }


    private int CarAge;

}
