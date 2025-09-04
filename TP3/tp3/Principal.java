package tp3;
import java.util.Scanner;
/**
 * @author Mariano Rossi
 */
public class Principal {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        NaveEspacial nave = new NaveEspacial();
        nave.setNombre("Tierra");
        nave.setCombustible(50);         
        nave.mostrarEstado();        
        nave.despegar();//Despegar consume 15 Litros, inicia con 35L disponibles        
        System.out.print("Ingrese distancia en km a avanzar, no debe ser negativa: ");
        int distancia = input.nextInt();
        boolean ok = nave.avanzar(distancia);//Estado de bandera

        if (!ok) {// Si no alcanza el combustible, ofrecer recargar y volver a intentar
            System.out.print("Ingrese litros a recargar mayor a 0: ");
            int recarga = input.nextInt();
            nave.recargarCombustible(recarga);

            System.out.print("Ingrese nuevamente la distancia a avanzar: ");
            int distancia2 = input.nextInt();
            nave.avanzar(distancia2);
        }
        nave.mostrarEstado(); // Estado final

      
    
        
        
        
        //EJERCICIO GALLINA
        
        /**
        Gallina gallina1 = new Gallina();
        gallina1.setIdGallina(1);//asigno ID
        gallina1.setEdad(3);//Asigno años
        gallina1.setHuevosPuestos(0); //asigno 0 huevos puestos
        Gallina gallina2 = new Gallina();
        gallina2.setIdGallina(2);//asigno ID
        gallina2.setEdad(2);//Asigno años
        gallina2.setHuevosPuestos(4);    //asigno 4 huevos puestos
        gallina1.envejecer(); //sumo un año a gallina1
        gallina1.ponerHuevo(); //llamo poner huevo para que asigne 1.
        // en la gallina2 hago que sume 2 huevos  a los 4 ya agregados previamente dando 6
        //la envejesco 1 año más
        gallina2.ponerHuevo(); 
        gallina2.envejecer(); 
        gallina2.ponerHuevo();
        gallina1.mostrarEstado(); //muesto estado de gallina1 
        gallina2.mostrarEstado();  //muesto estado de gallina2 */

        //Ejercicio Clase LIBRO
        /**
         * Libro libro1 = new Libro();
         *
         * libro1.setTitulo("Programando en JAVA"); libro1.setAutor("Ciminio");
         * libro1.setAnioPublicacion(2022);
         *
         * System.out.println(libro1.getTitulo() + " - " + libro1.getAutor() + "
         * (" + libro1.getAnioPublicacion() + ")");
         * libro1.setAnioPublicacion(500); // Intento inválido.
         * System.out.println("Año invalido, quedara el año : " +
         * libro1.getAnioPublicacion()); libro1.setAnioPublicacion(2005);//
         * Intento valido. System.out.println("Año Valido " +
         * libro1.getAnioPublicacion());
         */
        //Ejercicio Mascota
        /**
         * Mascota animal = new Mascota(); animal.setNombre("Roco");
         * animal.setEspecie("Perro"); animal.setEdad(8);
         *
         * animal.mostrarInfo(); animal.cumplirAnios(); //Sumo un año llamando
         * al metodo cumplirAnios() animal.cumplirAnios(); //Sumo un año
         * llamando al metodo cumplirAnios() animal.cumplirAnios(); //Sumo un
         * año llamando al metodo cumplirAnios() animal.mostrarInfo();
         * //Mostrara 3 años-
         */
        // Ejercicio Estudiante 
        /**
         * //Instancio un estudiante Estudiante alumno = new Estudiante();
         * alumno.setNombre("Marcos"); alumno.setApellido("Ramirez");
         * alumno.setCurso("Arquitectura"); alumno.setCalificacion(9); //muestro
         * los valores asignados alumno.mostrarInfo(); //quedara en 10 ya que no
         * puede superar este valor alumno.subirCalificacion(3);
         * alumno.mostrarInfo(); //impresión de estado actual
         *
         * alumno.bajarCalificacion(4); alumno.mostrarInfo();
         */
    }
}
