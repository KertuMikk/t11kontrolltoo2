package com.mycompany.kontrolltoo2;


import com.mycompany.kontrolltoo2.jooneVaartus;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class sirgePunktid {
    
    public sirgePunktid() {}
    jooneVaartus j;
    vorrand v;
    vorrand v2;
   
    protected double tulemus;
    /*@Before
    public void setUp(){
       j=new jooneVaartus(10); 
       v = new vorrand(10,2,4,8);
       v2 = new vorrand(10,0,6,9);
       //tulemus = j.Yvaartus();
    }
        @Test
        public void punktid(){
            assertTrue("esimese punkti väärtus ei ole 30",(j.Yvaartus() == 30.0));
            j.Xsuurem();
            assertTrue("teise punkti väärtus ei ole 33",(j.Yvaartus() == 33.0));
            j.Xsuurem();
            assertTrue("kolmanda punkti väärtus ei ole 36",(j.Yvaartus() == 36.0));
        }
        @Test
        public void punktid2(){
            assertTrue("esimese punkti väärtus ei ole 32",(v.Vaartus() == 32.0));
            assertTrue("teise punkti väärtus ei ole 30",(v2.Vaartus() == 30.0));
        }
        @Test
        public void punktid3(){
           Assert.assertArrayEquals( new int[]{4,5,6,7,8},v.Xmassiiv()); 
           Assert.assertArrayEquals( new int[]{6,7,8,9},v2.Xmassiiv());
        }*/
		@Test
		public void veebtest(){
			open("http://greeny.cs.tlu.ee:54922/sirgevorrand.html");
			$("#submit").click();
        $("#vastus").shouldHave(text("25,29,33,37,41"));
			
		}
        
    }
    

