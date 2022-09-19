/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectJashwa;
import static java.lang.Thread.sleep;
/**
 *
 * @author JashwaMulyaT
 */
public class CobaThread {
    public static void main(String[] args) {
        Thread t1 = new Proses1();
        Thread t2 = new Proses2();
        
        t1.start();
        t2.start();
    }
}
    
    class Proses1 extends Thread {
        public void run(){
            try{
            sleep(3000);
            }catch(InterruptedException e){
            e.printStackTrace();}
           System.out.println("Proses 1 Berjalan");
        }
    }
    
    class Proses2 extends Thread{
        public void run(){
        System.out.println("Proses 2 Berjalan");
        }
    }

