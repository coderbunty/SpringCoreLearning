package com.wm.javabasedconfig.dao;

import org.springframework.stereotype.Component;

@Component
public class StatsDao {

  private String connection;

  public void create() {
    System.out.println("Creating a stats resource..");
  }

  public void read() {
  }

  public void update() {
  }

  public void delete() {
  }

  public String getConnection() {
    return connection;
  }

  public void setConnection(String connection) {
    this.connection = connection;
  }
}
