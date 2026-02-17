public class ConsultationService extends Service implements Billable {

    public ConsultationService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }

    @Override
    public void performService() {
        if (!isActive()) {
            System.out.println("Service is inactive. Cannot perform service.");
            return;
        }

        System.out.println("Conducting online consultation via " + getServiceName() + "...");
    }

    @Override
    public void generateBill() {
        System.out.println("Generating bill for " + getServiceName() + "...");
    }
}