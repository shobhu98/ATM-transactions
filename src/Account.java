public class Account {

    public int getCustomerlogin() {
        return customerlogin;
    }

    public void setCustomerlogin(int customerlogin) {
        this.customerlogin = customerlogin;
    }

    public int getCustomerpin() {
        return customerpin;
    }

    public void setCustomerpin(int customerpin) {
        this.customerpin = customerpin;
    }

    public double getCurrentbalance() {
        return currentbalance;
    }

    public void setCurrentbalance(double currentbalance) {
        this.currentbalance = currentbalance;
    }

    public double getSavingbalance() {
        return savingbalance;
    }

    public void setSavingbalance(double savingbalance) {
        this.savingbalance = savingbalance;
    }

    protected void current_withdraw(int withdraw_amount){
        if(currentbalance<withdraw_amount){
            System.out.println("withdraw amount is greater than current balance");
        }
        else{
            currentbalance=currentbalance-withdraw_amount;
            System.out.println("new current balance is"+getCurrentbalance());

        }


    }
    protected void saving_deposit(int deposit_amount){
        savingbalance=savingbalance+deposit_amount;
        System.out.println("new current balance is "+getSavingbalance());
    }
    protected void saving_withdraw(int withdraw_amount){
        if(savingbalance<withdraw_amount){
            System.out.println("withdraw amount is greater than current balance");
        }
        else{
            savingbalance=savingbalance-withdraw_amount;
            System.out.println("new current balance is"+getSavingbalance());

        }


    }
    protected void current_deposit(int deposit_amount){
        currentbalance=currentbalance+deposit_amount;
        System.out.println("new current balance is "+getCurrentbalance());
    }


    private int customerlogin;
    private int customerpin;
    private double currentbalance=0;
    private double savingbalance=0;


}

