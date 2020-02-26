package com.example.testnet.controller;

import com.example.testnet.reponse.APIResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hongen.zhang
 * time: 2020/2/26 20:55
 * email: hongen.zhang@things-matrix.com
 */
@Api(value = "SimCard API", tags = {"SimCard"})
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/hello")
    public APIResult<String> hello() throws Exception {
        return APIResult.success("success");
    }

}
