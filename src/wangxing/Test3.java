package wangxing;

/**
 * Created by Administrator on 13-7-29.
 */

//打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
public class Test3 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10 ; j++) {
                for (int k = 0; k < 10 ; k++) {
                    if(i*i*i+j*j*j+k*k*k == 100*i+10*j+k){
                        System.out.println(100*i+10*j+k + "是水仙花数！");
                    }

                }

            }
        }
    }
}
