package rollking;

public class RollTwenty {
    public static void main(String[] args) {
        
        // Child child1 = new Child();
        // System.out.println("-----------------------------------");
        Parent parent = new Parent();
        System.out.println("-----------------------------------");
        Child child = new Child();
    }
    
    static class Parent{
         int nums = 1;
         static{
            System.out.println("parent static block");
         }
         {
            System.out.println("parent block");
         }
         Parent(){
            System.out.println("parent constructor");
         }
    }

    static class Child extends Parent{
        static{
            System.out.println("child static block");
         }
        {
            System.out.println("child block");
         }
         Child(){
            System.out.println("child constructor");
         }
    }
/**
 * 
parent static block
parent block
parent constructor
-----------------------------------
child static block
parent block
parent constructor
child block
child constructor
*/
/**
 * summary: static only executed once  non-static with instance
 */
}
