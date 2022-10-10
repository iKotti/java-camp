public class CustomerManager {
    private final Customer customer;
    private final CreditManagerInterface creditManager;

    public CustomerManager(Customer customer, CreditManagerInterface creditManager) {
        this.customer = customer;
        this.creditManager = creditManager;
    }

    public void save() {
        System.out.println("Müşteri kaydedildi. ID: " + customer.getId());
    }

    public void delete() {
        System.out.println("Müşteri silindi. ID: " + customer.getId());
    }

    public void giveCredit() {
        this.creditManager.calculate();
        System.out.println("Kredi verildi");

    }
}
