package app.web.pavelk.message2.consumer1.component;

import app.web.pavelk.message2.common1.UserDto;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@EnableKafka
@Component
public class MsgComponent {

    @KafkaListener(topics = "msg")
    public void msgListener(String msg) {
        System.out.println(msg);
    }

    @KafkaListener(topics = "k1")
    public void orderListener1(ConsumerRecord<Long, UserDto> record) {
        System.out.println(record.topic());
        System.out.println(record.partition());
        System.out.println("headers " + record.headers());
        System.out.println(record.key());
        System.out.println(record.value());
    }

    @KafkaListener(topics = "k2")
    @KafkaHandler
    public void orderListener2(ConsumerRecord<String, String> record) {


        System.out.println(record.topic());
        System.out.println(record.partition());
        System.out.println("headers " + record.headers());
        System.out.println(record.key());
        System.out.println(record.value());
    }

    @KafkaListener(topics = "k3")
    public void orderListener3(ConsumerRecord<String, String> record) {
        System.out.println(record.topic());
        System.out.println(record.partition());
        System.out.println("headers " + record.headers());
        System.out.println(record.key());
        System.out.println(record.value());
    }
}
