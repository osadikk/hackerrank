package problem.solving;

public class DayOfTheProgrammer {
    //https://www.hackerrank.com/challenges/day-of-the-programmer/problem

    static String dayOfProgrammer(int year) {

        boolean isLeapYear=false;

        if((year<1919 && year%4==0) || (year>1918 && (year%400==0 || (year%4==0 && !(year%100==0)))))
            isLeapYear=true;

        System.out.println(isLeapYear);
        int sumDay=0;
        int month=0;
        for(int i=1;i<9;i++){
            month=i;
            if(i!=2 && (i==1 || i%2>0 || i==8 ) && sumDay+31<256 )
                sumDay+=31;
            else if((i!=2 && i!=8) && sumDay+30<256)
                sumDay+=30;
            else if(i==2 && isLeapYear && sumDay+29<256)
                sumDay+=29;
            else if(sumDay+28<256)
                sumDay+=28;
            else
                break;

        }
        System.out.println(sumDay);
        month=(month==8 && 256-sumDay>0) ? month+1: month;
        int  day= year==1918 ? (256-sumDay)+13 : 256-sumDay;
        return day+".0"+month+"."+year;
    }
}
