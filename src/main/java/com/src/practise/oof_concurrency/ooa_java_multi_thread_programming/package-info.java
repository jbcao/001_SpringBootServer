/**
 * @author caojianbang
 * @date 2020/12/18 21:33
 */
package com.src.practise.oof_concurrency.ooa_java_multi_thread_programming;

/*
*   《多线程编程核心技术》
*
*                 —高洪岩 著
*
*
*
目录

第1章 Java多线程技能，

1.1 进程和多线程的概念及线程的优点
1.2 使用多线程
1.2.1 继承Thread类
1.2.2 实现Runnable接口
1.2.3 实例变量与线程安全
1.2.4 留意i——与System.out.println（）的异常
1.3 currentThread（）方法
1.4 isAlive（）方法
1.5 sleep（）方法
1.6 getId（）方法
1.7 停止线程
1.7.1 停止不了的线程
1.7.2 判断线程是否是停止状态
1.7.3 能停止的线程——异常法
1.7.4 在沉睡中停止
1.7.5 能停止的线程——暴力停止
1.7.6 方法stop（）与java.lang.ThreadDeath异常
1.7.7 释放锁的不良后果
1.7.8 使用return停止线程
1.8 暂停线程
1.8.1 suspend与resume方法的使用
1.8.2 suspend与resume方法的缺点——独占
1.8.3 suspend与resume方法的缺点——不同步
1.9 yield方法
1.10 线程的优先级
1.10.1 线程优先级的继承特性
1.10.2 优先级具有规则性
1.10.3 优先级具有随机性
1.10.4 看谁运行得快
1.11 守护线程
1.12 本章小结

第2章 对象及变量的并发访问

2.1 synchronized同步方法
2.1.1 方法内的变量为线程安全
2.1.2 实例变量非线程安全
2.1.3 多个对象多个锁
2.1.4 synchronized方法与锁对象
2.1.5 脏读
2.1.6 synchronized锁重入
2.1.7 出现异常，锁自动释放
2.1.8 同步不具有继承性
2.2 synchronized同步语句块
2.2.1 synchronized方法的弊端
2.2.2 synchronized同步代码块的使用
2.2.3 用同步代码块解决同步方法的弊端
2.2.4 一半异步，一半同步
2.2.5 synchronized代码块间的同步性
2.2.6 验证同步synchronized（this）代码块是锁定当前对象的
2.2.7 将任意对象作为对象监视器
2.2.8 细化验证3个结论
2.2.9 静态同步synchronized方法与synchronized（class）代码块
2.2.10 数据类型String的常量池特性
2.2.11 同步synchronized方法无限等待与解决
2.2.12 多线程的死锁
2.2.13 内置类与静态内置类
2.2.14 内置类与同步：实验1
2.2.15 内置类与同步：实验2
2.2.16 锁对象的改变
2.3 volatile关键字
2.3.1 关键字volatile与死循环
2.3.2 解决同步死循环
2.3.3 解决异步死循环
2.3.4 volatile非原子的特性
2.3.5 使用原子类进行i++操作
2.3.6 原子类也并不完全安全
2.3.7 synchronized代码块有volatile同步的功能
2.4 本章总结

第3章 线程间通信

3.1 等待/通知机制
3.1.1 不使用等待/通知机制实现线程间通信
3.1.2 什么是等待/通知机制
3.1.3 等待/通知机制的实现
3.1.4 方法wait（）锁释放与notify（）锁不释放
3.1.5 当interrupt方法遇到wait方法
3.1.6 只通知一个线程
3.1.7 唤醒所有线程
3.1.8 方法wait（long）的使用
3.1.9 通知过早
3.1.10 等待wait的条件发生变化
3.1.11 生产者/消费者模式实现
3.1.12 通过管道进行线程间通信：字节流
3.1.13 通过管道进行线程间通信：字符流
3.1.14 实战：等待/通知之交叉备份
3.2 方法join的使用
3.2.1 学习方法join前的铺垫
3.2.2 用join（）方法来解决
3.2.3 方法join与异常
3.2.4 方法join（long）的使用
3.2.5 方法join（long）与sleep（long）的区别
3.2.6 方法join（）后面的代码提前运行：出现意外
3.2.7 方法join（）后面的代码提前运行：解释意外
3.3 类ThreadLocal的使用
3.3.1 方法get（）与null
3.3.2 验证线程变量的隔离性
3.3.3 解决get（）返回null问题
3.3.4 再次验证线程变量的隔离性
3.4 类InheritableThreadLocal的使用
3.4.1 值继承
3.4.2 值继承再修改
3.5 本章总结

第4章 Lock的使用

4.1 使用ReentrantLock类
4.1.1 使用ReentrantLock实现同步：测试1
4.1.2 使用ReentrantLock实现同步：测试2
4.1.3 使用Condition实现等待/通知错误用法与解决
4.1.4 正确使用Condition实现等待/通知
4.1.5 使用多个Condition实现通知部分线程：错误用法
4.1.6 使用多个Condition实现通知部分线程：正确用法
4.1.7 实现生产者/消费者模式：一对一交替打印
4.1.8 实现生产者/消费者模式：多对多交替打印
4.1.9 公平锁与非公平锁
4.1.10 方法getHoldCount（）、getQueueLength（）和getWaitQueueLength（）的测试
4.1.11 方法hasQueuedThread（）、hasQueuedThreads（）和hasWaiters（）的测试
4.1.12 方法isFair（）、isHeldByCurrentThread（）和isLocked（）的测试
4.1.13 方法lockInterruptibly（）、tryLock（）和tryLock（long timeout，TimeUnit unit）的测试
4.1.14 方法awaitUninterruptibly（）的使用
4.1.15 方法awaitUntil（）的使用
4.1.16 使用Condition实现顺序执行
4.2 使用ReentrantReadWriteLock类
4.2.1 类ReentrantReadWriteLock的使用：读读共享
4.2.2 类ReentrantReadWriteLock的使用：写写互斥
4.2.3 类ReentrantReadWriteLock的使用：读写互斥
4.2.4 类ReentrantReadWriteLock的使用：写读互斥
4.3 本章总结

第5章 定时器Timer

5.1 定时器Timer的使用
5.1.1 方法schedule（TimerTask task， Date time）的测试
5.1.2 方法schedule（TimerTask task， Date firstTime， long period）的测试
5.1.3 方法schedule（TimerTask task， long delay）的测试
5.1.4 方法schedule（TimerTask task， long delay， long period）的测试
5.1.5 方法scheduleAtFixedRate（TimerTask task， Date firstTime， long period）的测试
5.2 本章总结

第6章 单例模式与多线程

6.1 立即加载/"饿汉模式"
6.2 延迟加载/"懒汉模式"
6.3 使用静态内置类实现单例模式
6.4 序列化与反序列化的单例模式实现
6.5 使用static代码块实现单例模式
6.6 使用enum枚举数据类型实现单例模式
6.7 完善使用enum枚举实现单例模式
6.8 本章总结

第7章 拾遗增补

7.1 线程的状态
7.1.1 验证NEW、RUNNABLE和TERMINATED
7.1.2 验证TIMED_WAITING
7.1.3 验证BLOCKED
7.1.4 验证WAITING
7.2 线程组
7.2.1 线程对象关联线程组：1级关联
7.2.2 线程对象关联线程组：多级关联
7.2.3 线程组自动归属特性
7.2.4 获取根线程组
7.2.5 线程组里加线程组
7.2.6 组内的线程批量停止
7.2.7 递归与非递归取得组内对象
7.3 使线程具有有序性
7.4 SimpleDateFormat非线程安全
7.4.1 出现异常
7.4.2 解决异常方法1
7.4.3 解决异常方法2
7.5 线程中出现异常的处理
7.6 线程组内处理异常
7.7 线程异常处理的传递
7.8 本章总结

*/