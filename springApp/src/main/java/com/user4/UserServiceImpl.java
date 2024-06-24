package com.user4;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserServiceImpl implements UserService {
	private String name;
	private Map<String, String> address;
	private List<String> hobby;
	private Properties tels;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getAddress() {
		return address;
	}
	public void setAddress(Map<String, String> address) {
		this.address = address;
	}
	public List<String> getHobby() {
		return hobby;
	}
	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}
	public Properties getTels() {
		return tels;
	}
	public void setTels(Properties tels) {
		this.tels = tels;
	}
	
	@Override
	public String message() {
		String s = "[이름 :" + name + "]\n";
		
		s += "주소록...\n";
		Iterator<String> it = address.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = address.get(key);
			
			s += key + ":" + value + "\n";
		}
		s += "---------------------\n";

		s += "전화번호...\n";
		Iterator<Object> it2 = tels.keySet().iterator();
		while (it2.hasNext()) {
			String key = (String) it2.next();
			String value = tels.getProperty(key);
			
			s += key + " : " + value + "\n";
		}
		s += "---------------------\n";
		
		s += "취미...\n";
		for(String h : hobby) {
			s += h + " ";
		}
		s += "\n---------------------\n";
		
		return s;
	}

}
