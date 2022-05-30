package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulito
 *
 * @author Tomás Lijó Paz
 */
public class Circulito {
       
    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulito() {
    }
/**
 * 
 * @param valorX
 * @param valorY
 * @param valorRadio 
 */
    public Circulito(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }
    /**
    * @Constante añadida para el apartado 
    * "Introducir constante LIMITERADIO de tipo double con valor 0.0"
    * Ahora mismo no está siendo utilizada
    */
    private static final double LIMITERADIO = 0.0;
/**
 * 
 * @return diametro del círculo
 */
    public double obtenerDiametro() {
        return getRadio() * 2;
    }
/** 
 * 
 * @return circunferencia del círculo
 */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }
/**
 * 
 * @return el área del círculo
 */
    public double obtenerAreaCirculo() {
        return Math.PI * getRadio() * getRadio();
    }
/**
 * 
 * @return el centro del círculo
 */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }
    /**
     * 
     * @param trasladarX
     * @param trasladarY 
     */
    public void trasladarCentro(int trasladarX, int trasladarY) {
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);

    }
}
