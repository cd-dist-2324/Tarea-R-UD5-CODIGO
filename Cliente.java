import java.util.Vector;

public class Cliente extends Persona {

  private String contacto;

    /**
   * 
   * @element-type Propiedad
   */
  public Vector  propiedades;
    /**
   * 
   * @element-type ContratoCompraVenta
   */
  private Vector  contratosVenta;
    /**
   * 
   * @element-type ContratoAlquiler
   */
  private Vector  contratosAlquiler;
    private Inmobiliaria inmobiliaria;

}