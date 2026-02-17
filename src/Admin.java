public class Admin extends User {

    public Admin(String name, int id) {
        super(name, id);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("Admin " + getName() + " is managing service: " + s.getServiceName());
    }

    @Override
    public void useService(Service s) {
        System.out.println("Admin " + getName() + " is using service: " + s.getServiceName());
        s.performService();
    }
}