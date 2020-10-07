/** @author Volker Rampmeier */
import java.util.*;
public class Flug {

    /** Datum des Fluges und Nummer des Fluges: */
    private Calendar datum;
    private String flugNummer = "nn";

    /**Construktoren */
    Flug(){
        System.out.println (this.toString() + " wurde angelegt.");
    }

    Flug(Calendar datum, String flugNummer){
        this.datum = datum;
        this.flugNummer = flugNummer;
        System.out.println (this.toString() + " wurde angelegt.");
    }


    /** Exception Klasse für die Arraylisten */
    class istVollException extends Exception {
        istVollException(String meldung) {System.out.println(meldung);}
    }


    /** setter der Attribute datum und flugnummer
     *
     */
    public void setDatum( Calendar datum){
        this.datum = datum;
    }

    public void setFlugNummer(String flugNummer){
        this.flugNummer = flugNummer;
    }

    /** getter der Attribute datum und flugnummer
     */

    public Calendar getDatum(){
        return this.datum;
    }

    public String getFlugNummer(){
        return this.flugNummer;
    }




    /**
     * toString-Methode überschreiben
     */
    @Override public String toString(){
        //return this.getClass().getSimpleName();
        return  this.getClass().getSimpleName() + " mit Flugnummer: " + this.getFlugNummer();
    }
// Assoziationen
//Fluglinie
private ArrayList<Fluglinie> anbieter = new ArrayList<>();  //max 2

public void addAnbieter( Fluglinie fluglinie) throws istVollException{
    if (anbieter.size() < 2) anbieter.add(fluglinie);
    else throw new istVollException("Es sind schon zwei Fluglinien  eingetragen"){ };
}

public ArrayList<Fluglinie> getAnbieter(){
    return anbieter;
}

public void wirdOrganisiert(){
    System.out.println( this.toString() + " wird organisiert. ");
}

//Piloten
private ArrayList <Pilot> CaptainOrCopilot = new ArrayList<>();  //maximal 3

public void addCaptainOrCopilot(Pilot pilot) throws istVollException{
     if(CaptainOrCopilot.size() < 3) CaptainOrCopilot.add(pilot);
     else throw new istVollException("Es sind nicht mehr als drei Piloten nötig"){};
    }

public ArrayList<Pilot> getCaptainOrCopilot  () {
    return CaptainOrCopilot;
}

public void wirdGesteuert(){
    System.out.println(this.toString() + " wird gesteuert.");
}


//Flugzeug
public Flugzeug ressource = null; // eins

public void addFlugzeug(Flugzeug flugzeug) throws istVollException {
        if(ressource==null) this.ressource = flugzeug;
        else throw new istVollException("Es ist nur ein Flugzeug pro Flug möglich"){};
}

public Flugzeug getFlugzeug(){
    return this.ressource;
}

public void benutzt(){
    System.out.println(this.toString() + " benutzt.");
}

//Passagier
private ArrayList <Passagier> derPassagier = new ArrayList<>();

public void addPassagier(Passagier passagier) throws istVollException{
    if (derPassagier.size() < 853) derPassagier.add(passagier);
    else throw new istVollException("Es können nicht mehr als 853 Plätze vergeben werden!");
}
public void wirdGebucht(){
    System.out.println(this.toString() + " wird gebucht.");
}
public ArrayList<Passagier>getPassagier(){
    return derPassagier;
}

//Bordkarte
private ArrayList <Bordkarte> bordkarten = new ArrayList<>();

public void addBordkarte(Bordkarte bordkarte) throws istVollException{
    if (bordkarten.size() < 853) bordkarten.add(bordkarte);
    else throw new istVollException("Es können nicht mehr als 853 Bordkarten vergeben werden!");
}

public ArrayList<Bordkarte> getBordkarte(){
    return bordkarten;
}

public void giltFür(){
    System.out.println(this.toString() + " gilt für.");
}

//Flughafen
private ArrayList <Flughafen> zielFlughafen = new ArrayList<>();

public void addZielFlughafen(Flughafen flughafen) throws istVollException {
    if(zielFlughafen.size()<4) zielFlughafen.add(flughafen);
    else throw new istVollException("Es sind maximal vier Landungen möglich"){};
}

public ArrayList<Flughafen> getZielFlughaefen(){
    return zielFlughafen;
}

public void kommtAnIn(){
    System.out.println(this.toString() + " kommt an in.");

}

public ArrayList<Flughafen> startFlughafen = new ArrayList<>();
public void addStartFlughafen(Flughafen flughafen) throws istVollException {
        if(startFlughafen.size()<4) startFlughafen.add(flughafen);
        else throw new istVollException("Es sind maximal vier Starts möglich"){};
}

public ArrayList<Flughafen> getStartFlughaefen(){
        return startFlughafen;
}

public void startetIn() {
    System.out.println(this.toString() + " startet in.");
}
}