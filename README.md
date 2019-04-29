# spring-boot

## pulgins 
1. Lombok  pom.xml导入 + IDEA插件

## branch spring-jdbc
-   pom.xml 引入spring jdbc、mysql-connector
-   配置数据源 > application.properties
-   com.xinxing.springboot.entity.User
-   service > com.xinxing.springboot.service.UserService || com.xinxing.springboot.service.impl.UserServiceImpl
-   test > com.xinxing.springboot.springjdbc.SpringJdbcTest

> 注：<T>org.springframework.jdbc.core.JdbcTemplate only support Integer/String ... , not support user-defined (eg: com.xinxing.springboot.entity.User)
    Exception >> throw org.springframework.jdbc.IncorrectResultSetColumnCountException: Incorrect column count: expected 1, actual 5