package my.study.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author yanmiao.wu
 * @create 2023-03-31 14:36
 */
@Data
public class NameDTO {
    String firstName;
    String lastName;
}
