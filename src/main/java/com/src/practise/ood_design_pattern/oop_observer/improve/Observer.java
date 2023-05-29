package com.src.practise.ood_design_pattern.oop_observer.improve;

/**
 * 观察者接口，由具体观察者来实现
 */
public interface Observer {
    public void update(float temperature, float pressure, float humidity);
}
