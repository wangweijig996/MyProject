package com.atguigu.thread;

/**
 * @author wwj
 * @date 2019/12/16----20:31
 */
public class Phone {

      public  static synchronized  void  sendEmail(){


          System.out.println("......sendEmail");


      }

    public   static    synchronized  void  sendMeesage(){

        System.out.println("......sendMeesage");


    }
}
