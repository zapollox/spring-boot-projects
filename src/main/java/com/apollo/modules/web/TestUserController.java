package com.apollo.modules.web;


import com.apollo.business.constant.Code;
import com.apollo.business.response.BaseResult;
import com.apollo.business.response.BaseResultFactory;
import com.apollo.modules.entity.TestUser;
import com.apollo.modules.service.ITestUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

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
    @Autowired
    private ITestUserService testUserService;

    @PostMapping("/test")
    @ApiOperation("测试")
    public BaseResult feeAmount
            (@ApiParam("测试") @RequestParam(value = "test",required = false)String test,
             @ApiIgnore String token){
        List<TestUser> list = testUserService.findAllUser();
        return BaseResultFactory.produceResult(Code.UNKNOWN_ABNORMAL,list);
    }
}

