package com.ws.alpha.rabbit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author laowang
 */
@Component
@RabbitListener(queues = "danmu.queue")
public class Receiver {
    private static Logger logger = LoggerFactory.getLogger(Receiver.class);

    @RabbitHandler
    public void process(String message) {
        logger.info("receive message : {}", message);
        System.out.println("receive" + message);
    }
}
