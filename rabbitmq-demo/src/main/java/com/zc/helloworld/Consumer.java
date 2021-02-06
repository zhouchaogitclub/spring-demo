package com.zc.helloworld;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

/**
 * @author 周超
 * @since 2020/11/21 18:08
 */
public class Consumer {
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("192.168.1.8");
        connectionFactory.setPort(5672);
        //获取连接对象
        Connection connection = connectionFactory.newConnection();
        //从连接中获取通道
        Channel channel = connection.createChannel();
        channel.basicQos(1);
        //通道绑定相应的队列
        channel.queueDeclare("hello", true, false, false, null);
        channel.basicConsume("hello", false, new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("consume a message:" + new String(body, StandardCharsets.UTF_8));
                channel.basicAck(envelope.getDeliveryTag(), false);
            }
        });
        channel.close();
        connection.close();
    }
}
