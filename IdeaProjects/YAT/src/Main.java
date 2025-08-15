import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder b = new StringBuilder("Candroid");
        b.deleteCharAt(0).append(" is my fav track ! ");
        System.out.println(b);

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int sec = c.get(Calendar.SECOND);
        int millis = c.get(Calendar.MILLISECOND);

        System.out.println(year+"-"+month+"-"+day+"   " +hour+":"+minute+":"+sec+":"+millis);

        ArrayList<String>names=new ArrayList<>();
        names.add("java");
        names.add("kotlin");
        names.add("dart");
                names.forEach(element->
                                System.out.println(element.toUpperCase())
                        );
    }
}
