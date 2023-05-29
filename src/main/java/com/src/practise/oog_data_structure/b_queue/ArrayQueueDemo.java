package com.src.practise.oog_data_structure.b_queue;

/**
 * 功能:数组队列
 *
 * @author caojianbang
 * @date 6.1.22 2:48 PM
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {

    }
}

class ArrayQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }

    //判断为满
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return rear == front;
    }

    //添加数据到队列
    public void addQueue(int n) {
        if (isEmpty()) {
            System.out.println("isfull");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    //出队列
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("isempty");
        }
        front++;
        return arr[front];
    }

    //显示队列所有数据
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("ïs empty");
            return;
        }
        for (int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]=%d\n",arr[i]);
        }
    }
    //显示队头数据，注意不是取出数据
    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("isempty");
        }
        return arr[front+1];
    }

}