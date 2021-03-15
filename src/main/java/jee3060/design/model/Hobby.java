package jee3060.design.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Hobby {
    private int hobbyId;
    private String hobbyName;
    private String hobbyDescription;
    private String hobbyCategory;

}