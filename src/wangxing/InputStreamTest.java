package wangxing;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 13-7-29.
 */
public class InputStreamTest {
    public static void main(String[] args) {
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream( "c:/test.txt");
            while (true){
                int i = inputStream.read();
                if (i == -1){
                    break;
                }
                System.out.print((char) i + "\t");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }



        }
    }
}
