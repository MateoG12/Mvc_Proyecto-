package modelo;

import java.util.ArrayList;

public class bdmodulo6 {

    public ArrayList<modulo6> baseDatos = new ArrayList<modulo6>();

    public bdmodulo6() {
        baseDatos.add(new modulo6("tom", "james", "cc", 45465, "infantil"));
    }

    public void agregarpersona(modulo6 p) {
        baseDatos.add(p);
    }

    public String mostrarlistatipo(ArrayList<modulo6> lista) {
        String datos = " ";
        for (modulo6 p : lista) {
            datos += p.toString();
        }
        return datos;
    }

    public String consultatipo(String tipod) {
        String lista = "";
        for (modulo6 p : baseDatos) {
            if (p.getTipod().equalsIgnoreCase(tipod))
                lista += p.toString();
        }
        return lista;
    }

    public String consultacategoria(String categoria) {
        String lista = "";
        for (modulo6 p : baseDatos) {
            if (p.getCategoria().equalsIgnoreCase(categoria))
                lista += p.toString();
        }
        return lista;
    }

    public String consultadoc(int documento) {
        String lista = "";
        for (modulo6 p : baseDatos) {
            if (p.getDocumento() == documento) {
                lista += p.toString() + "\n";
            }
        }
        return lista;
    }

    public void eliminarpersona(int documento) {
        for (int i = 0; i < baseDatos.size(); i++) {
            if (baseDatos.get(i).getDocumento() == documento) {
                baseDatos.remove(i);
                break;
            }
        }
    }

    public void editarpersona(int documento, String ccambiar, String vnuevo) {
        for (modulo6 p : baseDatos) {
            if (p.getDocumento() == documento) {
                switch (ccambiar) {
                    case "nombre":
                        p.setNombre(vnuevo);
                        break;
                    case "apellido":
                        p.setApellido(vnuevo);
                        break;
                    case "tipod":
                        p.setTipod(vnuevo);
                        break;
                    case "categoria":
                        p.setCategoria(vnuevo);
                        break;
                    default:
                        System.out.println("no válido.");
                        break;
                }
                break;
            }
        }
    }

    public ArrayList<modulo6> getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(ArrayList<modulo6> baseDatos) {
        this.baseDatos = baseDatos;
    }

    @Override
    public String toString() {
        return "Base de datos{" +
                "base Datos=" + baseDatos +
                '}';
    }
}


