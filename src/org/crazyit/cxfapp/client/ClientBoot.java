package org.crazyit.cxfapp.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.crazyit.cxfapp.FirstWs;
import org.crazyit.cxfapp.User;

public class ClientBoot {
	public static void main(String[] args) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(FirstWs.class);
		factory.setAddress("http://localhost:9999/leeservice");
		FirstWs fw = (FirstWs)factory.create();
		Client client = ClientProxy.getClient(fw);
		
		client.getOutInterceptors().add(new LoggingOutInterceptor());
		client.getInInterceptors().add(new LoggingInInterceptor());
		
		String reply = fw.sayHi("ËïÎò¿Õ");
		System.out.println(reply);
		User user = new User(2, "Öí°Ë½ä", "ÄÐ", 1.86);
		System.out.println(fw.sayHiToUser(user));
		System.out.println(fw.getUserList());
	}
}
