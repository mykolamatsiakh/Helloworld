import com.devcolibri.Cat;
import com.devcolibri.People;

public class Main {

    static Cat cat = new Cat();

    static People people = new People();
      public static void main(String[] args) {
          cat.name="James";
          cat.poroda="Meow";
          cat.age=17;


          people.name="Mykola";
          people.lastName="Matsyakh";
          people.age=17;

            people.cat=cat;
            System.out.print(people);
            cat.say();
            people.cat.say();
        }
    }








