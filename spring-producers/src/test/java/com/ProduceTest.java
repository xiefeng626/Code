package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-rabbitmq-producers.xml")
public class ProduceTest {

    //1.注入 RabbitTemplate
    @Autowired
    private RabbitTemplate rabbitTemplate;


    @Test
    public void testHelloWorld(){
        //2.发送消息

        rabbitTemplate.convertAndSend("spring_queue","hello world spring..123..");
    }


    /**
     * 发送fanout消息
     */
    @Test
    public void testFanout(){
        //2.发送消息

        rabbitTemplate.convertAndSend("spring_fanout_exchange","","spring fanout....");
    }


    /**
     * 发送topic消息
     */
    @Test
    public void testTopics(){
        //2.发送消息

        rabbitTemplate.convertAndSend("spring_topic_exchange","heima.hehe","spring topic..1..");
    }
}
