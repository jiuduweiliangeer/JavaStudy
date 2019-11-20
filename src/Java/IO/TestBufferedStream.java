package Java.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class TestBufferedStream {
    public static void main(String []args){
        try{
            FileInputStream fileInputStream=new FileInputStream("E:\\IDEA\\JAVA高级\\src\\Java\\HelloWorld.java");
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
            int c=0;
            System.out.println(bufferedInputStream.read());
            System.out.println(bufferedInputStream.read());
            bufferedInputStream.mark(100);
            for (int i = 0; i <10 && ((c=bufferedInputStream.read())!=-1) ; i++) {
                System.out.println(c+" ");
            }
            System.out.println();
            bufferedInputStream.reset();
            for (int i = 0; i <10 && ((c=bufferedInputStream.read())!=-1) ; i++) {
                System.out.println(c+" ");
            }
            bufferedInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}