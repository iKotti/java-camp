public class CarCreditManager extends BaseCreditManager implements CreditManagerInterface {

    @Override
    public void calculate() {
        System.out.println("Taşıt kredisi hesaplandı.");
    }
}
