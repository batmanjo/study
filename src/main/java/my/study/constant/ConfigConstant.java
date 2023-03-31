package my.study.constant;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author yanmiao.wu
 * @create 2023-03-31 10:44
 */
@Data
@Component
public class ConfigConstant {

    @Value("#{${communication.url:{'url1':'localhost:8081/info/name','url2':'localhost:8081/info/name'}}}")
    private Map<String,String> urlMap;

}
