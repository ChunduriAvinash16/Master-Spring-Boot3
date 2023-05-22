package com.example.demo.service.impl;

import com.example.demo.service.DataService;
import org.springframework.stereotype.Component;

@Component
public class MySqlDbDataService implements DataService {
	@Override public int[] retriveData() {
		return new int[] {10,20,30,40,50};
	}
}
