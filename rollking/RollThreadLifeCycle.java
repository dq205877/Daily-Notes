package rollking;

public class RollThreadLifeCycle implements Runnable{
    public static void main(String[] args) {
        RollThreadLifeCycle lifeCycle = new RollThreadLifeCycle();
        //新建
        Thread thread = new Thread(lifeCycle);
        System.out.println(thread.getState());
        thread.start();
        System.out.println(Thread.currentThread().getName()+Thread.currentThread().getState());
        System.out.println(thread.getName()+thread.getState());
        try{
            Thread.sleep(6000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(thread.getName()+thread.getState());

    }
    
    @Override
    public void  run(){
        try{
            System.out.println("running start"+ Thread.currentThread().getState());
            Thread.sleep(3000);
            System.out.println("running end"+ Thread.currentThread().getState());
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
