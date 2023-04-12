public class Celular{
  public String modelo;
  public double precio;
  public String color;
  public int anioLanzamiento;

  public void mostrar(){
    System.out.println("El modelo es " + modelo);
    System.out.println("Su precio es " + precio);
    System.out.println("El color del celular es " + color);
    System.out.println("Su anio de lanzamiento fue " + anioLanzamiento);
  }
}