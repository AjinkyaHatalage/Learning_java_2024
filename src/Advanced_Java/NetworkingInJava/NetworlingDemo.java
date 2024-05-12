package Advanced_Java.NetworkingInJava;

import java.net.*;
import java.util.Arrays;

public class NetworlingDemo {
    // import java.net package for this
    public static void main(String[] args) throws UnknownHostException {
        String URL = "www.youtube.com";
        InetAddress inetAddress = Inet4Address.getByName(URL);

        System.out.println("Address : "+ Arrays.toString(inetAddress.getAddress()));

        // getHostAddress
        System.out.println("Host Address is : "+ inetAddress.getHostAddress());

        // isAnyLocalAddress() method
        System.out.println("isAnyLocalAddress : "+inetAddress.isAnyLocalAddress());

        //islinkLocaladdress
        System.out.println("isLinkLocalAddress : "+inetAddress.isLinkLocalAddress());

        //isloopbackaddress
        System.out.println("isLoopbackAddress :"+ inetAddress.isLoopbackAddress());

        // isSiteLocalAddress
        System.out.println("isSiteLocalAddress :"+ inetAddress.isSiteLocalAddress());

        // hashcode() method
        System.out.println("hascode method : "+ inetAddress.hashCode());

        // isMCglobal (MulticastAddress)
        System.out.println("isMcglobal : "+ inetAddress.isMCGlobal());
    }
}
