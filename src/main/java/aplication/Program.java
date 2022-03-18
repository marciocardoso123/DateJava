package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
       Date d = Date.from(Instant.parse("2018-06-25T15:41:32Z"));

        System.out.println(d);


        //crio um calendario e set a data dentro depois adiciono 4 horas a hora inicial
        /*Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY,4);
        d = cal.getTime();
        System.out.println(d);*/

        //obtendo uma unidade de tempo
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int minutes = cal.get(Calendar.MINUTE);
        System.out.println("Minutes: " + minutes);






    }
}
