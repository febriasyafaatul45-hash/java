
public class MainBank {
    public static void main(String[] args) {

        BankAccount akun =
            new BankAccount("Kayla", 1000000);

        System.out.println("Nama Pemilik: Diandra");
        System.out.println("Saldo Awal: Rp" + akun.getSaldo());

        akun.deposit(500000);
        akun.withdraw(200000);

        System.out.println("Saldo Akhir: Rp" + akun.getSaldo());
    }
}
