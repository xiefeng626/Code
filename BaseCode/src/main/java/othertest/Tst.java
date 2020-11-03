package othertest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;



public class Tst {

    static List<String> function(Date start, Date end){
        List<String> list = new ArrayList<String>();
        Long oneDay =1000*60*60*24l;

        long s = start.getTime();
        long e = end.getTime()+oneDay*maxMonth(end);



        while(s<=e ){
            start = new Date(s);
            list.add(new SimpleDateFormat("yyy-MM-dd").format(start));
            s+=oneDay*maxMonth(start);

        }
        return list;
    }

    static int maxMonth(Date date){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,date.getYear());
        cal.set(Calendar.MONDAY,date.getMonth());
        int max = cal.getActualMaximum(Calendar.DATE);
        return max;
    }

    public static void main(String[] args) {
//        Date date = new Date("2020/01/1");
//        Date date1 = new Date("2020/12/1");
//        List<String> function2 = function(date, date1);
//        for (String a:function2){
//            System.out.println(a);
//
//        }

        String aa="2012-12-01";
        String[] split = aa.split("-", 3);
        String s = split[0] + "-" + split[1];
        System.out.println(s);


    }


}
