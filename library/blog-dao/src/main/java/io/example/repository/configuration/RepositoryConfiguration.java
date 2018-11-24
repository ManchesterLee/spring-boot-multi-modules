package io.example.repository.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author ManchesterLee  <a href="mailto:man.chester.lee.cn@gmail.com">Contact me.</a>
 * @version 1.0
 * @since 2018/11/24
 */
@Configuration
@EnableJpaRepositories(basePackages = "io.example")
@EntityScan(basePackages = "io.example")
public class RepositoryConfiguration {
}
