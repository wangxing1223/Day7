package wangxing;

import java.util.Scanner;

/**
 * Created by Administrator on 13-7-29.
 */

//题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
//这是一个菲波拉契数列问题

public class Test1 {

    public static int method(int i){
        if (i == 1 ){
            return 1;
        }else if (i == 2){
            return 1;
        }else {
            return (method(i-1) + method(i-2));
        }
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input :");
        int n = scanner.nextInt();
        System.out.println("第" + n + "个月的兔子对数是：" + Test1.method(n));

    }
}
