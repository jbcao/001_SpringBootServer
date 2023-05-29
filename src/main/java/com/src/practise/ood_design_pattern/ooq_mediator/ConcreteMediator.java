package com.src.practise.ood_design_pattern.ooq_mediator;

import java.util.HashMap;

/**
 * 具体中介者类
 */
public class ConcreteMediator extends Mediator {
    /**
     * 集合，放入所有同事对象
     */
    private HashMap<String, Colleague> colleagueHashMap;
    private HashMap<String, String> interMap;

    /**
     * 构造器
     */
    public ConcreteMediator() {
        this.colleagueHashMap = new HashMap<String, Colleague>();
        this.interMap = new HashMap<String, String>();
    }

    /**
     * @param colleagueName 同事名称
     * @param colleague     具体同事
     */
    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueHashMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }
    }

    /**
     * 具体中介者的核心方法
     * 1.根据得到消息，完成对应任务
     * 2.中介者在这个方法，协调各个具体同事对象，完成任务
     *
     * @param stateChange
     * @param colleagueName
     */
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        //处理闹钟发出的消息
        if (colleagueHashMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) colleagueHashMap.get(interMap.get("CoffeeMachine"))).startCoffee();
                ((TV) (colleagueHashMap.get(interMap.get("TV")))).startTV();
            } else if (stateChange == 1) {
                ((TV) (colleagueHashMap.get(interMap.get("TV")))).stopTV();
            }

        } else if (colleagueHashMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains) (colleagueHashMap.get(interMap.get("Curtains")))).upCurtains(                                                                                                                                                                   );
        } else if (colleagueHashMap.get(colleagueName) instanceof TV) {
            //如果 TV 发现消息
        } else if (colleagueHashMap.get(colleagueName) instanceof Curtains) {
            //如果是以窗帘发出的消息，这里处理...
        }
    }

    @Override
    public void sendMessage() {
    }
}
