package app.web.pavelk.message2.producer1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MsgController2 {

//    @Autowired
//    private KafkaTemplate<Long, String> kafkaTemplate;
//
//
//    @GetMapping("/k3")
//    public void k3() {
//        ListenableFuture<SendResult<Long, String>> future = kafkaTemplate.send("msg", 1L, "P1 k3 msg");
//        future.addCallback(System.out::println, System.err::println);
//        kafkaTemplate.flush();
//    }

}
