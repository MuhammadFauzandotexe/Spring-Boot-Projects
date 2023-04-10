package org.ojan.catalog.service.impl;

import java.util.TimeZone;

import org.ojan.catalog.properties.ApplicationProperties;
import org.ojan.catalog.service.GreetingService;
import org.springframework.stereotype.Service;
@Service
public class GreetingServiceImpl implements GreetingService{
	private ApplicationProperties app;
	public GreetingServiceImpl(ApplicationProperties app) {
		super();
		this.app = app;
	}
	@Override
	public String sayGreeting() {
		TimeZone time = TimeZone.getTimeZone(app.getTimezone());
		return app.getWelcome()+"  "+app.getUsername()+" ourTimeZone "+time.getDisplayName();
	}
}
