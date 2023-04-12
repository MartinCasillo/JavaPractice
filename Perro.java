public class Perro {
  public String raza;
  public String color;
  public int edad;

  public void mostrar() {
    System.out.println("Su raza es " + raza);
    System.out.println("Su color de pelo es " + color);
    System.out.println("Tiene " + edad + " Anios");
  }

  public void ladrar(){
    System.out.println("Guau Guau");
  }
}