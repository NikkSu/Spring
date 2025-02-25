package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("org.example")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    };
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }
    @Bean
    ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
    @Bean
    public List<Music> musicList(){
        return Arrays.asList(classicalMusic(), rockMusic(), rapMusic());
    };
}
