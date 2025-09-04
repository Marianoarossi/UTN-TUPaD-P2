package tp3;
/**
 * @author Mariano Rossi
 */
public class Mascota {
    private String nombre, especie;
    private int edad;
    public void mostrarInfo() {
        System.out.println(nombre + " (" + especie + "), edad: " + edad);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombreN) {
        nombre = nombreN;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especieN) {
        especie = especieN;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad >= 0) edad = edad;
    }
    public void cumplirAnios() {
        edad = edad + 1;
    }
}
