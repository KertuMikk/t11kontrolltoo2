
import java.util.Arrays;
import static org.apache.commons.lang3.ArrayUtils.add;
import org.springframework.web.bind.annotation.RequestMapping;


class võrrand {
    protected int x;
    protected int a;
    protected int b;
    protected int g;
    protected int h;
    public võrrand(/*int x,*/ int a, int b,int g, int h){
        //this.x=x;
        this.a=a;
        this.b=b;
        this.g=g;
        this.h=h;
    }
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
        return a;
    }  
    int kysiH() {
        return b;
    }
    public double Vaartus(){
        kysiX();
        kysiA();
        kysiB();
        double Y = a * x + b;
        return Y;
    }
    public int[] Xmassiiv(){
        kysiG();
        kysiH();
        int Xm[] = null;
        for(int i=g;i<=h;i++){
          Xm = add(Xm, i);
          
        }
        return Xm;
    }
    @RequestMapping("/Yvaartus2") 
    public int[] Ymassiiv(int Xm[]){
        kysiA();
        kysiB();
        int Ym[] = null;
        for(int i=0;i<Xm.length; i++){
          int Y = (int) Yvaartus.Vaartus();
          Ym = add(Ym, Y);
        }
        return Ymassiiv(Ym);
    }

     /*public static void main(String[] args) {
        võrrand v = new võrrand(3,10,2,4,8);
         System.out.println(Arrays.toString(v.Xmassiiv()));
        
    }
    */

   
}
