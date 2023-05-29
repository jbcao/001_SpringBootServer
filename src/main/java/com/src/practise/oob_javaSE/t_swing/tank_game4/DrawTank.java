package com.src.practise.oob_javaSE.t_swing.tank_game4;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

/**
 * 功能
 * 1、子弹连发，最多5颗
 * 2、子弹击中敌人坦克，敌人消失
 *
 * @author caojianbang
 * @date 18/11/2021 16:01
 */
public class DrawTank extends JFrame implements ActionListener {
    MyPanel myPanel;
    MyStartpanel msp;
    //菜单条组件
    JMenuBar jmb;
    //开始游戏
    JMenu jm1;
    JMenuItem jmi1;
    JMenuItem jmi2;
    JMenuItem jmi3;
    JMenuItem jmi4;

    public static void main(String[] args) {
        DrawTank drawTank = new DrawTank();
    }

    public DrawTank() {

        //创建菜单及菜单选项
        jmb = new JMenuBar();
        jm1 = new JMenu("游戏（G）");
        jm1.setMnemonic('G');
        jmi1 = new JMenuItem("开始新游戏（N）");
        jmi2 = new JMenuItem("退出游戏（E）");
        jmi3 = new JMenuItem("存盘退出（C）");
        jmi4 = new JMenuItem("继续上局游戏（S）");
        //注册事件监听
        jmi1.addActionListener(this);
        jmi1.setActionCommand("newgame");
        jmi2.setMnemonic('E');
        jmi2.addActionListener(this);
        jmi2.setActionCommand("exit");
        jmi3.addActionListener(this);
        jmi3.setActionCommand("saveexit");
        jmi4.addActionListener(this);
        jmi4.setActionCommand("conGame");
        jm1.add(jmi1);
        jm1.add(jmi2);
        jm1.add(jmi3);
        jm1.add(jmi4);
        jmb.add(jm1);

        msp = new MyStartpanel();
        this.add(msp);
        Thread thread1 = new Thread(msp);
        thread1.start();
        this.setJMenuBar(jmb);
        this.setSize(400, 430);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("newgame")) {
            myPanel = new MyPanel("newGame");
            //重要：移除旧的面板，加入新的
            this.remove(msp);
            this.add(myPanel);
            Thread thread = new Thread(myPanel);
            thread.start();
            this.addKeyListener(myPanel);
            //重要，少了出不来效果
            this.setVisible(true);

        } else if (e.getActionCommand().equalsIgnoreCase("exit")) {
            //用户点击点击系统菜单项
            //保存消灭坦克数量
            Recorder.keepRecording();
            System.exit(0);
        } else if (e.getActionCommand().equalsIgnoreCase("saveExit")) {
            //存盘退出作处理
            //保存击毁敌人数量和坐标
            Recorder.setEts1(myPanel.enermies);
            Recorder.keepRecAndEnemyTank();
            //退出
            System.exit(0);
        } else if (e.getActionCommand().equalsIgnoreCase("conGame")) {
            //
            myPanel = new MyPanel("conGame");
            //重要：移除旧的面板，加入新的
            this.remove(msp);
            this.add(myPanel);
            Thread thread = new Thread(myPanel);
            thread.start();
            this.addKeyListener(myPanel);
            //重要，少了出不来效果
            this.setVisible(true);
        }

    }
}

/**
 * 闪烁：线程，一会画图，一会不画
 */
class MyStartpanel extends JPanel implements Runnable {
    int i = 0;

    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 400, 300);
        if (i % 2 == 0) {
            g.setColor(Color.YELLOW);
            //开关信息字体
            //提示信息
            g.setFont(new Font("", Font.BOLD, 30));
            g.drawString("stage: 1", 150, 150);
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.repaint();
            i++;
        }
    }
}

