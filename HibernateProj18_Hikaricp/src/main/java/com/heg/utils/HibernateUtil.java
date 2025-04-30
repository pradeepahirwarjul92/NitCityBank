package com.heg.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.util.Properties;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure("com/heg/cnfg/hibernate.cfg.xml"); // Loads XML settings

            // ✅ Explicit HikariCP Configuration
            HikariConfig hikariConfig = new HikariConfig();
            hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/heg_db");
            hikariConfig.setUsername("root");
            hikariConfig.setPassword("root");
            hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
            hikariConfig.setMaximumPoolSize(20);
            hikariConfig.setMinimumIdle(5);
            hikariConfig.setIdleTimeout(30000);
            hikariConfig.setConnectionTimeout(30000);
            hikariConfig.setMaxLifetime(1800000);

            HikariDataSource dataSource = new HikariDataSource(hikariConfig);

            // ✅ Hibernate 6 properties
            Properties properties = new Properties();
            properties.put("hibernate.connection.url", hikariConfig.getJdbcUrl());
            properties.put("hibernate.connection.username", hikariConfig.getUsername());
            properties.put("hibernate.connection.password", hikariConfig.getPassword());
            
            properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
            properties.put("hibernate.show_sql", "true");
            properties.put("hibernate.hbm2ddl.auto", "update");

            configuration.addProperties(properties);

            return configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
}
