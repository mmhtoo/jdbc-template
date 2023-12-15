package com.mmhtoo.jdbctemplate.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class User {

  private Integer id;

  private String username;

  private String email;

}
