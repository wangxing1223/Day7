package wangxing;

import java.io.*;

/**
 * Created by Administrator on 13-7-29.
 */
public class ReaderWriterTest {

    public static void main(String[] args) {

        Reader reader= null;
        Writer writer = null;
        try {
            reader = new FileReader("Day7/src/wangxing/ReaderWriterTest");
            writer = new FileWriter("test");
            int i ;
            while ((i = reader.read() )!=-1){
                System.out.println((char)i);
                writer.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
