package com.project.collaborationplatform.collaborationplatformauthenticationservice.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
@ComponentScan(basePackages = "com.project.collaborationplatform.collaborationplatformauthenticationservice")
public class AuditingConfiguration {
}
