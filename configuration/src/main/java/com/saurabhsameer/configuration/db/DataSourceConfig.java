package com.saurabhsameer.configuration.db;

import com.saurabhsameer.dataaccess.DataAccessModuleBase;
import com.saurabhsameer.dataaccess.entity.BlogJpaEntityBase;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;


@Configuration
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactoryBean",
        transactionManagerRef = "platformTransactionManager", basePackageClasses = {BlogJpaEntityBase.class})
public class DataSourceConfig {

  @Bean
  @ConfigurationProperties("blog.datasource")
  public DataSourceProperties dataSourceProperties(){
    return new DataSourceProperties();
  }

  @Bean
  @ConfigurationProperties("blog.datasource.hikari")
  public DataSource dataSource(final DataSourceProperties dataSourceProperties) {
    DataSourceBuilder<?> dataSourceBuilder = dataSourceProperties.initializeDataSourceBuilder();
    return dataSourceBuilder.build();
   }

   @Bean
   LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(final DataSource dataSource,
                                                                  final Map<String, String> hikariProperties,
                                                                  final EntityManagerFactoryBuilder entityManagerFactoryBuilder){
    return entityManagerFactoryBuilder.dataSource(dataSource).packages(BlogJpaEntityBase.class)
            .persistenceUnit(DataAccessModuleBase.PERSISTENCE_UNIT_NAME).properties(hikariProperties).build();
   }

   @Bean
   PlatformTransactionManager platformTransactionManager(final LocalContainerEntityManagerFactoryBean entityManagerFactoryBean){
     return new JpaTransactionManager(entityManagerFactoryBean.getObject());
  }

  @Bean
  @ConfigurationProperties("blog.orm.properties")
  Map<String, String> hikariProperties(){
    return new HashMap<>();
  }




}
