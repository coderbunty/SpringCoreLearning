package com.wm.javabasedconfig.config;

import com.wm.javabasedconfig.dao.AccountDao;
import com.wm.javabasedconfig.dao.Connection;
import com.wm.javabasedconfig.dao.StatsDao;
import com.wm.javabasedconfig.service.AccountStats;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.wm.javabasedconfig")
public class BeanConfig {

  @Bean
  public AccountStats getAccountStats() {
    return new AccountStats();
  }

  @Bean
  public StatsDao getStatsDao() {
    return new StatsDao();
  }

  @Bean
  public Connection getConnection() {
    return new Connection();
  }

  @Bean
  public AccountDao getAccountDao() {
    return new AccountDao();
  }

}
