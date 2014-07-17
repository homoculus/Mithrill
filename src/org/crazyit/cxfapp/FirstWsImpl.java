package org.crazyit.cxfapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

@WebService(endpointInterface = "org.crazyit.cxfapp.FirstWs",
		serviceName = "FirstWsService")
public class FirstWsImpl implements FirstWs {
	private Map<Integer, User> users = new HashMap<Integer, User>();
	
	@Override
	public String sayHi(String text) {
		System.out.println("调用 sayHi 方法");
		return "Hello, " + text;
	}

	@Override
	public String sayHiToUser(User user) {
		System.out.println("调用 sayHiToUser 方法");
		users.put(user.getId(), user);
		return user.getName() + ",欢迎使用 CXF";
	}

	@Override
	public List<User> getUserList() {
		System.out.println("调用 getUserList 方法" + users);
		List<User> result = new ArrayList<User>();
		for(User user : users.values()){
			result.add(user);
		}
		return result;
	}

}
