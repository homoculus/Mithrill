package org.crazyit.cxfapp;

import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;


public class Server {
	public static void main(String[] args) {
		System.out.println("Æô¶¯·þÎñÆ÷");
		FirstWsImpl implementor = new FirstWsImpl();
		String address = "http://localhost:9999/leeservice";
		EndpointImpl epImpl = (EndpointImpl)Endpoint.publish(address, implementor);
		epImpl.getOutInterceptors().add(new LoggingOutInterceptor());
		epImpl.getInInterceptors().add(new LoggingInInterceptor());
	}
}
