package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /*
         *   练习：
         *       文件拷贝
         *       把D:\itheima\movie.mp4拷贝到当前模块下。
         *
         *   注意：
         *       选择一个比较小的文件，不要太大。大文件拷贝我们下一个视频会说。
         *
         *
         *
         *   课堂练习：
         *       要求统计一下拷贝时间，单位毫秒
         * */

        long start = System.currentTimeMillis();

        //1.创建对象
        FileInputStream fis = new FileInputStream("D:\\aaa\\a.avi");
        FileOutputStream fos = new FileOutputStream("D:\\aaa\\ccc\\acopy.avi");
        //2.拷贝
        //核心思想：边读边写
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        //3.释放资源
        //规则：先开的最后关闭
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();

        System.out.println((end - start)+"ms");

    }
}
