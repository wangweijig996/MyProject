package com.atguigu.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wwj
 * @date 2019/12/14----21:14
 */
public class Mulithread {


    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        //不是不可以new对象姿势为了节约资源，不用jc垃圾回收机制
       /* ExecutorService executorPool = Executors.newFixedThreadPool(3);
        ExecutorService executorPool1 = Executors.newCachedThreadPool();*/
        ExecutorService executorPool = Executors.newSingleThreadExecutor();


        for (int i = 0; i < 30; i++) {
                executorPool.execute(() -> {
                    ticket.sell();

                });
            }









           /* new Thread(()->{ for (int i = 0; i <30 ; i++) {  ticket.sell();} },"A").start();
            new Thread(()->{ for (int i = 0; i <30 ; i++) {  ticket.sell2();} },"B").start();
            new Thread(()->{ for (int i = 0; i <30 ; i++) {  ticket.sell();} },"C").start();
            new  Thread(()->{
                for (int i = 0; i < 10; i++) {
                    ticket.sell2();

                }
            }).start();*/



           /* new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i <30 ; i++) {
                        ticket.sell();

                    }
                }
            },"A").start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i <30 ; i++) {
                        ticket.sell();

                    }
                }
            },"B").start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i <30 ; i++) {
                        ticket.sell();

                    }
                }
            },"C").start();
    */


    }
}





