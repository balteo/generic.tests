package sample.generic.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class PersonDto extends BaseDto {

    private String name;
    private Integer age;
    private String socialSecurityNumber;
}
