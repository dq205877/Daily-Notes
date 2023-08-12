package rollking;

import java.util.Scanner;
                
public class RollTen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据
 
        // nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        // 判断是否还有输入
        if (scan.hasNextLine()) {
            String str2 = scan.nextLine();
            System.out.println("以nextLine输入的数据为：" + str2);
        }

        while(scan.hasNext()){
            String str3 = scan.next();
            System.out.println("以next输入的数据为：" + str3);
        }
        scan.close();
    }
}
 