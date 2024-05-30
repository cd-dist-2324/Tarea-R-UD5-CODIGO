import java.util.Vector;

public final class Agente extends Persona {

  private float COMISION;

    /**
   * 
   * @element-type Propiedad
   */
  private Vector  propiedadesGestionables;
  private Inmobiliaria inmobiliaria;
  public float getCOMISION() {
    return COMISION;
  }
  public void setCOMISION(float cOMISION) {
    COMISION = cOMISION;
  }
  public Vector getPropiedadesGestionables() {
    return propiedadesGestionables;
  }
  public void setPropiedadesGestionables(Vector propiedadesGestionables) {
    this.propiedadesGestionables = propiedadesGestionables;
  }
  public Inmobiliaria getInmobiliaria() {
    return inmobiliaria;
  }
  public void setInmobiliaria(Inmobiliaria inmobiliaria) {
    this.inmobiliaria = inmobiliaria;
  }
    
  

}