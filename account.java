public class account {
    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNumber;
    public account(String Number, double Balance, String Name, String Email, String PhoneNumber) {
        this.Number = Number;
        this.Balance = Balance;
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }
    public void DepositMoney(double DepositedMoney){
        this.Balance += DepositedMoney;
        System.out.println("Deposit is successful,new balance is " +this.Balance);

    }
    public void WithdrawMoney(double WithdrawMoney){
        if(this.Balance - WithdrawMoney < 0){
            System.out.println("Withdraw is unsuccessful " +this.Balance+" is left");
        }else{
            this.Balance -= WithdrawMoney;
            System.out.println("Withdraw is successful,current balance is " +this.Balance);
        }
    }
    public String getNumber() {
        return Number;
    }
}
