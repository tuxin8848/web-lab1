package webadv.s99201105.p02;

import org.junit.Assert;
import org.junit.Test;
public class AppTest {
    private String INPUT = "123456";
    @Test
    public void testLength() {
        Assert.assertEquals(64, App.sha256hex(INPUT).length());
    }
    @Test
    public void testHex() {
        String expected = "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92";
        Assert.assertEquals(expected, App.sha256hex(INPUT));
    }
    
    //打印密码为“17206125”采用SHA-256算法保护后的形式，把结果存储在密码文件中
    @Test
    public void testSHA256HEX(){
        System.out.println(App.sha256hex("17206125"));
    }
    
    public static void main(String[] args) {
    	AppTest a = new AppTest();
    	a. testSHA256HEX();
	}
}