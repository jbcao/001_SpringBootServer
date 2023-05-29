package com.src.practise.oob_javaSE.t_swing.tank_game3;

/**
 * 功能
 *
 * @author caojianbang
 * @date 21/11/2021 22:12
 */
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
    //子弹是属于坦克的，聚合关系
    Shot shot = null;

    public Hero(int x, int y) {
        super(x, y);
    }

    public void shotEnemy() {
        switch (this.direct) {
            case 0:
                shot = new Shot(x + 9, y, 0);
                break;
            case 1:
                shot = new Shot(x + 30, y + 9, 1);
                break;

            case 2:
                shot = new Shot(x + 9, y + 30, 2);
                break;

            case 3:
                shot = new Shot(x, y + 9, 3);
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
class Enermy extends Tank {
    public Enermy(int x, int y) {
        super(x, y);
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
    int speed = 5;

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
            System.out.println("x=" + x + "y=" + y);
            //判断子弹是否出界
            if (x<0||x>400||y<0||y>300) {
                isAlive = false;
                break;
            }
        }

        //线程如何才能死亡
    }
}