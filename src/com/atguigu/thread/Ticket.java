package com.atguigu.thread;

public  class Ticket{

    private  int num =30;
    public  synchronized void sell() {
        if (num > 0) {
            num--;
            System.out.println(Thread.currentThread().getName() + "还剩下多少张票" + num);

        } else {


        }
    }
    public  synchronized void sell2(){
        if (num>0){
            num--;
            System.out.println(Thread.currentThread().getName()+"还剩下多少张票"+num);

        }else {



        }




    }

}
