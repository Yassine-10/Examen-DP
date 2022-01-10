import java.util.ArrayList;
import java.util.List;


public class Attribut {
    public String nom;
    public String type;
    public Visibilite visibilite;
    public Boolean statique;
    public Boolean finale;
    public String etat;
    private List<Observer> observers=new ArrayList<>();

    public void addObserver(Observer o) { observers.add(o); }

    public void removeObserver(Observer o) { observers.remove(o); }


    public void notifyObserver() {
        for(Observer o:observers){
            ;o.update(this);
        }
    }
}
