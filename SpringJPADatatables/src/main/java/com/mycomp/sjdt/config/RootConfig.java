/**
 * Root Configuration (spring-core-config.xml)
 */
package com.mycomp.sjdt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author partheban.ru
 *
 */

@Configuration
@ComponentScan({"com.mycomp.sjdt.service"})
public class RootConfig {

}
