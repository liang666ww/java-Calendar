package 二月红;

import javax.sound.midi.Soundbank;
import java.util.Calendar;
import java.util.Scanner;

//计算某年中二月份的天数
public class calendartext {
    public static void main(String[] args) {
        //输入年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        //设置日历对象的年月日
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);//外国的月份从0开始
        c.add(Calendar.DATE,-1);
        int date = c.get(Calendar.DATE);
        System.out.println(year+"有"+date+"天");

    }
}
