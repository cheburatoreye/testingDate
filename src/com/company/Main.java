package com.company;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Main {

    private static String defineDayOfWeek(String dateString){

//----------------------------------------------------------------------------------------------------------------------
        String res="";// Определяю переменную типа string для возврата из метода

        Calendar cal =Calendar.getInstance();// получаю экземпляр календаря
        DateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");//создаю свой экземпляр формата даты
        cal.setTime(sdf.parse(dateString,new ParsePosition(0)));//делаю инит календаря по входящей в метод строке через парсинг моего формата даты

        sdf=new SimpleDateFormat("EEEE");// меняю формат даты на "день недели"
        res=sdf.format(cal.getTime());// через формат даты "день недели" получаю день недели текущей даты из календаря что инитил
        res=res.substring(0,1).toUpperCase()+res.substring(1);// первую букву в слове делаю большую

//Получаю тот же день недели через локал зону инглиш
        sdf = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        System.out.println(sdf.format(cal.getTime()));

//----------------------------------------------------------------------------------------------------------------------
        return res;// возвращаю строку результата метода defineDayOfWeek
    }


    public static void main(String[] args) {
	System.out.println(defineDayOfWeek("2019-09-25"));
	System.out.println(defineDayOfWeek("2018-09-25"));
	System.out.println(defineDayOfWeek("1500-09-25"));

    }
}