//画坦克的面板组件
class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我的坦克
    Hero hero;
    Vector<Enermy> enermies = new Vector<Enermy>();
    Vector<Node> nodes = new Vector<>();
    //炸弹集合
    Vector<Bomb> bombs = new Vector<Bomb>();
    int size = 3;
    //定义三张图片，才能构成一颗炸弹
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public MyPanel(String flag) {
        //恢复记录
        Recorder.getRecording();
        hero = new Hero(100, 100);
        if (flag.equals("newGame")) {
            for (int i = 0; i < size; i++) {
                Enermy enermy = new Enermy((i + 1) * 50, 0);
                //指定颜色和方向
                enermy.setColor(0);
                enermy.setDirect(2);
                //将panel上敌人坦克向量交给敌人坦克
                /**
                 * 因为是通过引用传递的，一个引用修改它的值，其他引用可以直接感受到
                 */
                enermy.setEts(enermies);
                /**
                 * 初始化让敌人动起来
                 */
                Thread thread = new Thread(enermy);
                thread.start();
                //初始方向为向下
                Shot shot = new Shot(enermy.x + 10, enermy.y + 30, 2);
                enermy.ss.add(shot);
                /**
                 * 功能多了，代码自然就会乱
                 * 但思路清晰，就没什么问题
                 */
                Thread thread1 = new Thread(shot);
                thread1.start();
                enermies.add(enermy);
            }
        } else {
            nodes = new Recorder().getNodesAndEnMums();
            for (int i = 0; i < nodes.size(); i++) {
                Node node = nodes.get(i);
                Enermy enermy = new Enermy(node.x, node.y);
                //指定颜色和方向
                enermy.setColor(0);
                enermy.setDirect(node.direct);
                //将panel上敌人坦克向量交给敌人坦克
                /**
                 * 因为是通过引用传递的，一个引用修改它的值，其他引用可以直接感受到
                 */
                enermy.setEts(enermies);
                /**
                 * 初始化让敌人动起来
                 */
                Thread thread = new Thread(enermy);
                thread.start();
                //初始方向为向下
                Shot shot = new Shot(enermy.x + 10, enermy.y + 30, 2);
                enermy.ss.add(shot);
                /**
                 * 功能多了，代码自然就会乱
                 * 但思路清晰，就没什么问题
                 */
                Thread thread1 = new Thread(shot);
                thread1.start();
                enermies.add(enermy);
            }
        }

        try {
            image1 = ImageIO.read(new File("image/bomb_1.gif"));
            image2 = ImageIO.read(new File("image/bomb_2.gif"));
            image3 = ImageIO.read(new File("image/bomb_3.gif"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        AePlayWave aePlayWave = new AePlayWave("/Users/apple/Desktop/Files/io-file/directory20211126/O-Bravo_-_We_are_young_and_fun.wav");
        aePlayWave.start();
//        image1 = Toolkit.getDefaultToolkit().getImage("image/bomb_1.gif");
//        image2 = Toolkit.getDefaultToolkit().getImage("image/bomb_2.gif");
//        image3 = Toolkit.getDefaultToolkit().getImage("image/bomb_3.gif");
    }

    //写一个函数判断子弹是否击中坦克
    public void hitTank(Shot s, Tank et) {
        //判断坦克防方向
        switch (et.direct) {
            //判断敌人方向
            case 0:
            case 2:
                if (s.x > et.x && s.x < et.x + 20 && s.y > et.y && s.y < et.y + 30) {
                    //击中
                    //子弹死亡
                    s.isAlive = false;
                    //敌人坦克死亡
                    et.isAlive = false;
                    //创建一个炸弹，放入集合
                    Bomb bomb = new Bomb(et.x, et.y);
                    this.bombs.add(bomb);
                }
                break;
            case 1:
            case 3:
                if (s.x > et.x && s.x < et.x + 30 && s.y > et.y && s.y < et.y + 20) {
                    //击中
                    //子弹死亡
                    s.isAlive = false;
                    //敌人坦克死亡
                    et.isAlive = false;
                    //创建一个炸弹，放入集合
                    Bomb bomb = new Bomb(et.x, et.y);
                    this.bombs.add(bomb);
                }
                break;
        }

    }

    public void paint(Graphics g) {
        super.paint(g);
        //定义活动区域
        g.fillRect(0, 0, 400, 300);
        //显示记录信息
        this.showInfo(g);

        /**
         * 画我的坦克
         */
        if (hero.isAlive) {
            //画坦克
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
        }

        for (int i = 0; i < hero.shots.size(); i++) {
            Shot myShot = hero.shots.get(i);
            //画出子弹，不能上来就画，要判断有没有
            //希望子弹跑起来，线程
            //希望程序自主连续执行，线程
            if (myShot != null && myShot.isAlive) {
                g.draw3DRect(myShot.x, myShot.y, 1, 1, false);
            }
            if (myShot.isAlive == false) {
                //从向量中删除该子弹
                //重要！！！：不用remove（i），可能删除的i，后面要使用i++
                //子弹，坦克消失，即是画图时候不画
                hero.shots.remove(myShot);
            }
        }
        //画爆炸
        for (int i = 0; i < bombs.size(); i++) {
            Bomb b = bombs.get(i);
            if (b.life > 6) {
                g.drawImage(image1, b.x, b.y, 30, 30, this);
            } else if (b.life > 3) {
                g.drawImage(image2, b.x, b.y, 30, 30, this);
            } else {
                g.drawImage(image3, b.x, b.y, 30, 30, this);
            }
            //让b生命值减小
            b.lifeDown();
            //如果炸弹生命值为0，就在向量中去掉
            //equals    内容
            //==        地址，数值相等
            if (b.life == 0) {
                bombs.remove(b);
            }
        }

        //画敌人坦克
        for (int i = 0; i < enermies.size(); i++) {
            Enermy enermy = enermies.get(i);
            /**
             * 对象传递的，一个地方改变，其他地方也改变了
             * 敌人坦克活着画出，死亡不画
             */
            if (enermy.isAlive) {
                drawTank(enermy.getX(), enermy.getY(), g, enermy.getDirect(), 1);
                /**
                 * 画出敌人的子弹
                 */
                for (int j = 0; j < enermy.ss.size(); j++) {
                    //取出子弹
                    Shot shot = enermy.ss.get(j);
                    if (shot.isAlive) {
                        g.draw3DRect(shot.x, shot.y, 1, 1, false);

                    } else {
                        //      如果敌人坦克死亡，就从向量删除
                        enermy.ss.remove(shot);
                    }
                }
            }

        }
    }

    /**
     * 显示记录信息
     */
    public void showInfo(Graphics g) {
        /**
         * 画出提示信息坦克，该坦克不参与战斗
         */
        this.drawTank(80, 330, g, 0, 0);
        g.setColor(Color.BLACK);
        g.drawString(Recorder.getEnNum() + "", 110, 350);
        /**
         * 自己坦克信息
         */
        this.drawTank(130, 330, g, 0, 1);
        g.setColor(Color.BLACK);
        g.drawString(Recorder.getMyLife() + "", 165, 350);
        //画出玩家总成绩
        //g.setColor(Color.BLACK);
        //g.setFont(new Font("宋体", Font.BOLD, 20));
        g.drawString("总成绩：", 200, 350);
        this.drawTank(270, 330, g, 0, 0);
        g.setColor(Color.BLACK);
        g.drawString(Recorder.getAllEnNum() + "", 310, 350);

    }

    /**
     * 画图片函数
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        //判断坦克类型
        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }
        //判断方向
        switch (direct) {
            case 0:
                //画坦克
                //1.画出左边矩形
                g.fill3DRect(x, y, 5, 30, false);
                //2.画出右边
                g.fill3DRect(x + 15, y, 5, 30, false);
                //3.中间矩形
                g.fill3DRect(x + 5, y + 5, 10, 20, false);
                //4.中间圆形
                g.fillOval(x + 5, y + 10, 10, 10);
                //5.画出线
                g.drawLine(x + 10, y, x + 10, y + 15);
                break;
            case 1:
                //炮筒向右
                //画出上面矩形
                g.fill3DRect(x, y, 30, 5, false);
                //画出下面矩形
                g.fill3DRect(x, y + 15, 30, 5, false);
                //画出中间矩形
                g.fill3DRect(x + 5, y + 5, 20, 10, false);
                //画出圆形
                g.fillOval(x + 10, y + 5, 10, 10);
                //画出直线
                g.drawLine(x + 15, y + 10, x + 30, y + 10);
                break;
            case 2:
                //向下
                g.fill3DRect(x, y, 5, 30, false);
                //2.画出右边
                g.fill3DRect(x + 15, y, 5, 30, false);
                //3.中间矩形
                g.fill3DRect(x + 5, y + 5, 10, 20, false);
                //4.中间圆形
                g.fillOval(x + 5, y + 10, 10, 10);
                //5.画出线
                g.drawLine(x + 10, y + 10, x + 10, y + 30);
                break;

            case 3:
                //炮筒向左
                //画出上面矩形
                g.fill3DRect(x, y, 30, 5, false);
                //画出下面矩形
                g.fill3DRect(x, y + 15, 30, 5, false);
                //画出中间矩形
                g.fill3DRect(x + 5, y + 5, 20, 10, false);
                //画出圆形
                g.fillOval(x + 10, y + 5, 10, 10);
                //画出直线
                g.drawLine(x + 15, y + 10, x, y + 10);
                break;
        }


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //使用 asdw 四个键
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            this.hero.setDirect(0);
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            this.hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            this.hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            this.hero.setDirect(3);
            hero.moveLeft();
        }
        //else if 进入到一个入口就不会判断第二个入口
        //判断是否按下J键
        //可能ASDW和J同时被按下，所以需要单独判断
        if (e.getKeyCode() == KeyEvent.VK_J) {
            if (hero.shots.size() <= 4) {
                this.hero.shotEnemy();
            }

        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    /**
     * 判断击中敌人坦克
     */
    public void hitEnemyTank() {
        //判断是否击中
        for (int i = 0; i < hero.shots.size(); i++) {
            //取出子弹
            Shot shot = hero.shots.get(i);
            //判断子弹是否有效
            if (shot.isAlive) {
                for (int j = 0; j < enermies.size(); j++) {
                    //取出敌人坦克
                    Enermy enermy = enermies.get(j);
                    //判断是否存活
                    if (enermy.isAlive) {
                        this.hitTank(shot, enermy);
                        if (!enermy.isAlive) {
                            Recorder.reduceEnNum();
                            //增加消灭数量
                            Recorder.addEnNumRec();
                        }
                    }
                }
            }
        }
    }

    /**
     * 判断敌人击中我
     */
    public void hetMe() {
        for (int i = 0; i < enermies.size(); i++) {
            //取出坦克
            Enermy enermy = enermies.get(i);
            for (int j = 0; j < enermy.ss.size(); j++) {
                //取出子弹
                Shot shot = enermy.ss.get(j);
                if (hero.isAlive) {
                    hitTank(shot, hero);
                    if (!hero.isAlive) {
                        Recorder.reduceMyLife();
                    }
                }

            }

        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                //线程休息100毫秒
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.hitEnemyTank();
            this.hetMe();
            this.repaint();
        }

    }
}

