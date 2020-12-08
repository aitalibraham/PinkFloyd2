package Pinkfloyd2.Pinkfloyd2;
import java.util.ArrayList;

/**
 * Décrivez votre classe Membres ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Membre
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String name;
    private int age;
    private ArrayList<Instruments> instruments = new ArrayList<Instruments>();
    /**
     * Constructeur d'objets de classe Membres
     */
    public Membre()
    {
        // initialisation des variables d'instance
        this.name="David Gilmur";
        this.age=77;
        
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public int getAge()
    {
        // Insérez votre code ici
        return this.age;
    }
    
    public String getName()
    {
        // Insérez votre code ici
        return this.name;
    }
    public void setName(String name)
    {
        // Insérez votre code ici
        this.name = name;
    }
    public void setAge(int age)
    {
        // Insérez votre code ici
        this.age = age;
    }
    
    public void addYear()
    {
        // Insérez votre code ici
        this.age++;
    }
    
    public void addInstrument(Instruments instru ) {
    	this.instruments.add(instru);
    }
    
    public Instruments getInstruments(int i) {
    	return this.instruments.get(i);
    }
    
    public ArrayList<Instruments> getInstruments(){
    	return this.instruments;
    }
    
    
    
    
}
