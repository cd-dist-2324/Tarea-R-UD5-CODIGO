import java.util.Vector;

public class Propiedad implements IGestionable {

  private String direccion;

  private float precio;

  private TipoOperacion tipoOperacion;

    /**
   * 
   * @element-type Cliente
   */
  private Vector  propietarios;
    /**
   * 
   * @element-type Contrato
   */
  private Vector  contratos;
    private Agente agente;
    private Inmobiliaria inmobiliaria;

}