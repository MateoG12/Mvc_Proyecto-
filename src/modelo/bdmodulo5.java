package modelo;

import modelo.modulo5;

import java.util.ArrayList;

public class bdmodulo5 {
        public ArrayList<modulo5> baseDatos5 = new ArrayList<>();
        public bdmodulo5(){
            baseDatos5.add(new modulo5("balones" , 23));
        }


        public void agregarmateriales(modulo5 materiales) {
            baseDatos5.add(materiales);
        }

        public  String mostrarmateriales(){
            String datos5 = "";
            for (modulo5 m5 : baseDatos5){
                datos5 += m5.toString();
            }return datos5;
        }

        public String consultamateriales(String materiales){
            String lista5 = "";
            for(modulo5 m5 : baseDatos5){
                if (m5.getMateriales().equals(materiales))
                    lista5 += m5.toString();
            }
            return lista5;
        }




        public String modificarmateriales(String materiales, modulo5 nuevomaterial){
            for(int i = 0; i<baseDatos5.size();i++){
                modulo5 m5 = baseDatos5.get(i);
                if(m5.getMateriales().equals(materiales)){
                    baseDatos5.set(i,nuevomaterial);
                    return "se modifico el materia";
                }
            }
            return "no se pudo modificar";
        }

        public String eliminarmaterial(String materiales){
            ArrayList<modulo5> copia5BaseDatos = new ArrayList<>(baseDatos5);
            for (modulo5 m5: copia5BaseDatos){
                if (m5.getMateriales().equals(materiales)){
                    baseDatos5.remove(m5);
                    return "se elimino ";
                }
            }
            return "no se elimino";
        }

        public ArrayList<modulo5> getBaseDatos5(){
            return baseDatos5;
        }

        public void setBaseDatos5(ArrayList<modulo5> baseDatos5) {
            this.baseDatos5 = baseDatos5;
        }

        @Override
        public String toString() {
            return "bdmodulo5{" +
                    "baseDatos5=" + baseDatos5 +
                    '}';
        }
    }

