public class Principal{
String Titulo;
public void main(){
Principal lib = new Principal(); //instanciamos la clase
lib.Titulo ="Soy un Programador"; //asigno una cadena de caracteres a mi atributo
System.out.println(lib.Titulo);

Libro libro = new Libro();
libro.Autor ="soy autor de programacion";
System.out.println(lib.Titulo);
System.out.println(libro.Autor);

  
}
}

class Libro{ //clase libro externa al metodo principal pero en el mismo fichero notepad
String Autor;
}