import java.awt.*;
import java.text.DateFormat;

public class TestKlasse {


    public static void main(String [] args){

        Flug flug = new Flug();
        //Flug flug2 = new Flug(DateFormat.getDateInstance(),"T1234");

        flug.setFlugNummer("333");
        //flug.setDatum("1.1.2021");

        Fluglinie tarom = new Fluglinie();
        Fluglinie lufthansa = new Fluglinie();
        Fluglinie airfrance = new Fluglinie();
        try{
            flug.addAnbieter(tarom);
            flug.addAnbieter(lufthansa);
            flug.addAnbieter(airfrance);
        } catch (Flug.istVollException e){ };
        flug.wirdOrganisiert();

        

        Flughafen flughafen = new Flughafen();
        Pilot pilot1 = new Pilot();
        Passagier passagier1 = new Passagier();
        Bordkarte bordkarte1 = new Bordkarte();
        Flughafen startFlughafen1 = new Flughafen();
        Flughafen startFlughafen2 = new Flughafen();
        Flughafen startFlughafen3 = new Flughafen();
        Flughafen startFlughafen4 = new Flughafen();
        Flughafen startFlughafen5 = new Flughafen();
        try{
            flug.addStartFlughafen(startFlughafen1);
            flug.addStartFlughafen(startFlughafen2);
            flug.addStartFlughafen(startFlughafen3);
            flug.addStartFlughafen(startFlughafen4);
            flug.addStartFlughafen(startFlughafen5);
        } catch (Flug.istVollException e){ };
        flug.startetIn();

    }
}
