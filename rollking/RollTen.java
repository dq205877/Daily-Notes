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

//nextLine方式接收：
//        1  2   3   4  5  6 
// 以nextLine输入的数据为：       1  2   3   4  5  6 
//   1   2  3   4  5  6
// 以next输入的数据为：1
// 以next输入的数据为：2
// 以next输入的数据为：3
// 以next输入的数据为：4
// 以next输入的数据为：5
// 以next输入的数据为：6
}
 