package com.src.practise.oob_implement;
import com.src.practise.ooi_voice_announcements.VoiceAnnouncements;
/**
 * @author caojianbang
 * @date 2020/9/30 17:38
 */
/**
 *
 */
public class XiaoMiPlayer implements AudioPlayer{
    @Override
    /**
     * 实现接口具体方法快捷键：CTRL+i
     */
    public void play() {
        System.out.println("我是小爱同学，很高兴为您服务");
        VoiceAnnouncements.read("我是小爱同学，很高兴为您服务");
    }
    //运行main快捷键：Ctrl+shift+f10
    public static void main(String[] args) {
        //作为一个类，接口实现类当然可以以一种常规类实例化方式出现，
        //但这样实现接口的这个操作就显得毫无意义
        //因此主要还是以实例化接口方式进行更为合理
        XiaoMiPlayer xiaoMiPlayer =new XiaoMiPlayer();
        xiaoMiPlayer.play();
        //实例的是接口
        //语法：接口名 接口对象=new 接口实现类构造方法
        //使用new方法，意味着接口只能用于特定类型的音频播放器
        //通过下面的操作，接口AudioPlayer与特定的接口实现类（例如XiaoMiPlayer）就形成了耦合
        //换句话说如果想用小度播放器，就必须进行创建与代码书写才行
        //大型系统的资源多达陈百上千，如果都采用这样的方式，系统会造成严重的耦合，不利于维护和扩展
        AudioPlayer audioPlayer = new XiaoMiPlayer();
        AudioPlayer xiaoDuPlayer  = new XiaoDuPlayer();
        AudioPlayer vivoicePlayer = new VivoicePlayer();
        audioPlayer.play();
        xiaoDuPlayer.play();
        vivoicePlayer.play();
    }
}
