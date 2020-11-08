package com.wm.javabasedconfig.app;

import com.wm.javabasedconfig.config.BeanConfig;
import com.wm.javabasedconfig.dao.AccountDao;
import com.wm.javabasedconfig.dao.StatsDao;
import com.wm.javabasedconfig.service.AccountStats;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {
    // application context configuration will be defined in a java config file
    // no xml file, everything is annotation based
    ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfig.class);

    AccountStats accountStats = appContext.getBean(AccountStats.class);
    StatsDao statsDao = appContext.getBean(StatsDao.class);
    Account account = new Account("abc", 1, accountStats, statsDao);
    account.getStatsDao().create();

    AccountDao accountDao = appContext.getBean(AccountDao.class);
    accountDao.create();
    System.out.println(accountDao.getConn());


    /*
     * @Component - tells Spring that the class should be a bean (default id will be same as class name, first letter in lower case)
     * @Configuration - tells Spring that the class will have all the configurations related to bean (similar to spring.xml file)
     * @Bean - tells Spring that the object being returned is a Bean.
     * @Autowired - dependency inject the bean to this variable
     * @ComponentScan - instead of defining each & every bean in the config, component scan will tell the spring where to look for beans (components)
     */
  }

}
