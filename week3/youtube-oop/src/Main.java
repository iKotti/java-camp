public class Main {
    public static void main(String... args) {
        Person person = new Person();
        person.setId(1);
        person.setFirstName("İlker");
        person.setLastName("Yıldız");
        person.setNationalIdentity("11122233344");
        person.setCity("Ankara");

        Company company = new Company();
        company.setId(2);
        company.setCompanyName("PencilPie");
        company.setTaxNumber("111222333");
        company.setCity("Mersin");


        CreditManagerInterface creditManagerMilitary = new MilitaryCreditManager();
        CreditManagerInterface creditManagerTeacher = new TeacherCreditManager();
        CreditManagerInterface creditManagerCar = new CarCreditManager();

        creditManagerMilitary.calculate();
        creditManagerTeacher.calculate();
        creditManagerCar.calculate();

        CustomerManager customerManagerMilitary = new CustomerManager(person, creditManagerMilitary);
        customerManagerMilitary.save();

        CustomerManager customerManagerTeacher = new CustomerManager(company, creditManagerTeacher);
        customerManagerTeacher.save();
    }
}

