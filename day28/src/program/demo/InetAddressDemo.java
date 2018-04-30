package program.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		function_1();
	}
	
	/*
	 * static InetAddress getByName(String hostName)传递主机名,获取IP地址对象
	 */
	public static void function_1() throws UnknownHostException {
		InetAddress inet = InetAddress.getByName("169.254.49.87");
		System.out.println(inet.toString());
		String ip = inet.getHostAddress();
		String name = inet.getHostName();
		System.out.println(name+"  "+ip);
	}

	/*
	 *  static InetAddress  getLocalHost()   LocalHost本地主机
	 */
	public static void function() throws UnknownHostException {
		InetAddress  inet = InetAddress.getLocalHost();
		System.out.println(inet.toString());
		
		String ip = inet.getHostAddress();
		String name = inet.getHostName();
		System.out.println(name+"  "+ip);
	}
}
