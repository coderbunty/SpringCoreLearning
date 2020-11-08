package com.wm.xmlbasedconfig.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountDao {

  @Autowired
  private Connection conn;

  public void create() {
    System.out.println("Adding new resource..");
  }

  public void read() {
    System.out.println("Reading a resource..");
  }

  public void update() {
    System.out.println("Updating a resource..");
  }

  public void delete() {
    System.out.println("Deleting a resource..");
  }

  public Connection getConn() {
    return conn;
  }

  public void setConn(Connection conn) {
    this.conn = conn;
  }
}
