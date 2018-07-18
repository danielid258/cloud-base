package com.daniel.order.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Daniel on 2018/7/19.
 *
 * RabbitMQ Message receiver
 */
@Slf4j
@Component
public class MQReceiver {

    //1 @RabbitListener: receive message from MQ
    //@RabbitListener(queues = "daniel-queue")

    //2 queuesToDeclare: Automatically create queues
    //@RabbitListener(queuesToDeclare = @Queue("daniel-queue"))

    //3 bindings:
    @RabbitListener(bindings = @QueueBinding(value = @Queue("daniel-queue2"),exchange = @Exchange("daniel-exchange2")))
    public void processMessage(String message) {
        log.info("message: {}", message);
    }

}
