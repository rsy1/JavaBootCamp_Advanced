package bk3_03WorkingWithStatics;

public class StaticInitializer {
	public static void main(String[] args) {

		DomainFactory peerList01 = DomainFactory.getInstance();
		
		/*//ancient for loop
		for (int j = 0; j < peerList01.getHostNames().length; j++) {
			String hostName = peerList01.getHostNames()[j];
			System.out.println("Host Names1: " + hostName);
		}*/
		
		DomainFactory peerList02 = DomainFactory.getInstance();	
		
		//enhaced for loop
		for(String hostName:peerList02.getHostNames()) {
			System.out.println("Host Names2: " + hostName);
		}
	}
}
