package com.tutu.springboot.controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 用原生的jdbc来操作数据库
 */
@Controller
public class JdbcTestController {
    @Resource
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/query")
    public Map<String,Object> map() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from jdbctest");
        return list.get(0);
    }
}
