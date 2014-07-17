package org.crazyit.cxfapp;
import java.util.List;

import javax.jws.WebService;

@WebService
public interface FirstWs {
	String sayHi(String text);
	String sayHiToUser(User user);
	List<User> getUserList();
}
