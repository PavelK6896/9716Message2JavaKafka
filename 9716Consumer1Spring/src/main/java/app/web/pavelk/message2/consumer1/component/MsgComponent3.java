package app.web.pavelk.message2.consumer1.component;

import app.web.pavelk.message2.common1.UserDto;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@EnableKafka
@Component
public class MsgComponent3 {

    @KafkaListener(topics="k3")
    public void orderListener(ConsumerRecord<Long, UserDto> record){
        System.out.println(record.partition());
        System.out.println(record.key());
        System.out.println(record.value());
    }
}
