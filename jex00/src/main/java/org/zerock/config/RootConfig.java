package org.zerock.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * @author easyh
 * @date 2019.04.24
 * web.xml의 역할을 대신하는 클래스 @Configuration 어노테이션을 이용
 */
@Configuration
@ComponentScan(basePackages= {"org.zerock.sample"})
public class RootConfig {	
}
