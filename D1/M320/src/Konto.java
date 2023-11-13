public class Konto {
    private int kontoNum;
    private double saldo;
    private double limite;

    public Konto(int kontoNum, double limite) {
        this.kontoNum = kontoNum;
        this.limite = limite;
        this.saldo = 100;
    }

    public int getKontoNum() {
        return kontoNum;
    }

    public double getSaldo() {
        return saldo;
    }

    public void einzahlen(double betrag) {
        if((saldo + betrag)  <= limite) {
            this.saldo += betrag;
        }
    }

    public void abheben(double betrag) {
        this.saldo -= betrag;
    }

    public void ueberweisen(Konto konto, double betrag) {
        if((konto.getSaldo() + betrag)  <= limite) {
            konto.einzahlen(betrag);
        }
    }
}
