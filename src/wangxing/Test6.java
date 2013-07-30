package wangxing;

import java.util.Scanner;

/**
 * Created by Administrator on 13-7-29.
 */

//题目：输入两个正整数m和n，求其最大公约数和最小公倍数
//在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个数作为下一轮循环的大数，取得的余
//作为下一轮循环的较小的数，如此循环直到较小的数的值为0，返回较大的数，此数即为最大公约数，
// 最小公倍数为两数之积除以最大公约数。

public class Test6 {

    public static void main(String[] args) {

        int s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：" );
        int n = scanner.nextInt();
        System.out.println("请再输入一个正整数：" );
        int m = scanner.nextInt();
        int max = m>=n?m:n;
        int min = m<n?m:n;
        int temp;
        while (min != 0){
            temp = min;
            min = max%min;
            max = temp;
        }
        System.out.println(max + "是最大公约数");
        System.out.println(m*n/max + "是最小公倍数");

    }
}
