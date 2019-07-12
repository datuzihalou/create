package com.netboy.netty.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class RunServer {
    public static void main(String[] args) {

        String contextFile = "/src/main/resources/Spring-service.xml";

        ApplicationContext context = null;
        try {
            context = new FileSystemXmlApplicationContext(contextFile);
        } catch (Exception e) {
            System.out.println("RunServer has some exception");
            e.printStackTrace();
        }
        final NettyServer server =(NettyServer)context.getBean("nettyServer");

        Runtime.getRuntime().addShutdownHook(new Thread() {

            @Override
            public void run() {
                try {
                    server.stop();
                } catch (Exception e) {
                    System.out.println("run main stop error!");
                }
            }

        }  );
        server.init();
        server.start();
    }
}
