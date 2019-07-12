package com.netboy.netty;

public class finatest {
    public static void main(String[] args) {
        System.out.println(hello().getId());

    }

    public static entity  hello(){
        entity en=new entity();
        try{
            en.setId("1");
            return en;
        }catch (Exception e){

        }finally {
            entity en2=new entity();
            en2.setId("2");
            return en;
        }
    }
}
