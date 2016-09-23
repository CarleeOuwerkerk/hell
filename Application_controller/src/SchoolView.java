/**
 * Created by foxma on 9/20/2016.
 */
public class SchoolView {
    public void show() {
        System.out.println("Displaying school Page");
        Matts matts = new Matts();
        matts.dispatchRequest("STUDENT");
    }
}