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
        int month = cal.get(Calendar.MONTH);
        int seconds = cal.get(Calendar.SECOND);
        int milliseconds = cal.get(Calendar.MILLISECOND);
        int hours = cal.get(Calendar.HOUR);
        int year =cal.get(Calendar.YEAR);
        int week_of_month =cal.get(Calendar.WEEK_OF_MONTH);

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
        System.out.println("Milliseconds: " + milliseconds);
        System.out.println("Week_of_month: " + week_of_month);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);









    }
}
