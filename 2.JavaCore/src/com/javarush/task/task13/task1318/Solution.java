package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        InputStream inputStream=null;
        InputStreamReader input;
        String date="";
        BufferedInputStream buffer = null;

        BufferedReader name = new BufferedReader(new InputStreamReader(System.in));

        String  snane=name.readLine();

        inputStream = new FileInputStream(snane);

        buffer = new BufferedInputStream(inputStream);

        while (buffer.available()>0) {
            char c=(char)buffer.read();
            date=date+c;
        }

        System.out.println(date);
        inputStream.close();
        name.close();
        buffer.close();
    }
}