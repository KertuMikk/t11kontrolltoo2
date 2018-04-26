package com.mycompany.kontrolltoo2;


import java.util.Arrays;
//import static org.apache.commons.lang3.ArrayUtils.add;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
@RestController


class vorrand {
    protected int x;
    protected int a;
    protected int b;
    protected int g;
    protected int h;
    public vorrand(){}
	/*public vorrand(/*int x, int a, int b,int g, int h){
        //this.x=x;
        this.a=a;
        this.b=b;
        this.g=g;
        this.h=h;
    }*/
    int kysiX() {
        return x;
    }  
    int kysiA() {
        return a;
    }  
    int kysiB() {
        return b;
    } 
    int kysiG() {
        return g;
    }  
    int kysiH() {
        return h;
    }
    public int Vaartus(int a, int x, int b){
        kysiX();
        kysiA();
        kysiB();
        int Y = a * x + b;
        return Y;
    }
	@RequestMapping("/Yvaartus2") 
    public int[] Xmassiiv(int a, int g, int h, int b){
       //kysiG();
        //kysiH();
        int Xm[] = new int[h-g+1] ;
        for(int i=g;i<=h;i++){
			
          Xm[i-g] = i;
          
        }
       return Ymassiiv(Xm,a,b);
    }
    
    public int[] Ymassiiv(int Xm[],int a,int b){
        //kysiA();
        
        int Ym[] = new int[Xm.length];
        for(int i=0;i<Xm.length; i++){
          int Y = Vaartus(a, Xm[i], b);
          Ym[i] = Y;
        }
        return Ym;
    }
	//public static void main(String[] args){
      //  SpringApplication.run(võrrand.class, args);
    //}

     

   
}
