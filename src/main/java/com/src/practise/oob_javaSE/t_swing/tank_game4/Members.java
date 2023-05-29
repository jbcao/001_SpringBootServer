package com.src.practise.oob_javaSE.t_swing.tank_game4;
import javax.sound.sampled.*;
import java.io.*;
import java.util.Vector;

/**
 * 功能
 *
 * @author caojianbang
 * @date 21/11/2021 22:12
 */
//播放声音的类
class AePlayWave extends Thread {
    private String filename;
    public AePlayWave(String wavfile) {
        filename = wavfile;
    }

    public void run() {
        File soundFile = new File(filename);
        AudioInputStream audioInputStream = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(soundFile);
        } catch (Exception e1) {
            e1.printStackTrace();
            return;
        }

        AudioFormat format = audioInputStream.getFormat();
        SourceDataLine auline = null;
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

        try {
            auline = (SourceDataLine) AudioSystem.getLine(info);
            auline.open(format);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        auline.start();
        int nBytesRead = 0;
        //这是缓冲
        byte[] abData = new byte[2048];

        try {
            while (nBytesRead != -1) {
                nBytesRead = audioInputStream.read(abData, 0, abData.length);
                if (nBytesRead >= 0)
                    auline.write(abData, 0, nBytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } finally {
            auline.drain();
            auline.close();
        }
    }
}


class Node {
    int x;
    int y;
    int direct;

    public Node(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }
}
//记录类

/**
 * 可以保存玩家设置
 * 通用做法：设置记录在内存，高效
 */
class Recorder {
    //记录每关有多少个敌人
    private static int enNum = 20;
    //记录我有多少可以用的人
    private static int myLife = 3;
    //消灭多少敌人
    private static int allEnNum = 0;
    private static FileWriter fw = null;
    private static BufferedWriter bw = null;
    private static FileReader fr = null;
    private static BufferedReader br = null;
    //从文件中恢复记录点
    static Vector<Node> nodes = new Vector<>();

    private static Vector<Enermy> ets1 = new Vector<>();

    //完成读取行为
    public Vector<Node> getNodesAndEnMums() {
        try {
            fr = new FileReader("/Users/apple/Desktop/Files/io-file/recording.txt");
            br = new BufferedReader(fr);
            String n = "";
            //先读第一行
            n = br.readLine();
            allEnNum = Integer.parseInt(n);
            /**
             * 重要：继续读
             */
            while ((n = br.readLine()) != null) {
                /**
                 *
                 */
                String[] xyz = n.split(" ");
                Node node = new Node(Integer.parseInt(xyz[0]), Integer.parseInt(xyz[1]), Integer.parseInt(xyz[2]));
                nodes.add(node);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /**
         *
         */
        return nodes;
    }

    public static void keepRecAndEnemyTank() {
        //创建
        try {
            fw = new FileWriter("/Users/apple/Desktop/Files/io-file/recording.txt");
            bw = new BufferedWriter(fw);
            bw.write(allEnNum + "\r\n");
            //保存活着的敌人坦克的坐标和方向
            for (int i = 0; i < ets1.size(); i++) {
                Enermy et = ets1.get(i);
                if (et.isAlive) {
                    //活的就保存
                    String recode = et.x + " " + et.y + " " + et.direct;
                    bw.write(recode + "\r\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //从文件中读取记录
    public static void getRecording() {
        try {
            fr = new FileReader("/Users/apple/Desktop/Files/io-file/recording.txt");
            br = new BufferedReader(fr);
            String n = br.readLine();
            allEnNum = Integer.parseInt(n);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //保存玩家击毁敌人坦克
    public static void keepRecording() {
        //创建
        try {
            fw = new FileWriter("/Users/apple/Desktop/Files/io-file/recording.txt");
            bw = new BufferedWriter(fw);
            bw.write(allEnNum + "\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //消灭敌人
    public static void addEnNumRec() {
        allEnNum++;
    }

    public static int getAllEnNum() {
        return allEnNum;
    }

    public static void setAllEnNum(int allEnNum) {
        Recorder.allEnNum = allEnNum;
    }

    public static void reduceEnNum() {
        enNum--;
    }

    public static void reduceMyLife() {
        myLife--;
    }

    public static int getEnNum() {
        return enNum;
    }

    public static void setEnNum(int enNum) {
        Recorder.enNum = enNum;
    }

    public static int getMyLife() {
        return myLife;
    }

    public static void setMyLife(int myLife) {
        Recorder.myLife = myLife;
    }

    public static Vector<Enermy> getEts1() {
        return ets1;
    }

    public static void setEts1(Vector<Enermy> ets) {
        ets1 = ets;
    }
}

class Bomb {
    //定义坐标
    int x;
    int y;
    //炸弹生命
    int life = 9;
    boolean isAlive = true;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //减少生命值
    public void lifeDown() {
        if (life > 0) {
            life--;
        } else {
            isAlive = false;
        }
    }
}

//坦克类
class Tank {
    //坦克横坐标
    int x = 0;
    //坦克纵坐标
    int y = 0;
    //坦克方向
    // 0 上
    // 1 右
    // 2 下
    // 3 左
    int direct = 0;
    //速度
    int speed = 1;
    //颜色
    int color;
    boolean isAlive = true;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

//我的坦克
class Hero extends Tank {
    Vector<Shot> shots = new Vector<Shot>();
    //子弹是属于坦克的，聚合关系
    Shot shot = null;

    public Hero(int x, int y) {
        super(x, y);
    }

    public void shotEnemy() {
        switch (this.direct) {
            case 0:
                shot = new Shot(x + 9, y, 0);
                shots.add(shot);
                break;
            case 1:
                shot = new Shot(x + 30, y + 9, 1);
                shots.add(shot);
                break;

            case 2:
                shot = new Shot(x + 9, y + 30, 2);
                shots.add(shot);
                break;

            case 3:
                shot = new Shot(x, y + 9, 3);
                shots.add(shot);
                break;
        }
        Thread thread = new Thread(shot);
        thread.start();
    }

    //坦克向上移动
    public void moveUp() {
        y -= speed;
    }

    //坦克向右移动
    public void moveRight() {
        x += speed;
    }

    //坦克向下
    public void moveDown() {
        y += speed;
    }

    //坦克向左
    public void moveLeft() {
        x -= speed;
    }
}

//敌人坦克
//做成线程
class Enermy extends Tank implements Runnable {
    int time = 0;
    //定义向量，存放子弹
    //敌人添加子弹，应当在刚刚创建坦克，和敌人子弹死亡后
    //不要去new
    Vector<Shot> ss = new Vector<Shot>();
    //定义一个向量，可以访问到panel组件上所有敌人的坦克
    Vector<Enermy> ets = new Vector<>();

    //得到panel敌人的坦克向量
    public void setEts(Vector<Enermy> ets) {
        this.ets = ets;
    }

    public Enermy(int x, int y) {
        super(x, y);
    }

    //判断是否碰到别的敌人坦克
    public boolean isTouchOtherEnemy() {
        boolean b = false;

        switch (this.direct) {
            case 0:
                //我的坦克向上
                //取出所有敌人坦克
                for (int i = 0; i < ets.size(); i++) {
                    Enermy et = ets.get(i);
                    if (et != this) {
                        //如果敌人方向向上或者向下
                        if (et.direct == 0 || et.direct == 2) {
                            if (this.x >= et.x && this.x <= et.x + 20 && this.y >= et.y && this.y <= et.y + 30) {
                                b = true;
                            }
                            if (this.x + 20 >= et.x && this.x + 20 <= et.x + 20 && this.y >= et.y && this.y <= et.y + 30) {
                                b = true;
                            }

                        }//敌人坦克向左向右
                        if (et.direct == 1 || et.direct == 3) {
                            if (this.x >= et.x && this.x <= et.x + 30 && this.y >= et.y && this.y <= et.y + 20) {
                                b = true;
                            }
                            if (this.x + 20 >= et.x && this.x + 20 <= et.x + 30 && this.y >= et.y && this.y <= et.y + 20) {
                                b = true;
                            }
                        }
                    }

                }
                break;
            case 1:
                //我的坦克向右
                //取出所有敌人坦克
                for (int i = 0; i < ets.size(); i++) {
                    Enermy et = ets.get(i);
                    if (et != this) {
                        //如果敌人方向向上或者向下
                        if (et.direct == 0 || et.direct == 2) {
                            if (this.x + 30 >= et.x && this.x + 30 <= et.x + 20 && this.y >= et.y && this.y <= et.y + 30) {
                                b = true;
                            }
                            if (this.x + 30 >= et.x && this.x + 30 <= et.x + 20 && this.y + 20 >= et.y && this.y + 20 <= et.y + 30) {
                                b = true;
                            }

                        }//敌人坦克向左向右
                        if (et.direct == 1 || et.direct == 3) {
                            if (this.x + 30 >= et.x && this.x + 30 <= et.x + 30 && this.y >= et.y && this.y <= et.y + 20) {
                                b = true;
                            }
                            if (this.x + 30 >= et.x && this.x + 30 <= et.x + 30 && this.y + 20 >= et.y && this.y + 20 <= et.y + 20) {
                                b = true;
                            }
                        }
                    }

                }
                break;
            case 2:
                //我的坦克向下
                //取出所有敌人坦克
                for (int i = 0; i < ets.size(); i++) {
                    Enermy et = ets.get(i);
                    if (et != this) {
                        //如果敌人方向向上或者向下
                        if (et.direct == 0 || et.direct == 2) {
                            if (this.x >= et.x && this.x <= et.x + 20 && this.y + 30 >= et.y && this.y + 30 <= et.y + 30) {
                                b = true;
                            }
                            if (this.x + 20 >= et.x && this.x + 20 <= et.x + 20 && this.y + 30 >= et.y && this.y + 30 <= et.y + 30) {
                                b = true;
                            }

                        }//敌人坦克向左向右
                        if (et.direct == 1 || et.direct == 3) {
                            if (this.x >= et.x && this.x <= et.x + 30 && this.y + 30 >= et.y && this.y + 30 <= et.y + 20) {
                                b = true;
                            }
                            if (this.x + 20 >= et.x && this.x + 20 <= et.x + 30 && this.y + 30 >= et.y && this.y + 30 <= et.y + 20) {
                                b = true;
                            }
                        }
                    }

                }
                break;
            case 3:
                //我的坦克向左
                //取出所有敌人坦克
                for (int i = 0; i < ets.size(); i++) {
                    Enermy et = ets.get(i);
                    if (et != this) {
                        //如果敌人方向向上或者向下
                        if (et.direct == 0 || et.direct == 2) {
                            if (this.x >= et.x && this.x <= et.x + 20 && this.y >= et.y && this.y <= et.y + 30) {
                                b = true;
                            }
                            if (this.x >= et.x && this.x <= et.x + 20 && this.y + 20 >= et.y && this.y + 20 <= et.y + 30) {
                                b = true;
                            }

                        }//敌人坦克向左向右
                        if (et.direct == 1 || et.direct == 3) {
                            if (this.x >= et.x && this.x <= et.x + 30 && this.y >= et.y && this.y <= et.y + 20) {
                                b = true;
                            }
                            if (this.x >= et.x && this.x <= et.x + 30 && this.y + 20 >= et.y && this.y + 20 <= et.y + 20) {
                                b = true;
                            }
                        }
                    }

                }
                break;

        }
        return b;
    }

    //让敌人运动起来
    @Override
    public void run() {
        while (true) {

            switch (this.direct) {
                //方向一般顺时针方向
                case 0:
                    //向上
                    for (int i = 0; i < 30; i++) {
                        //控制活动范围
                        if (y > 0 && !this.isTouchOtherEnemy()) {
                            this.y -= speed;
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:
                    //向右
                    for (int i = 0; i < 30; i++) {
                        if (x < 400 && !this.isTouchOtherEnemy()) {
                            x += speed;
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    //向下
                    for (int i = 0; i < 30; i++) {
                        if (y < 300 && !this.isTouchOtherEnemy()) {
                            y += speed;
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    //向左
                    for (int i = 0; i < 30; i++) {
                        if (x > 0 && !this.isTouchOtherEnemy()) {
                            x -= speed;
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }
            time++;
            if (time % 2 == 0) {
                if (isAlive) {
                    if (ss.size() < 5) {
                        //没有子弹
                        //添加
                        Shot shot = null;
                        switch (direct) {
                            case 0:
                                shot = new Shot(x + 9, y, 0);
                                ss.add(shot);
                                break;
                            case 1:
                                shot = new Shot(x + 30, y + 9, 1);
                                ss.add(shot);
                                break;

                            case 2:
                                shot = new Shot(x + 9, y + 30, 2);
                                ss.add(shot);
                                break;

                            case 3:
                                shot = new Shot(x, y + 9, 3);
                                ss.add(shot);
                                break;
                        }
                        Thread thread1 = new Thread(shot);
                        thread1.start();
                    }

                }
            }
            //坦克随机产生一个新的方向
            //大于或等于 0.0并小于 1.0
            //double
            this.direct = (int) (Math.random() * 4);
            //判断敌人坦克是否死亡
            if (this.isAlive == false) {
                //坦克死亡后，退出线程
                //不然会成为僵尸线程
                break;
            }

        }

    }
}

/**
 * 子弹类
 */
//程序自主持续运行，线程
class Shot implements Runnable {
    int x;
    int y;
    int direct;
    boolean isAlive = true;
    int speed = 1;

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            switch (direct) {
                case 0:
                    //上
                    y -= speed;
                    break;
                case 1:
                    //右
                    x += speed;
                    break;
                case 2:
                    //下
                    y += speed;
                    break;
                case 3:
                    //左
                    x -= speed;
                    break;
            }
            //  System.out.println("x=" + x + "y=" + y);
            //判断子弹是否出界
            if (x < 0 || x > 400 || y < 0 || y > 300) {
                isAlive = false;
                break;
            }
        }

        //线程如何才能死亡
    }
}