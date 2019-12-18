package com.atguigu.thread;

import java.util.concurrent.*;

/**
 * @author wwj
 * @date 2019/12/17----19:07
 */
public class MythreadPool {

    public static void main(String[] args) {
        ExecutorService  executorPool =new ThreadPoolExecutor(
                2,
                5,
                1L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardPolicy());

        for (int i = 0; i < 12; i++) {
            int finalI = i;
            executorPool.execute(()->{
                System.out.println("窗口\t"+Thread.currentThread().getName()+"序号"+ finalI);
            });


        }
    }

}









