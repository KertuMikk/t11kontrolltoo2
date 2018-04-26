
package com.mycompany.kontrolltoo2;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
    public class jooneVaartus {
    protected int x;
    protected int a;
    
    
    public jooneVaartus(int x){
        this.x=x;
        this.a=a;
    }
    int kysiX() {
        return x;
    }  
    int kysiA() {
        return a;
    } 
    @RequestMapping("/Yvaartus1")
    public int Yvaartus(){
        x=kysiX();
        a=kysiA();
        int Y = a * x;
        return Y;
    }
    public void Xsuurem(){
        x=kysiX();
        x++;
        
    }

    
    
}