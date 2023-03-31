package my.study.controller;

import my.study.dto.NameDTO;
import my.study.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author yanmiao.wu
 * @create 2023-03-31 14:10
 */
@RestController
@RequestMapping(path = "/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    /**
     * 知识点
     *
     * @PathVariable --> url中可变参数 /url/{param1}
     * @RequestParam --> url参数 /url?param1 = aaa
     * @RequestBody  --> body参数。与请求头中Content-Type有关
     */
    @GetMapping("/statusCode")
    public String getStatusCode(@RequestParam(value = "param1") String param1,
                                @RequestParam(value = "param2") String param2) {
        return infoService.getStatus(param1, param2);
    }


    @PostMapping("/name")
    public String buildName(@RequestBody NameDTO nameDTO){
        return nameDTO.getFirstName() + nameDTO.getLastName();
    }

}
