package rollking;

public class RollThree {
    public static void main(String[] args) {
        // int j = 0;
        for(int i = 1; i < 10; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " * "+ i + " = " + i * j + "      ");    
            }
            System.out.println();
            // System.out.print(i + " * "+ j + "=" + i * j + "      ");
            // j++;
            // System.out.println("-----------------------------------------------------------------------------------");
        }
    }
}
