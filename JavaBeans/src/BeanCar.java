/**
 * Created by samwa on 9/27/2016.
 */
public class BeanCar implements java.io.Serializable {

    private String name = null;

    private String color = null;

    private int age = 0;

    public BeanCar(){
    }

    public String getName(){
        return name;
    }

    public void setName(final String value){
        name = value;
    }

    public String getColor(){
        return color;
    }

    public void setColor(final String value){
        color = value;
    }

    public int getAge(){
        return age;
    }

    public void setAge(final int value){
        age = value;
    }
}
