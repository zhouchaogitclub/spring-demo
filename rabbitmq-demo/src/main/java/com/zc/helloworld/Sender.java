package com.zc.helloworld;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

/**
 * @author 周超
 * @since 2020/11/21 17:57
 */
public class Sender {
    // boolean char short byte int long float double
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("192.168.1.8");
        connectionFactory.setPort(5672);
        //获取连接对象
        Connection connection = connectionFactory.newConnection();
        //从连接中获取通道
        Channel channel = connection.createChannel();
        //通道绑定相应的队列
        channel.queueDeclare("hello", true, false, false, null);
        channel.basicPublish("", "hello", MessageProperties.PERSISTENT_TEXT_PLAIN, "hello rabbitmq".getBytes(StandardCharsets.UTF_8));
        channel.close();
        connection.close();
    }
}
