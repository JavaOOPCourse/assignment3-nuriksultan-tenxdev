public class StreamingService extends Service implements PremiumFeature {

    private boolean isPremium;

    public StreamingService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.isPremium = false;
    }

    @Override
    public void performService() {
        if (!isActive()) {
            System.out.println("Service is inactive. Cannot perform service.");
            return;
        }

        if (isPremium) {
            System.out.println("Streaming 4K content on " + getServiceName());
        } else {
            System.out.println("Streaming HD content on " + getServiceName());
        }
    }

    @Override
    public void upgradeToPremium() {
        this.isPremium = true;
        System.out.println(getServiceName() + " upgraded to premium!");
    }
}