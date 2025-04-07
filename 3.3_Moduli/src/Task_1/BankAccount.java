package Task_1;

public class BankAccount {

    // Variables de instancia / Instanssimuuttujat

    private int accountNumber; // Tilinumero
    private double balance;// Saldo

    // Variable estática / Staattinen muuttuja
    private static int totalAccounts = 0;


    // Constructor / Konstruktori
    public BankAccount(double initialBalance){
        this.accountNumber = totalAccounts+1; // genera un numero de cuenta
        this.balance = initialBalance;
        totalAccounts++;
    }
    // Méto de instancia para depositar  / Instanssimenetelmä varojen tallettamiseksi
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;// Añade al saldo / Lisää saldoa

        }
    }
    // Méto de instancia para retirar  / Instanssimetodi  nostamiseksi
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;// Resta del saldo / Vähennä saldoa
        }
    }
    //  metodos saldo / metodi saldon
    public double getBalance() {
        return balance; // Devuelve el saldo / Palauta saldo
    }
    // Méto de instancia para obtener el número de cuenta / Instanssimetodi tilinumeron
    public int getAccountNumber() {
        return accountNumber;
    }


    // Méto estático para obtener el número total de cuentas / Staattik metodi tilien kokonaismäärän
    public static int getTotalAccounts() {
        return totalAccounts;
    }


}
