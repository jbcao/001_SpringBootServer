package com.src.practise.oob_javaSE.t_swing.tank_game2;

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
    public Hero(int x, int y) {
        super(x, y);
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