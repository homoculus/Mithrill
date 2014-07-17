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
		System.out.println("���� sayHi ����");
		return "Hello, " + text;
	}

	@Override
	public String sayHiToUser(User user) {
		System.out.println("���� sayHiToUser ����");
		users.put(user.getId(), user);
		return user.getName() + ",��ӭʹ�� CXF";
	}

	@Override
	public List<User> getUserList() {
		System.out.println("���� getUserList ����" + users);
		List<User> result = new ArrayList<User>();
		for(User user : users.values()){
			result.add(user);
		}
		return result;
	}

}
