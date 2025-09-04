package tp3;

public class NaveEspacial {

    private String nombre;
    private int combustible;
    private final int CAPACIDAD_MAX = 50; // capacidad máxima (L)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int cant) {
        if (cant < 0) {
            combustible = 0;
        } else if (cant > CAPACIDAD_MAX) {
            combustible = CAPACIDAD_MAX;
        } else {
            combustible = cant;
        }
    }

    public boolean despegar() {// Despegar: consume 15 L
        if (combustible >= 15) {
            combustible = combustible - 15;
            System.out.println("Despegamos!!");
            return true;
        }
        System.out.println("No hay combustible suficiente (requiere 15 L).");
        return false;
    }

    public boolean avanzar(int distancia) {// Avanzar: 5 L por cada unidad de distancia
        if (distancia <= 0) {
            System.out.println("Distancia inválida.");
            return false;
        }
        int consumo = distancia * 5; // 5 L por unidad
        if (combustible >= consumo) {
            combustible = combustible - consumo;
            System.out.println("Avanzó " + distancia + " km (-" + consumo + " L).");
            return true;
        }
        System.out.println("No alcanza el combustible para avanzar " + distancia
                + " (requiere " + consumo + " L y hay " + combustible + " L).");
        return false;
    }
    // Permito recargar sin superar el limite para no derramar.
    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad de recarga inválida.");
            return;
        }
        int espacio = CAPACIDAD_MAX - combustible;      
        if (cantidad > espacio) {
            combustible = CAPACIDAD_MAX; 
            System.out.println("Solo se pudieron cargar " + espacio + " L. Tanque lleno: " + combustible + "/" + CAPACIDAD_MAX + " L");
        } else {
            combustible = combustible + cantidad;
            System.out.println("Recargamos " + cantidad + " L. Combustible: " + combustible + "/" + CAPACIDAD_MAX + " L");
        }
    }
    public void mostrarEstado() {
        System.out.println(nombre + " - Combustible: " + combustible + "/" + CAPACIDAD_MAX + " L");
    }
}
