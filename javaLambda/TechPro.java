package javaLambda;

public class TechPro {
    private String Batch;
    private String batchName;
    private int batchOrt;
    private int ogrSayisi;

    public TechPro() {
    }

    public TechPro(String batch, String batchName, int batchOrt, int ogrSayisi) {
        Batch = batch;
        this.batchName = batchName;
        this.batchOrt = batchOrt;
        this.ogrSayisi = ogrSayisi;
    }

    public String getBatch() {
        return Batch;
    }

    public void setBatch(String batch) {
        Batch = batch;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public int getBatchOrt() {
        return batchOrt;
    }

    public void setBatchOrt(int batchOrt) {
        this.batchOrt = batchOrt;
    }

    public int getOgrSayisi() {
        return ogrSayisi;
    }

    public void setOgrSayisi(int ogrSayisi) {
        this.ogrSayisi = ogrSayisi;
    }

    @Override
    public String toString() {
        return "TechPro{" +
                "Batch='" + Batch + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchOrt=" + batchOrt +
                ", ogrSayisi=" + ogrSayisi +
                '}';
    }
}


