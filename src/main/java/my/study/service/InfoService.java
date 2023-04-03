package my.study.service;

import cn.hutool.core.text.StrBuilder;
import com.alibaba.fastjson.JSON;
import my.study.constant.ConfigConstant;
import my.study.dto.NameDTO;
import my.study.utils.HttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author yanmiao.wu
 * @create 2023-03-31 14:25
 */
@Service
public class InfoService {

    @Autowired
    private ConfigConstant constant;

    /**
     * 测试调用其他服务器的接口
     */
    public String getStatus(String param1, String param2) {
        NameDTO nameDTO = new NameDTO();
        nameDTO.setFirstName(param1);
        nameDTO.setLastName(param2);
        System.out.println(nameDTO.toString());
        String s = JSON.toJSONString(nameDTO);
        Map<String, String> urlMap = constant.getUrlMap();
        StrBuilder sb = new StrBuilder();
        urlMap.forEach(
                (k, v) -> {
                    System.out.println(k + "  " + v);
                    String result = HttpUtils.httpPost(v, s);
                    System.out.println(result);
                    sb.append(result);
                }
        );
        return sb.toString();

    }
}
