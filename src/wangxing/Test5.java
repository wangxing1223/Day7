package wangxing;

import java.util.Scanner;

/**
 * Created by Administrator on 13-7-29.
 */
//利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
public class Test5 {

    public static void main(String[] args) {

        String s ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的成绩：");
        int grade = scanner.nextInt();
        s = grade>=90?"A":grade>=60?"B":"C";
        System.out.println(s);

    }
}
