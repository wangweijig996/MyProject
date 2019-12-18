package com.atguigu.thread;



/**
 * @author wwj
 * @date 2019/12/16----19:01
 */
public class SwapTemputure {
    public static void main(String[] args) {
        Temputure temputure = new Temputure();
         new Thread(()->{
              for (int i = 0; i <10; i++) {
                  try {
                      temputure.increase();
                  } catch (Exception e) {
                      e.printStackTrace();
                  }

              }},"A").start();
        new Thread(()->{
            for (int i = 0; i <10; i++) {
                try {
                    temputure.decrease();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }},"B").start();
        new Thread(()->{
            for (int i = 0; i <10; i++) {
                try {
                    temputure.decrease();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }},"C").start();
        new Thread(()->{
            for (int i = 0; i <10; i++) {
                try {
                    temputure.decrease();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }},"D").start();

    }
}