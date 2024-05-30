import java.util.Vector;

public class Propiedad implements IGestionable {

  private String direccion;

  private float precio;

  private TipoOperacion tipoOperacion;

  /**
   * 
   * @element-type Cliente
   */
  private Vector<Cliente> propietarios;
  /**
   * 
   * @element-type Contrato
   */
  private Vector<Contrato> contratos;
  private Agente agente;
  private Inmobiliaria inmobiliaria;

  @Override
  public void mostrarDetalles() {
    System.out.println("Dirección: " + this.direccion);
    System.out.println("Precio: " + this.precio);
    System.out.println("Tipo operación: " + this.tipoOperacion);

    System.out.println("Agente: " + this.agente != null ? this.agente.getNombre() : "No hay agente asignado ");

  }

  @Override
  public float calcularComision() {

    if (this.agente != null) {
      return this.precio * this.agente.getCOMISION();
    } else {
      System.out.println("No hay agente asociado");
      return 0;
    }
  }

}