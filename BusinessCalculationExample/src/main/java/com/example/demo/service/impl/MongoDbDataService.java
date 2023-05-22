package com.example.demo.service.impl;

import com.example.demo.service.DataService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService {
	@Override public int[] retriveData() {
		return new int[] {12,13,14,55};
	}
}
