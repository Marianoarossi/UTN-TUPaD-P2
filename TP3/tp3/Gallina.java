package tp3;
/**
 * @author Mariano Rossi
 */
public class Gallina {
    private int idGallina, edad, huevosPuestos;
    public int getIdGallina() {
        return idGallina;
    }
    public void setIdGallina(int idGallinaNew) {
        idGallina = idGallinaNew;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edadNew) {
        edad = edadNew;
    }
    public int getHuevosPuestos() {
        return huevosPuestos;
    }
    public void setHuevosPuestos(int huevosPuestosNew) {
        huevosPuestos = huevosPuestosNew;
    }
    void ponerHuevo() {
        huevosPuestos = huevosPuestos + 1;
    }
    void envejecer() {
        edad = edad + 1;
    }
    void mostrarEstado() {
        System.out.println("Gallina ID " + idGallina + ", edad: " + edad +" años "+ ", huevos: "+ huevosPuestos);
    }
}
