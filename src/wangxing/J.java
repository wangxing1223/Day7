package wangxing;

/**
 * Created by Administrator on 13-7-30.
 */
//
//输出汉诺塔n圆盘移动步骤
//
//        A->B
//        A->C
//        B->C
//
//        递归

public class J {

    private static int counter = 0;
    public static void Hanoi(int n, char from, char use, char to)
    {
        if (n == 1){
            System.out.println(from + "->" + to);
            counter++;
        } else {
            Hanoi(n-1, from, to, use);
            System.out.println(from + "->" + to);
            counter++;
            Hanoi(n-1,  use, from, to);
        }

    }

    public static void main(String[] args) {
        int n = 2;
        Hanoi(n, 'A', 'B', 'C');
        System.out.println(counter);
    }
}
