package rollking;

public class RollThree {
    public static void main(String[] args) {
        //
        for(int i = 1; i < 10; i++){
            for(int j = 1; j <= i; j++){
                //不换行
                System.out.print(j + " * "+ i + " = " + i * j + "      ");    
            }
            //换行
            System.out.println();
        }
    }
}
