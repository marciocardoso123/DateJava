package aplication;

import java.sql.SQLOutput;
import java.util.Date;

public class ProgramDate {
    public static void main(String[] args) {
        //data atual
        Date x1 = new Date();
        //data atual do sistema
        Date x2 = new Date(System.currentTimeMillis());
        //primeira data
        Date x3 = new Date(0L);
        //criando data considerando que tem 3h de diferença com EUA
        //                  miliss * seg*hs*hora q se quer +3
        Date x4 = new Date(1000l * 60l *60l *10l);


        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);


    }
}
