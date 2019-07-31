package com.study.swagger.testswagger.dto.request;

import lombok.Data;

/**
 * FileName: User Description:
 *
 * @author caozhongyu
 * @create 2019/7/31
 */
@Data
public class User {

  /**年龄*/
  private Integer age;

  /**用户id*/
  private Integer id;

  /**用户名*/
  private String userName;
}