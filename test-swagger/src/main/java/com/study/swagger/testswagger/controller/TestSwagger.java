package com.study.swagger.testswagger.controller;

import com.study.swagger.testswagger.dto.request.User;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: TestSwagger Description:
 *
 * @author caozhongyu
 * @create 2019/7/31
 */
@RestController
@RequestMapping("/test")
public class TestSwagger {

  @PostMapping(value = "/add")
  public String addUser(@RequestBody
  @ApiParam(name = "用户", value = "传入json格式", required = true)
      User user) {
    return "新增用户:" + user.getUserName();
  }

  @PutMapping(value = "/update")
  public String updateUser(@RequestBody
  @ApiParam(name = "用户", value = "传入json格式", required = true)
      User user) {
    return "更新用户:" + user.getUserName();
  }

}