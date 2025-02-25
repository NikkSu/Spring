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

//        Music music = context.getBean("rapMusic", Music.class);
//        Music music1 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer ClassicalMusicPlayer = new MusicPlayer(music1);
//        musicPlayer.playMusic();
//        ClassicalMusicPlayer.playMusic();

//        MusicPlayer player = (MusicPlayer) context.getBean("musicPlayer", MusicPlayer.class);
//        player.playMusic();
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
        MusicPlayer player = (MusicPlayer) context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println((player.getName()));
        System.out.println( (player.getVolume()));
        RapMusic player1 = (RapMusic) context.getBean("rapMusic",RapMusic.class);
        RapMusic player2 = (RapMusic) context.getBean("rapMusic",RapMusic.class);
        System.out.println(player1 == player2);

        context.close();
    }
}