/**
 * Created by foxma on 9/26/2016.
 */
public class NoImportView {

        public void show() {
            System.out.println("no Input auto send to home.");
            Matts matts = new Matts();
            matts.dispatchRequest("STUDENT");
        }

}
