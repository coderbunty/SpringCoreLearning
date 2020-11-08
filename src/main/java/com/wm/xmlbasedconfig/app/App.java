package com.wm.xmlbasedconfig.app;

import com.wm.xmlbasedconfig.dao.AccountDao;
import com.wm.xmlbasedconfig.dao.StatsDao;
import com.wm.xmlbasedconfig.service.AccountStats;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

  public static void main(String[] args) {
    Account acc1 = new Account("uvw", 1);
    acc1.setAccStats(new AccountStats());   // adding the dependency through setter method
    acc1.setStatsDao(new StatsDao());   // adding the dependency through setter method

    // adding the dependency through constructor
    Account acc2 = new Account("xyz", 1, new AccountStats(), new StatsDao());

    // creating a IOC container or a application context
    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

    System.out.println("\n-------------------------DI from <bean> tag--------------------------\n");
    // objects will be injected by the spring framework
    AccountStats accountStats = (AccountStats) context.getBean("accountStatistics");
    StatsDao statsDao = (StatsDao) context.getBean("statisticsDAO");

    // using the injected objects in acc3 & acc4 (acc3 & acc4 will be the same objects)
    Account account = new Account("uvw", 1, accountStats, statsDao);
    System.out.println(account.getStatsDao().getConnection());

    System.out.println("\n---------------------DI from @Component annotation-------------------\n");
    AccountDao accountDao = (AccountDao) context.getBean("accountDao");
    System.out.println(accountDao.getConn());
    // @Autowired can be used with instance variable to automatically initialize them
    accountDao.create();
  }

}
