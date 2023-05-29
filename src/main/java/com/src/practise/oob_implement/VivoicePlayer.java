package com.src.practise.oob_implement;

import com.src.practise.ooi_voice_announcements.VoiceAnnouncements;

/**
 * @author caojianbang
 * @date 2020/9/30 18:52
 */
public class VivoicePlayer implements AudioPlayer {
    @Override
    public void play() {
        VoiceAnnouncements.read("您好，我是vivoice,很高兴为您服务");
    }

    public static void main(String[] args) {
        VivoicePlayer vovicePlayer = new VivoicePlayer();
        vovicePlayer.play();
    }
}
