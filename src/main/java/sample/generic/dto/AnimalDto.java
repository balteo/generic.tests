package sample.generic.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AnimalDto extends BaseDto {

    private String furColor;
}
