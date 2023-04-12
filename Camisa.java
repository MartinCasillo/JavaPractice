public class Camisa {
  public String descripción;
  public String color; // Puedo usar char
  public double precio;
  public int talle;

  public void mostrar() {
    System.out.println("Item Descripción: " + descripción);
    System.out.println("Color código " + color);
    System.out.println("Item precio " + precio);
    System.out.println("El talle es " + talle);
  }
}