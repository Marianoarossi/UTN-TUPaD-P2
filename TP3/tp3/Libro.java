package tp3;
/**
 * @author Mariano Rossi
 */
public class Libro {
    private String titulo, autor;
    private int anioPublicacion;
    public void setTitulo(String nuevoTitulo) {
        titulo = nuevoTitulo;
    }
    public void setAutor(String nuevoAutor) {
        autor = nuevoAutor;
    }
    public void setAnioPublicacion(int nuevoAnio) {
        if (nuevoAnio >= 868 && nuevoAnio <= 2025) {
            //tomando de referencia  "Sutra del Diamante" (868 d.C.). 
            anioPublicacion = nuevoAnio;
        }
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
}
