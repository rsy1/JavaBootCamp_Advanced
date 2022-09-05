package bk3_03WorkingWithStatics;

public final class DomainFactory {
	
	private static final DomainFactory instance = new DomainFactory();

    private static final String[] hostNames = new String[5];

    static {
        hostNames[0] = "192.168.1.2";
        hostNames[1] = "192.168.1.4";
        hostNames[2] = "192.168.2.3";
        hostNames[3] = "192.168.2.5";
        hostNames[4] = "192.168.2.14";
    }

    private DomainFactory() {
    }

    public String[] getHostNames() {
        return hostNames;
    }
    
    public static DomainFactory getInstance() {
    	return instance;
    }
}
