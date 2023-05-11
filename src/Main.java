import exceprions.WrongAccountException;
import exceprions.WrongCurrencyException;
import exceprions.WrongOperationException;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();

        try {
            bankApplication.process(000, 50, "USD");
            bankApplication.process(003, 250, "HRV");
            bankApplication.process(001, 50, "EUR");
            bankApplication.process(001, 50, "USD");
            bankApplication.process(001, 50, "USD");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("This is account doesn't exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("Account have another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("Money in this account not enough");
        } catch (Exception e){
            System.out.println("Process error, please try later");
        } finally {
            System.out.println("Thanks for using our service");
        }
    }
}


