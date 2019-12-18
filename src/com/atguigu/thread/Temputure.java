package com.atguigu.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wwj
 * @date 2019/12/16----18:31
 */
public class Temputure {


    private int num = 0;
    private Lock lock = new ReentrantLock();

    public synchronized void increase() throws Exception {


        while (num!=0) {
            this.wait();
        }

            num++;
            System.out.println(Thread.currentThread().getName() + "线程\t" + "num = " + num);
            this.notifyAll();

        }


    public synchronized void decrease() throws Exception {


        while (num == 0) {
            this.wait();
        }

        num--;
        System.out.println(Thread.currentThread().getName() + "线程\t" + "num = " + num);
        this.notifyAll();
    }






}
