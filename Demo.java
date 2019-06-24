package Custom;

class Hi extends Thread{
    public void run() { //run is internal method of thread. All multi-threading logic is placed in run
        for(int i = 1; i < 5; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(500); //pausing thread for 0.5 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Hello extends Thread{ //Runnable interface is required for we can't write : class Hello extends Thread, Hi{}
    public void run() {     //for multiple inheritance is not supported in Java
        for(int i = 1; i < 5; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class Demo{

    public static void main(String[] args){
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        obj2.start();
        }
    }