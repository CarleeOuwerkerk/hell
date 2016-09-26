/**
 * Created by foxma on 9/20/2016.
 */
public class Dispatcher {
    private StudentView studentView;
    private SchoolView schoolView;
    private HomeView homeView;
    private NoImportView noImportView;

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
            case ("HONE"):
                homeView.show();
            default:
                noImportView.show();
                homeView.show();
                break;
        }
    }
}