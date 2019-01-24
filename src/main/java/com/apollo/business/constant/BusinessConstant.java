package com.apollo.business.constant;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 *
 */
@PropertySource(value = "classpath:business/read.properties",encoding = "utf-8")
@Component
public final class BusinessConstant {

}
