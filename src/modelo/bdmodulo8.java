package modelo;



import java.util.ArrayList;

public class bdmodulo8 {
    private ArrayList<modulo8> BaseDatos8 = new ArrayList<>();

    public bdmodulo8() {
        BaseDatos8.add(new modulo8("nicolas arenas", "Sub-12", "4556", "defensa", "david montaño"));
    }

    public void agregarEquipo(modulo8 equipo) {
        BaseDatos8.add(equipo);
    }

    public String mostrarEquipos() {
        String datos8 = "";
        for (modulo8 equipo : BaseDatos8) {
            datos8 += equipo;
        }
        return datos8;
    }

    public String consultarPorDocumento(String documento) {
        String lista8 = "";
        boolean encontrado = false;
        for (modulo8 equipo : BaseDatos8) {
            if (equipo.getDocumento().equals(documento)) {
                lista8 += equipo;
                encontrado = true;
            }
        }
        if (!encontrado) {
            return "el equipo no se encontro";
        }
        return lista8;
    }

    public String consultarPorCategoria(String categoria) {
        String lista8 = "";
        boolean encontrado = false;
        for (modulo8 equipo : BaseDatos8) {
            if (equipo.getCategoria().equalsIgnoreCase(categoria)) {
                lista8 += equipo;
                encontrado = true;
            }
        }
        if (!encontrado) {
            return "la categoria no tiene jugadores";
        }
        return lista8;
    }

    public String consultarPorEntrenador(String entrenador) {
        String lista8 = "";
        boolean encontrado = false;
        for (modulo8 equipo : BaseDatos8) {
            if (equipo.getEntrenador().equalsIgnoreCase(entrenador)) {
                lista8 += equipo;
                encontrado = true;
            }
        }
        if (!encontrado) {
            return "no se encontro el entrenador";
        }
        return lista8;
    }
}
