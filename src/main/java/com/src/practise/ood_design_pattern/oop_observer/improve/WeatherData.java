package com.src.practise.ood_design_pattern.oop_observer.improve;


import java.util.ArrayList;

public class WeatherData implements Subject {
    private float temperatrue;
    private float pressure;
    private float humidity;
    /**
     * 聚合 观察者集合
     */
    private ArrayList<Observer> observers;

    /**
     * 构造器,通过构造器初始化一个空集合
     */
    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    /**
     * 当数据有更新时，就调用 setData
     *
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange， 将最新的信息 推送给 接入方 currentConditions
        notifyObserver();
    }


    /**
     * 注册一个观察者
     *
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除一个观察者
     *
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    /**
     * 遍历所有观察者进行通知
     */
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            //this是weatherData的
            //observer是观察者
            observers.get(i).update(this.temperatrue, this.pressure, this.humidity);
        }
    }
}
