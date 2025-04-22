package dedicnost;

public class Auto {
    private int pocetSedadel = 5;
    private int pocetDveri = 5;
    private int pocetNahradnichKol = 1;
    private int pocetKoni;
    private int cena;
    private String barva;
    public Auto(int pocetKoni, int cena, String barva) {
        this.pocetKoni = pocetKoni;
        this.cena = cena;
        this.barva = barva;
    }

    public void setPocetSedadel(int pocetSedadel) {
        this.pocetSedadel = pocetSedadel;
    }

    public void setPocetDveri(int pocetDveri) {
        this.pocetDveri = pocetDveri;
    }

    public void setPocetNahradnichKol(int pocetNahradnichKol) {
        this.pocetNahradnichKol = pocetNahradnichKol;
    }

    public void setPocetKoni(int pocetKoni) {
        this.pocetKoni = pocetKoni;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setBarva(String barva) {
        this.barva = barva;
    }

    public int getPocetSedadel() {
        return pocetSedadel;
    }

    public int getPocetDveri() {
        return pocetDveri;
    }

    public int getPocetNahradnichKol() {
        return pocetNahradnichKol;
    }

    public int getPocetKoni() {
        return pocetKoni;
    }

    public int getCena() {
        return cena;
    }

    public String getBarva() {
        return barva;
    }

    public void vypisInfo(){
        System.out.println("Počet sedadel: "+pocetSedadel+" Počet dveří "+pocetDveri+" Počet náhradních kol "+pocetNahradnichKol+" Počet koní "+pocetKoni+" Cena "+cena+" Barva "+barva);
    }
    public void jizdaStart(){
        System.out.println("Auto začala svou jízdu.");
    }
}