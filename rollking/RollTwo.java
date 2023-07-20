package rollking;
// import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class RollTwo{
    public static void main(String[] args) {
        RollTwo rollTwo = new RollTwo();
         rollTwo.ifMethod(0);
         System.out.println("------------------------");
         rollTwo.ifelseMethod(0);
         rollTwo.ifelseMethod(1);
          System.out.println("------------------------");
         rollTwo.ifelseifelseMethod(0);
         rollTwo.ifelseifelseMethod(1);
         rollTwo.ifelseifelseMethod(2);
          System.out.println("------------------------");
         rollTwo.doWhileMethod(0);
          System.out.println("------------------------");
         rollTwo.whileMethod(10);
          System.out.println("------------------------");
         rollTwo.switchMethod(20);
         rollTwo.switchMethod(30);
         rollTwo.switchMethod(40);
         rollTwo.switchMethod(50);
          System.out.println("------------------------");
         rollTwo.forMethod(30);
          System.out.println("------------------------");
         List<Integer> list = new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         list.add(6);
         list.add(7);
         list.add(8);
         list.add(9);
         list.add(10);
         rollTwo.foreachMethod(list);
    }

private void ifMethod(int number){
    if(number == 0){
        System.out.println("ifMethod: number="+ number + ";");
    }
}

private void ifelseMethod(int number){
     if(number == 0){
        System.out.println("ifelseMethod:if number="+ number + ";");
     } else {
         System.out.println("ifelseMethod:else number="+ number + ";");
     }
}

private void ifelseifelseMethod(int number){
    if(number == 0){
        System.out.println("ifelseifelseMethod:if number="+ number + ";");
     } else if(number == 1){
         System.out.println("ifelseMethod:else if number="+ number + ";");
     } else {
        System.out.println("ifelseifelseMethod:else number="+ number + ";");
    }
}

private void doWhileMethod(int number){
    do{
        number = number + 1;
        System.out.println("doWhileMethod: number="+ number + ";");
    } while(number < 10);
}

private void whileMethod(int number){
    while(number < 20){
        number = number + 1;
        System.out.println("whileMethod: number="+ number + ";");
    }
}

private void switchMethod(int number){
    switch(number){
         case 20:
            System.out.println("switchMethod: number=" + "20" + ";");
            break;
         case 30:
            System.out.println("switchMethod: number=" + "30" + ";");
            break;
         case 40:
            System.out.println("switchMethod: number=" + "40" + ";");
            break;
         default:
            System.out.println("default,not match any switch case.this number is:"+ number +";");
      }
}

private void forMethod(int number){
    for(int i = number; i >= 15;i--){
        System.out.println("forMethod: i =" + i + ";");
    }
}

private void foreachMethod(List<Integer> numberList){
     for(int i : numberList){
        System.out.println("foreachMethod: i =" + i + ";");
    }
}

}