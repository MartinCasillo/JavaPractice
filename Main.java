class Main {

  public static void main(String[] args) {
    Camisa cam = new Camisa();
    cam.descripción = "Manga Corta";
    cam.precio = 100;
    cam.color = "verde";
    cam.talle = 3;
    cam.mostrar();

    Camisa cam2 = new Camisa();
    cam2.descripción = "Manga Media";
    cam2.precio = 400;
    cam2.color = "Azul";
    cam2.talle = 32;
    cam2.mostrar();

    Camisa va1 = new Camisa();
    va1.descripción = "Manga Larga";
    va1.precio = 130;
    va1.color = "rojo";
    va1.talle = 5;
    va1.mostrar();

    Perro mascota1 = new Perro();
    mascota1.raza = "Dobberman";
    mascota1.color = "Marron";
    mascota1.edad = 10;
    mascota1.mostrar();

    Celular cel1 = new Celular();
    cel1.modelo = "Samsung";
    cel1.precio = 220200;
    cel1.color = "Phantom Violet";
    cel1.anioLanzamiento = 2022;
    cel1.mostrar();

    Persona per = new Persona();
    per.saludo();
      
    Perro mascota2 = new Perro();
    mascota2.ladrar();
  
    Operacion suma1 = new Operacion();
    suma1.sumar();

    Datos dato1 = new Datos();
    dato1.mostrarDatos();

    SizeOfPrimitiveType mostrar1 = new SizeOfPrimitiveType();
    mostrar1.mostrar();

    Entero mostrame = new Entero();
    mostrame.mostrarEntero();

    Long mostrameLargo = new Long();
    mostrameLargo.mostrarLong();
  }
}
