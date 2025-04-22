import dedicnost.Ferrarii;
import dedicnost.Audi;
import dedicnost.Fabia;

public class Main {
    public static void main(String[] args) {

        Ferrarii ferrarii = new Ferrarii(900,8000000,"Červená");
        ferrarii.vypisInfo();
        ferrarii.jizdaStart();
        Audi audi = new Audi(600,1500000,"Stříbrná");
        audi.vypisInfo();
        audi.jizdaStart();
        Fabia fabia = new Fabia(8000,100000,"Sigmovská");
        fabia.vypisInfo();
        fabia.jizdaStart();
    }
}