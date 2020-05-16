package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код'

        String output=null;
        BufferedWriter writer = null;
        String string;

        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        output = reader.readLine();

        while (true){
            string=reader.readLine();
            list.add(string);
            if (string.equals("exit")) break;
        }
        reader.close();

        writer=new BufferedWriter(new FileWriter(output));

        for (int i = 0; i < list.size(); i++) {
            writer.write(list.get(i)+"\r\n");
            //writer.newLine();

        }

        writer.close();

        // C:\Users\Admin\Desktop\test\text3.txt

    }
}
