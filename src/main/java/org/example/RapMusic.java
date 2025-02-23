package org.example;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {
private RapMusic (){};
public static RapMusic getRapMusic(){
    return new RapMusic();
};
    public void doMyInit(){
        System.out.println("rap inits");
    }
    public void doMyDestroy(){
        System.out.println("rap destroys");
    }
    @Override
    public String getSong() {
        return "Awful Things";
    }

}
