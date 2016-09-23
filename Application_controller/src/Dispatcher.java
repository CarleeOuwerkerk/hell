/**
 * Created by foxma on 9/20/2016.
 */
public class Dispatcher {
    private StudentView studentView;
    private SchoolView schoolView;
    private HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        schoolView = new SchoolView();
        homeView = new HomeView();
    }

    public void dispatch(String request) {
        switch (request) {
            case ("STUDENT"):
                studentView.show();
                break;
            case ("SCHOOL"):
                schoolView.show();
                break;
            default:
                homeView.show();
                break;
        }
    }
}