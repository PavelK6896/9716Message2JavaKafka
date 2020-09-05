package app.web.pavelk.message2.producer1.controller;


import app.web.pavelk.message2.common1.Address;
import app.web.pavelk.message2.common1.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MsgController3 {

    @Autowired
    private KafkaTemplate<Long, UserDto> kafkaTemplate;

    @GetMapping("/msg")
    public void k3msg() {
        UserDto userDto = new UserDto();
        userDto.setName("ss");
        userDto.setAge(1L);
        userDto.setAddress(new Address("aa", "aa","aa",2L, 1L));
        ListenableFuture<SendResult<Long, UserDto>> future
                = kafkaTemplate.send("msg", 2L, userDto);
        future.addCallback(System.out::println, System.err::println);
        kafkaTemplate.flush();
    }

    @GetMapping("/k3")
    public void k3() {
        UserDto userDto = new UserDto();
        userDto.setName("ss");
        userDto.setAge(1L);
        userDto.setAddress(new Address("aa", "aa","aa",2L, 1L));
        ListenableFuture<SendResult<Long, UserDto>> future
                = kafkaTemplate.send("k3", 2L, userDto);
        future.addCallback(System.out::println, System.err::println);
        kafkaTemplate.flush();
    }

}
