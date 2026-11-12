
public class BankAccount {

    private String namaPemilik;
    private double saldo;

    public BankAccount(String namaPemilik, double saldoAwal) {
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
    }

    public void deposit(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Deposit berhasil: Rp" + jumlah);
        } else {
            System.out.println("Jumlah tidak valid");
        }
    }

    public void withdraw(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo = saldo - jumlah;
            System.out.println("Penarikan berhasil: Rp" + jumlah);
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
