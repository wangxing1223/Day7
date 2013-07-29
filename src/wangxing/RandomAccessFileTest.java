package wangxing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 13-7-29.
 */
public class RandomAccessFileTest {

    public static void main(String[] args) {
        try {
            RandomAccessFile f = new RandomAccessFile("test.txt","rw");
            double d;
            for (int i = 0; i < 10; i++){
                f.writeDouble(0.5*i);
            }
            f.seek(16);
            f.writeDouble(0);
            f.seek(0);
            for (int i = 0; i < 10; i++) {
                d = f.readDouble();
                System.out.println("[" + i + "]" + d);
            }
            f.close();

        } catch (IOException e){
            System.out.println("发生异常 " + e);
            e.printStackTrace();
        }
    }
}



                


