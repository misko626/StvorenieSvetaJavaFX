package sample.demo.entity;

public class Planeta {

    private String meno;
    private double vaha;
    private double priemer;



    public Planeta(String meno, double vaha, double priemer) {
        this.meno = meno;
        this.vaha = vaha;
        this.priemer = priemer;
    }




    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public double getVaha() {
        return vaha;
    }

    public void setVaha(double vaha) {
        this.vaha = vaha;
    }

    public double getPriemer() {
        return priemer;
    }

    public void setPriemer(double priemer) {
        this.priemer = priemer;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planeta: Meno: ").append(this.meno).append(", vaha: ").append(this.vaha).append("kg, priemer:").append(this.priemer).append("m");
        return  sb.toString();
    }
}
