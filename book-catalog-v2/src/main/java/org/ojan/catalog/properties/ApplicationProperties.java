package org.ojan.catalog.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import lombok.Data;

@Configuration
@ConfigurationProperties(prefix="app")
@Data
public class ApplicationProperties {
	private String welcome;
	private String timezone;
	private String username;
}
