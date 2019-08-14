package com.vue.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linzf
 * @since 2019/8/14
 * 类描述：
 */
@RestController
@RequestMapping("/internationalize")
public class VueController {

    /**
     * 功能描述：初始化国际化信息
     * @return 返回初始化结果
     */
    @GetMapping("initInternationalize")
    public Map<String,Object>  initInternationalize(){
        Map<String,Object> obj = new HashMap<>();
        Map<String,Object> val = new HashMap<>();
        val.put("text","你好阿");
        obj.put("testLoad",val);
        return obj;
    }

}
