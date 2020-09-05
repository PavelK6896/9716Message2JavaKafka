package app.web.pavelk.message2.producer1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MsgController1 {

//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;
//
//    @GetMapping("/k")
//    public void k() {
//        System.out.println("sendOrder");
//        kafkaTemplate.send("msg", "1", "P1 k1 msg");
//    }
//
//    @GetMapping("/k2")
//    public void k2() {
//        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send("msg", "1", "P1 k2 msg");
//        future.addCallback(System.out::println, System.err::println);
//        kafkaTemplate.flush();
//    }

}
