package com.mycompany.kontrolltoo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@SpringBootApplication
public class Rakendus{
    
    
    @RequestMapping("/tervitus")
    public String tervita(String eesnimi){
        return "Tere, "+eesnimi;
    }
    
    
   
    
    public static void main(String[] args){
        SpringApplication.run(Rakendus.class, args);
    }
}

//mvn package
//java -jar -Dserver.port=43256 target/baas1-1.jar
//http://greeny.cs.tlu.ee:43256/tervitus?eesnimi=Juku
