package com.ourkitchen.configuration.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.ourkitchen.data.repository", 
        transactionManagerRef = "mariaDB_transactionManager",
        entityManagerFactoryRef = "mariaDB_entityManagerFactory"
)
public class DBConfig {
	
	@Primary
	@Bean(name = "maria_dataSource")
	@ConfigurationProperties("spring.data.maria")
	public DataSource mariaDataSource() {
		return DataSourceBuilder.create().type(HikariDataSource.class).build();
	}
	
	@Primary
	@Bean(name="mariaDB_entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
			EntityManagerFactoryBuilder builder,
			@Qualifier("maria_dataSource") DataSource dataSource) {
		return builder.dataSource(dataSource)
        		.packages("com.ourkitchen.data.entity")
        		.build();
	}
	
	@Primary
	@Bean(name = "mariaDB_transactionManager")
	public PlatformTransactionManager transactionManager(
			@Qualifier("mariaDB_entityManagerFactory") EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}
	
	@Bean
	public JPAQueryFactory jpaQueryFactory(EntityManager entityManager) {
		return new JPAQueryFactory(entityManager);
	}
	
}
