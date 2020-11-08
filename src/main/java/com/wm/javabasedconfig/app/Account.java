package com.wm.javabasedconfig.app;

import com.wm.javabasedconfig.dao.StatsDao;
import com.wm.javabasedconfig.service.AccountStats;

public class Account {

  private String accHolderName;
  private int accId;
  private AccountStats accountStats;
  private StatsDao statsDao;

  public Account(String accHolderName, int accId) {
    this.accHolderName = accHolderName;
    this.accId = accId;
  }

  public Account(String accHolderName, int accId, AccountStats accountStats, StatsDao statsDao) {
    this.accHolderName = accHolderName;
    this.accId = accId;
    this.accountStats = accountStats;
    this.statsDao = statsDao;
  }

  public String getAccHolderName() {
    return accHolderName;
  }

  public void setAccHolderName(String accHolderName) {
    this.accHolderName = accHolderName;
  }

  public int getAccId() {
    return accId;
  }

  public void setAccId(int accId) {
    this.accId = accId;
  }

  public AccountStats getAccStats() {
    return accountStats;
  }

  public void setAccStats(AccountStats accountStats) {
    this.accountStats = accountStats;
  }

  public StatsDao getStatsDao() {
    return statsDao;
  }

  public void setStatsDao(StatsDao statsDao) {
    this.statsDao = statsDao;
  }
}
