package com.src.practise.oob_implement;

import com.src.practise.ooi_voice_announcements.VoiceAnnouncements;

/**
 * @author caojianbang
 * @date 2020/9/30 19:00
 */
public class XiaoDuPlayer implements AudioPlayer {
    @Override
    public void play() {
        VoiceAnnouncements.read("hi，我是小度，小度");
    }
    public static void main(String[] args) {
        XiaoDuPlayer xiaoDuPlayer =new XiaoDuPlayer();
        xiaoDuPlayer.play();
        AudioPlayer audioPlayer = new XiaoDuPlayer();
        audioPlayer.play();
    }
}
