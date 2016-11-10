import java.util.HashMap;

/**
 * Created by foxma on 11/9/2016.
 */
public class Model {

    private HashMap<String, Integer> students = new HashMap<String,Integer>();

    public Model (){
        students.put("MAN",1);
        students.put("WOMAN",10);

    }

   public void add(String name, Integer number){
       students.replace(name,number);
   }

   public int getSexNum (String name){
       Integer sexNum = students.get(name);
       return sexNum;
   }

   public HashMap getMap(){
       return students;
   }
}
