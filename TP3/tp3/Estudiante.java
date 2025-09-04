package tp3; /** @author Mariano Rossi */
public class Estudiante {
    private String nombre, apellido,curso ;
    private int calificacion;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    public void mostrarInfo() {//metodo para mostrar info del estudiante.
        System.out.println(nombre + " " + apellido + " está en curso " + curso + ", Calificación: " + calificacion);
    }
    public void subirCalificacion(int nota) {
        int calificacionNueva = calificacion + nota;
        //Dentro de esté if valido que la nota sea valida. no puede ser mayor a 10 ni menor a 0.         
        if (calificacionNueva > 10) {
            calificacion = 10;
        } else if (calificacionNueva < 0) {
            calificacion = 0;
        } else {
            calificacion = calificacionNueva;
        }
    }
    public void bajarCalificacion(int nota) {
        int calificacionNueva = calificacion - nota;

        if (calificacionNueva < 0) {
            calificacion = 0;
        } else if (calificacionNueva > 10) {
            calificacion = 10;
        } else {
            calificacion = calificacionNueva;
        } }}
