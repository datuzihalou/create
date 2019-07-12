package com.netboy.netty.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class RunClient {
    public static void main(String[] args) {

        String contextFile = "/src/main/resources/Spring-service.xml";

        ApplicationContext context = null;
        try {
            context = new FileSystemXmlApplicationContext(contextFile);
        } catch (Exception e) {
            System.out.println("RunMain has some exception");
            e.printStackTrace();
        }
        ClientThread client = (ClientThread)context.getBean("clientThread");

        client.init();
        client.start();
    }
}
