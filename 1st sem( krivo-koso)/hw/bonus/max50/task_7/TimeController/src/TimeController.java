import java.util.ArrayList;
import java.util.Collections;

public class TimeController {
    public static void main(String[] args)
    {
        ArrayList<String> clubs = new ArrayList<String>();
        ArrayList<Integer> time = new ArrayList<Integer>();
        clubs.add("Футбол");
        clubs.add("Хоккей");
        clubs.add("Киберспорт");
        clubs.add("Биатлон");
        clubs.add("Плавание");

        time.add(200);
        time.add(75);
        time.add(320);
        time.add(60);
        time.add(85);

        System.out.println("Занятие с MAX суммарным временем: " + (getActionWithMaxTime(clubs,time)));
    }
    public static String getActionWithMaxTime(ArrayList<String> clubs, ArrayList<Integer> time)
    {
        return clubs.get(time.indexOf(Collections.max(time)));
    }
}
