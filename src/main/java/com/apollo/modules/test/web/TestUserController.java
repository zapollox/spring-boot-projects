package com.apollo.modules.test.web;


import com.apollo.business.response.BaseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author apollo123
 * @since 2019-01-24
 */
@RestController
@RequestMapping("/v1")
@Api(value = "测试模块", description = "测试模块")
public class TestUserController {
    @PostMapping("/test")
    @ApiOperation("测试")
    public BaseResult feeAmount
            (@ApiParam("测试") @RequestParam(value = "test")String test,
             @ApiIgnore String token){
        return null;
    }
}

