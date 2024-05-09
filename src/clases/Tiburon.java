package clases;

/**
 *
 * @author adric
 */
public class Tiburon extends Pez {
    private String especie;
    private boolean peligroso;
    private static int numTiburones = 0;

    /**
     * Constructor sin parámetros
     */
    public Tiburon () {
        super(20, Tipo.CARTILAGINOSO, Animal.Habitat.ARTICO, "focas", 100);
        this.especie = "Tiburón blanco";
        this.peligroso = true;
        this.numTiburones ++;
    }
    
    /**
     * Constructor con 4 parámetros
     * 
     * @param especie               Especie de Tiburón
     * @param peligroso             Booleano que indica si es o no peligroso
     * @param velocidadMaxNatacion  Velocidad máxima de nado del tiburón
     * @param tipo                  Tipo de Tiburón
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo) {
        super(velocidadMaxNatacion, tipo);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }

    /**
     * Constructor con 7 parámetros
     * 
     * @param especie               Especie de Tiburón
     * @param peligroso             Booleano que indica si es o no peligroso
     * @param velocidadMaxNatacion  Velocidad máxima de nado del tiburón
     * @param tipo                  Tipo de Tiburón
     * @param habitat               Hábitat del tiburón
     * @param comida                Comida del Tiburón
     * @param longevidad            Longevidad del Tiburón
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo, Habitat habitat, String comida, int longevidad) {
        super(velocidadMaxNatacion, tipo, habitat, comida, longevidad);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }
    
    /**
     * Método para que el tiburón se mueva
     */
    public void desplazar() {
        System.out.println("Estoy nadando a " + this.getVelocidadMaxNatacion() + " km/h.");
    }
    
    /**
     * Método para que el tiburón coma
     */
    public void comer() {
        System.out.println("Estoy comiendo " + this.comida);    
    }
    
    /**
     * Método para que el tiburón se vaya
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        numTiburones--;
        super.finalize();
    }
}
