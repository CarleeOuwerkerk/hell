import java.util.HashMap;

/**
 * Created by foxma on 11/9/2016.
 */
public class Controller {
    public Model model = new Model();
    String sex;

    public void findSex(int input){
        switch (input){
            case (1):
                sex = "MAN";
                break;
            case (2):
                sex = "WOMAN";
                break;
        }
    }

    public HashMap getMap(){
        return model.getMap();
    }
    public void addSex (){
        model.add(sex,(model.getSexNum(sex)+1));
    }
    public void subSex (){
        model.add(sex,(model.getSexNum(sex)-1));
    }
}
