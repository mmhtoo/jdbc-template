package com.mmhtoo.jdbctemplate.seeding;

import com.mmhtoo.jdbctemplate.JdbcTemplateApplication;
import com.mmhtoo.jdbctemplate.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class SeedUsers implements CommandLineRunner {

  private final JdbcTemplate jdbcTemplate;

  @Override
  public void run(String... args) throws Exception {
    List.of(
      User.builder().username("Kyaw Kyaw").email("kyawkyaw@gmail.com").build(),
        User.builder().username("Aung Aung").email("aungaung@gmail.com").build()
    ).forEach(user -> {
      jdbcTemplate.update("INSERT INTO users (username,email) VALUE(?, ?)",user.getUsername(),user.getEmail());
    });
  }

}
