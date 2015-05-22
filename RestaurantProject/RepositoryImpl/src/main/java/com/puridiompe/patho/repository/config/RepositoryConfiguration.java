/**
 * 
 */
package com.puridiompe.patho.repository.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Puridiom-PE
 *
 */
@Configuration
@EnableJpaRepositories("com.puridiompe.patho.repository")
@ComponentScan(value = { "com.puridiompe.patho.repository.persistence.impl" })
public class RepositoryConfiguration {

}
