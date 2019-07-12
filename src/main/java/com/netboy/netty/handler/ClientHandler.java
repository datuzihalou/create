package com.netboy.netty.handler;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

import java.util.Date;

public class ClientHandler extends SimpleChannelHandler {

    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e)
            throws Exception {
        String content = (String) e.getMessage();
        System.out.println(""+ new Date().toString() + "\n" + content);
    }
}