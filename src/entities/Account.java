package entities;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrwaLimit;

    public Account(){
    }

    public Account(Integer number, String holder, Double balance, Double withdrwaLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrwaLimit = withdrwaLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrwaLimit() {
        return withdrwaLimit;
    }

    public void setWithdrwaLimit(Double withdrwaLimit) {
        this.withdrwaLimit = withdrwaLimit;
    }

    //Métodos
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }
}
