package pinkfloyd2;

import java.util.ArrayList;

import junit.framework.TestCase;

/**
 * Classe-test MembresTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class MembresTest extends TestCase
{
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    protected double fValeur1;
    protected double fValeur2;
    
    private Membre davidgilmur;
    private Instruments guitare;
    private Instruments piano;
    /**
     * Constructeur de la classe-test MembresTest
     *
    public MembresTest()
    {
    }
    */
    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    /*
    @Before
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        initialiseTest();
        
    }
*/



    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }
    
    @Test
    public void testBonAge(){
    	davidgilmur = new Membre();
        davidgilmur.addYear();
        Assert.assertEquals(78, davidgilmur.getAge());
    }
    
    
    @Test
    public void testBonRole(){
    	davidgilmur = new Membre();
    	guitare = new Instruments();
        piano = new Instruments("piano", davidgilmur);
        assertEquals("guitariste", guitare.role(davidgilmur));
    }
    
    @Test
    public void testBonInstru(){
    	davidgilmur = new Membre();
    	guitare = new Instruments();
        piano = new Instruments("piano", davidgilmur);
    	ArrayList<Instruments> instruments = new ArrayList<Instruments>();
    	instruments.add(new Instruments("piano"));
    	instruments.add(new Instruments("guitare"));
        assertEquals(instruments.get(0).getName(), davidgilmur.getInstruments(0).getName());
        
    }
}
