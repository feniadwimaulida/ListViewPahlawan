package id.ac.poliban.fenia.listviewpahlawan;

public class Pahlawan {
    private String gambar;
    private String namaPahlawan;
    private String deskripsiPahlawan;

    public Pahlawan(String gambar, String namaPahlawan, String deskripsiPahlawan) {
        this.gambar = gambar;
        this.namaPahlawan = namaPahlawan;
        this.deskripsiPahlawan = deskripsiPahlawan;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getNamaPahlawan() {
        return namaPahlawan;
    }

    public void setNamaPahlawan(String namaPahlawan) {
        this.namaPahlawan = namaPahlawan;
    }

    public String getDeskripsiPahlawan() {
        return deskripsiPahlawan;
    }

    public void setDeskripsiPahlawan(String deskripsiPahlawan) {
        this.deskripsiPahlawan = deskripsiPahlawan;


    }

    @Override
    public String toString() {
        return String.format("%30s", getNamaPahlawan());
    }
}
