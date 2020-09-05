package app.web.pavelk.message2.common1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String country;
    private String city;
    private String street;
    private Long homeNumber;
    private Long flatNumber;
}
