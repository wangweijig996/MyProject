package com.atguigu.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author wwj
 * @date 2019/12/17----20:23
 */
public class BlockingQueueDemo {
    public static void main(String[] args) {

        BlockingQueue<String>    blockingQueue = new ArrayBlockingQueue<String>(3);
        blockingQueue.add("a");
        blockingQueue.add("b");
        blockingQueue.add("c");
        blockingQueue.add("d");

        System.out.println(blockingQueue);

    }
}
