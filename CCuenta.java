
package TareaClaseDAMLopedeVega;

public class CCuenta {

  private String nombre;
  private String cuenta;
  private double saldo;
  private double tipoInteres;

  public CCuenta() {
    // Constructor por defecto
  }

  /**
   *
   * @param nom
   * @param cue
   * @param sal
   * @param tipo
   */
  public CCuenta(String nom, String cue, double sal, double tipo) {
    nombre = nom;
    cuenta = cue;
    saldo = sal;
    tipoInteres = tipo;
  }

  /**
   *
   * @param nom
   */
  public void asignarNombre(String nom) {
    nombre = nom;
  }

  public String obtenerNombre() {
    return nombre;
  }

  public double estado() {
    return saldo;
  }

  /**
   *
   * @param cantidad
   * @throws Exception
   */
  public void ingresar(double cantidad) throws Exception {
    if (cantidad < 0) {
      throw new Exception("No se puede ingresar una cantidad negativa");
    }
    setSaldo(saldo + cantidad);
  }

  public void retirar(double cantidad) throws Exception {
    if (cantidad < 0) {
      throw new Exception("No se puede retirar una cantidad negativa");
    }
    if (estado() < cantidad) {
      throw new Exception("No se hay suficiente saldo");
    }
    setSaldo(saldo - cantidad);
  }

  /**
   *
   * @return
   */
  public String obtenerCuenta() {
    return cuenta;
  }

  /**
   *
   * @param cuenta
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   *
   * @param saldo
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  /**
   *
   * @return
   */
  public double getTipoInteres() {
    return tipoInteres;
  }

  /**
   *
   * @param tipoInteres
   */
  public void setTipoInteres(double tipoInteres) {
    this.tipoInteres = tipoInteres;
  }
}
