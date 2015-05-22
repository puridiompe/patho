/**
 * 
 */
package com.puridiompe.patho.dataaccess.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Puridiom-PE
 *
 */
@Configuration
@ComponentScan(value = { "com.puridiompe.patho.dataaccess.impl" })
public class DataAccessConfiguration {

}
