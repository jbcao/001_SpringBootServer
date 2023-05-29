package com.src.practise.ood_design_pattern.oop_observer.improve;

public class Client {
    public static void main(String[] args) {
        //创建一个weatherData
        WeatherData weatherData = new WeatherData();

        //创建一个观察者
        CurrentConditions currentConditions = new CurrentConditions();

        //注册观察者
        weatherData.registerObserver(currentConditions);

        //更新天气
        weatherData.setData(22f, 45f, 78f);
    }
}
