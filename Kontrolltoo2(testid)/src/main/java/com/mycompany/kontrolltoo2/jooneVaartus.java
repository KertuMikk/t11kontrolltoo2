
package com.mycompany.kontrolltoo2;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@SpringBootApplication

    public class jooneVaartus {
    protected int x;
    protected int a;
    protected int g;
    protected int h;
    public jooneVaartus(){
		
	}
	
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
	 int kysiG() {
        return g;
    }  
    int kysiH() {
        return h;
    }
	public int Yvaartus(int a, int x){
        //x=kysiX();
        //a=kysiA();
        int Y = a * x;
        return Y;
	}
    //@RequestMapping("/Yvaartus1")
    public int[] Xmassiiv(int a, int g, int h){
        //kysiG();
        //kysiH();
        int Xm[] = new int[h-g+1] ;
        for(int i=g;i<=h;i++){
			
          Xm[i-g] = i;
          
        }
       return Ymassiiv(Xm,a);
    }
    
    public int[] Ymassiiv(int Xm[],int a){
        //kysiA();
        
        int Ym[] = new int[Xm.length];
        for(int i=0;i<Xm.length; i++){
          int Y = Yvaartus(a, Xm[i]);
          Ym[i] = Y;
        }
        return Ym;
    }
	
    
    public void Xsuurem(){
        x=kysiX();
        x++;
        
    }
	
    
}