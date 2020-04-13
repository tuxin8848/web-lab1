package webadv.s99201105.p02;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
    	// 校验输入是否为2个参数
    	if (args.length != 2) {
            System.err.println("请输入账号和密码,用空格隔开！");
            System.exit(0);
        }

        //读取文件的准备
        String PATH="E:/work/webadv/repo/p02/PassWords.txt";
        File file = new File(PATH);
        FileInputStream fis = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = null;  //存储读取的每行内容

        while ((line = br.readLine()) != null) {
            String [] arr = line.split("\\s+");   //分割每行，得到账号和密码

            for(int i = 0 ; i < arr.length ; i++){  //比较账号和密码
                if(args[0].equals(arr[0]) && sha256hex(args[1]).equals(arr[1])){
                    System.out.println("登录成功！");
                    System.exit(0);
                }
            }
        }

        br.close();
        fis.close();
        System.out.println("登录失败，账号或密码错误！");

    }

    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}