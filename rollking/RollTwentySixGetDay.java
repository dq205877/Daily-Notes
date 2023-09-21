package rollking;

public class RollTwentySixGetDay {
    public static void main(String[] args) {
        //System.out.println(dayOfYear("2003-03-01"));
        System.out.println(dayOfYear("2008-10-10"));
    }

    public static int dayOfYear(String date) {
        //判断是否闰年
        String[] strArr = date.split("-");
        //小于月数，天数相加，再减去差值 
        //比如2018-01-30  31 －（31-30） ＝ 第30天
        boolean isRun = isRun(Integer.valueOf(strArr[0]));
        int month = Integer.valueOf(strArr[1]),lastMonthDayCount = 0;
        int result = 0;
        while(month > 0){
            //第一次获取最后一个月的天数
            if(lastMonthDayCount == 0){
                lastMonthDayCount = getDayCount(month,isRun);
            }
            result += getDayCount(month,isRun);
            month--;
        }
        //减去差值
        result -= lastMonthDayCount - Integer.valueOf(strArr[2]);
        return result;
    }

    //判断年是否闰年
    private static boolean isRun(int year){
        //1. 每4年一闰
        //2. 每100年不闰
        //3. 每400年又要闰
        boolean isRun = false;
        if(year % 4 == 0){
            isRun = true;
            if(year % 100 == 0){
                isRun = false;
            }
        }
        if(year % 400 == 0){
            isRun = true;
        }
        return isRun;
    }

    //获取每月的天数
    private static int getDayCount(int month,boolean isRun){
        int dayCount = 0;
        //13578 10 12 -  4 6 9 11
        switch(month){
            case 4:
                dayCount = 30;
                break;
            case 6:
                dayCount = 30;
                break;
            case 9:
                dayCount = 30;
                break;
            case 11:
                dayCount = 30;
                break;
            case 2:
                if(!isRun)
                dayCount = 28;  
                else
                dayCount = 29;

                break;
            //13578 10 12    
            default:
                dayCount = 31;
        }
        return dayCount;
    }
    
}
