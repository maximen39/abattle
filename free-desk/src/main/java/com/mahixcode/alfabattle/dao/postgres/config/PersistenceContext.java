package com.mahixcode.alfabattle.dao.postgres.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {
                "com.mahixcode.alfabattle.dao.postgres.branches.repository"
        })
@EnableJpaAuditing
public class PersistenceContext {
}
