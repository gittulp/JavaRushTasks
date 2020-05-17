package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        ArrayList<Integer> list = new ArrayList<>();


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName=reader.readLine();
        reader.close();

        FileInputStream fileInputStream=new FileInputStream(fileName);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(fileInputStream));


        String line;
        while (true){
            line=reader1.readLine();
            if (line==null) break;
            list.add(Integer.parseInt(line));
        }
        fileInputStream.close();
        reader1.close();


        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i))%2!=0) {
                list.remove(i--);
            }
        }

        Collections.sort(list);

        for (Integer x:list) {
           System.out.println(x);

        }

        //C:\Users\Admin\Desktop\dev\java\text3.txt

    }
}
