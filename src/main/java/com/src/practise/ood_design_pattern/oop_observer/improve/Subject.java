package com.src.practise.ood_design_pattern.oop_observer.improve;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
