package com.wm.xmlbasedconfig.dao;

import org.springframework.stereotype.Component;

@Component
public class Connection {

  private String conn;

  public String getConn() {
    return conn;
  }

  public void setConn(String conn) {
    this.conn = conn;
  }
}
