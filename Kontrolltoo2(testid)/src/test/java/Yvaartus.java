
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class Yvaartus {
   protected static int x;
    protected static int a;
     protected static int b;
    public Yvaartus(int x, int a, int b){
        this.x=x;
        this.a=a;
        this.b=b;
    }
    static int kysiX() {
        return x;
    }  
    static int kysiA() {
        return a;
    }  
    static int kysiB() {
        return b;
    } 
    public static int Vaartus(){
        kysiX();
        kysiA();
        kysiB();
        int Y = a * x + b;
        return Y;
    }
    public static void main(String[] args){
        SpringApplication.run(Yvaartus.class, args);
    }
}
