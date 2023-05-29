package com.src.practise.oob_javaSE.o_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 功能：对象数组的使用
 *
 * 看书看着看着就看傻了
 */
public class Demo {
    public static void main(String[] args)throws Exception {
        //定义可以存放四只狗的对象数组
        Dog dogs[] = new Dog[4];
        //会报空指针异常
        //dogs[0]=new Dog();
        //dogs[0].setName("花花");
        //dogs[0].setWeight(2.7f);
        /**
         * 从控制台输入狗的信息
         */
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader  = new BufferedReader(inputStreamReader);
        for (int i = 0; i <dogs.length ; i++) {
            dogs[i]=new Dog();
            System.out.println("请输入狗名"+"第"+(i+1)+"只");
            String name = bufferedReader.readLine();
            dogs[i].setName(name);
            System.out.println("请输入狗的体重");
            String s_weight = bufferedReader.readLine();
            //String-->float
            float weight =Float.parseFloat(s_weight);
            dogs[i].setWeight(weight);

        }
        float total = 0;
        for (int i = 0; i <dogs.length ; i++) {
            total+=dogs[i].getWeight();
        }
        /**
         * 计算平均体重
         */

        float avg =total/dogs.length;
        System.out.println("平均体重狗"+avg);
        /**
         *找出最大体重的狗
         */
        //假设第一只狗体重最大
        float maxWeight=dogs[0].getWeight();
        int maxIndex =0;
        for (int i = 0; i <dogs.length ; i++) {
            if (maxWeight<dogs[i].getWeight()){
                maxWeight=dogs[i].getWeight();
                 maxIndex =i;
            }
        }
        System.out.println("第几只最重"+(maxIndex+1)+"这么重"+dogs[maxIndex].getWeight());
        /**
         * 计算最小值
         */
        float minWeight =dogs[0].getWeight();
        int minIndex=0;
        for (int i = 0; i <dogs.length ; i++) {
            if ( minWeight > dogs[i].getWeight()) {
                minWeight =dogs[i].getWeight();
                 minIndex = i;
            }
        }
        System.out.println("第几只最轻"+(minIndex+1)+"这么重"+dogs[minIndex].getWeight());
    }
}
class Dog{
    private float weight;
    private String name;

    public float getWeight() {
        return weight;
    }

    public Dog setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public String getName() {
        return name;
    }

    public Dog setName(String name) {
        this.name = name;
        return this;
    }
}