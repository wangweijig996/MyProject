package com.atguigu.thread;

/**
 * @author wwj
 * @date 2019/12/16----20:29
 */
public class PhoneDemo {

    public static void main(String[] args) throws Exception {

        Phone  phone = new  Phone();
        Phone phone1 = new Phone();

        new Thread(()->{

            phone.sendMeesage();

        },"B").start();
        Thread.sleep(3000);
         new Thread(()->{

                  phone1.sendEmail();

              },"A").start();




    }
}
