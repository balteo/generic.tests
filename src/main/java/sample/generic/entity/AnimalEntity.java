package sample.generic.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class AnimalEntity extends BaseEntity {

    private String furColor;
}
