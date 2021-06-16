package com.movies;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MovieSalesApplicationTests {

    @Test
    void contextLoads() {
        AutoGenerator autoGenerator = new AutoGenerator();

        //全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setAuthor("movies");
        globalConfig.setServiceName("%sService");
        globalConfig.setFileOverride(false);
        globalConfig.setOpen(true);
        globalConfig.setOutputDir("src/main/java");
//        globalConfig.setSwagger2(true);
        autoGenerator.setGlobalConfig(globalConfig);

        //包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.movies");
        packageConfig.setEntity("pojo");
        packageConfig.setServiceImpl("serviceImpl");
        packageConfig.setService("service");
        packageConfig.setMapper("mapper");
        packageConfig.setController("controller");
//        packageConfig.setXml("xml");
        autoGenerator.setPackageInfo(packageConfig);

        //数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/moviesale?useSSL=true&useUnicode=utf8&characterEncoding=utf8&serverTimeZone=GMT");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("123456");
        autoGenerator.setDataSource(dataSourceConfig);

        //策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude("movieorder");
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setRestControllerStyle(true);
        autoGenerator.setStrategy(strategyConfig);

        autoGenerator.execute();


    }

}
