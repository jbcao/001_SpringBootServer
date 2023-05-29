package com.src.practise.ooc_spring.ioc;

import com.src.practise.oob_implement.AudioPlayer;
import com.src.practise.oob_implement.XiaoDuPlayer;

/**
 * @author caojianbang
 * @date 2020/9/30 22:13
 */
public class InterfaceTest {
    public static void main(String[] args) {
        AudioPlayer audioPlayer =new XiaoDuPlayer();
        audioPlayer.play();
    }
}
