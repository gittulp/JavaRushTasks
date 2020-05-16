package com.javarush.task.task13.task1317;

/* 
The weather is fine
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
        String type1 = WeatherType.CLOUDY;
        Today today = new Today(type1);
        System.out.println("my type "+type1);

    }

    static class Today implements Weather{
        private String type;

        Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }


        @Override
        public String getWeatherType() {
            return type;
        }

        public static String getget(){
            return null;
        }
    }
}
