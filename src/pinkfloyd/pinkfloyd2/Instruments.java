package pinkfloyd;
/**
 * Décrivez votre classe Instruments ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Instruments
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String name;
 
    
    /**
     * Constructeur d'objets de classe Instruments
     */
    public Instruments()
    {
        // initialisation des variables d'instance
        this.name="guitare";
    }
    
    public Instruments(String instru) {
    	 this.name=instru;
    }
    
    public Instruments(String instru, Membre mbr)
    {
        // initialisation des variables d'instance
        this.name=instru;
        mbr.addInstrument(this);
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public String getName()
    {
        // Insérez votre code ici
        return this.name;
    }
    
    
 
 
    public void setName(String instru)
    {
        // Insérez votre code ici
        this.name= instru;
    }
    
    public String role(Membre mbr)
    {
        // Insérez votre code ici
        String role = "";
        if (this.name == "guitare"){
            role = "guitariste";
        }
        return role;
    }
    
}
