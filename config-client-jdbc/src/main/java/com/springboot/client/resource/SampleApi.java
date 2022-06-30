/**
 * 
 */
package com.springboot.client.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@ConfigurationProperties(prefix = "config-client-jdbc") // or @RefreshScope
@RefreshScope
public class SampleApi {
	@Value("${dummy.message:test}")
	private String aConf;

	@Value("${welcome.message:test}")
	private String welcome;
	
	@GetMapping
	public String getConf() {
		return this.aConf;
	}

	@GetMapping("/welcome")
	public String getWelcome() {
		return this.welcome;
	}
}
