package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component

public class RapMusic implements Music {
public RapMusic(){};
public static RapMusic getRapMusic(){
    return new RapMusic();
};
        @PostConstruct
    public void doMyInit(){
        System.out.println("rap inits");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("rap destroys");
    }
    @Override
    public String getSong() {
        return "Awful Things";
    }

}
