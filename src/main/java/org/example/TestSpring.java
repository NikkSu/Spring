package org.example;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("rapMusic", Music.class);
        Music music1 = context.getBean("classicalMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer ClassicalMusicPlayer = new MusicPlayer(music1);
        musicPlayer.playMusic();
        ClassicalMusicPlayer.playMusic();
        context.close();
    }
}