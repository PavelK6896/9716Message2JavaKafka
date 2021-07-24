package app.web.pavelk.message2.producer1.controller;


import app.web.pavelk.message2.common1.Address;
import app.web.pavelk.message2.common1.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaTemplate<Long, UserDto> kafkaTemplate;
    private final KafkaTemplate<String, String> kafkaTemplate2;

    @GetMapping("/msg")
    public String k3msg() {
        System.out.println("mgs");
        UserDto userDto = new UserDto();
        userDto.setName("ss");
        userDto.setAge(1L);
        userDto.setAddress(new Address("aa", "aa", "aa", 2L, 1L));
        ListenableFuture<SendResult<Long, UserDto>> future
                = kafkaTemplate.send("msg", 150L, userDto);
        future.addCallback(System.out::println, System.err::println);
        kafkaTemplate.flush();
        return "ok";
    }

    @GetMapping("/k1")
    public void k1() {
        ListenableFuture<SendResult<Long, UserDto>> future =
                kafkaTemplate.send("k1", 999L, UserDto.builder().age(123123L).build());
        future.addCallback(System.out::println, System.err::println);
        kafkaTemplate.flush();
    }

    @GetMapping("/k2")
    public void k2() {
        ListenableFuture<SendResult<String, String>> future
                = kafkaTemplate2.send("k2", "строка");
        future.addCallback(System.out::println, System.err::println);
        kafkaTemplate.flush();
    }

}
