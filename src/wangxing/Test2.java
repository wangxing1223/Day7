package wangxing;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * Created by Administrator on 13-7-29.
 */

//判断101-200之间有多少个素数，并输出所有素数。
public class Test2 {
    public static void main(String[] args) {
        int n = 0;
        int counter = 0;
        for (int i = 101; i < 201; i++) {
            for (int j = 2; j <= i/2 ; j++) {
                if (i%j == 0){
                    break;
                }
                 n = j;

            }
            if ( n == i/2){
                counter++;
                System.out.println(i +"是素数");
            }

        }
        System.out.println("101到200之间素数的个数是：" + counter);
    }
}
