public class CloudStorageService extends Service implements PremiumFeature, Billable {

    private boolean isPremium;

    public CloudStorageService(String serviceName, int serviceId) {
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
            System.out.println("Accessing premium cloud storage with unlimited space...");
        } else {
            System.out.println("Accessing cloud storage...");
        }
    }

    @Override
    public void upgradeToPremium() {
        this.isPremium = true;
        System.out.println(getServiceName() + " upgraded to premium!");
    }

    @Override
    public void generateBill() {
        System.out.println("Generating bill for " + getServiceName() + "...");
    }
}