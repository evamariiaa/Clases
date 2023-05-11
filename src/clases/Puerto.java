package clases;

import clases.Contenedor;
import clases.Hub;

public class Puerto {

    private Hub[] puerto = new Hub[3];

    public Puerto() {
        for(int i = 0; i < this.puerto.length; ++i) {
            this.puerto[i] = new Hub();
        }

    }

    public void buscarContenedor(Contenedor[][] hub, int prioridad, Contenedor c) {

        int idContenedor;

        for (int i = 0; i < puerto.length; i++) {
            if (this.puerto[i] != null) {
                for (int j = 0; j < hub.length; j++) {
                    for (int k = 0; k < hub[j].length; k++) {
                        if (prioridad == 1) {
                            idContenedor = c.getID();
                            System.out.println(idContenedor);
                        }
                    }
                }
            }

        }
    }

    public String toString(Contenedor[][] hub, int prioridad, Contenedor c){

        String s = " ";
        int idContenedor;

        for (int i = 0; i < puerto.length; i++) {
            if (this.puerto[i] != null) {
                for (int j = 0; j < hub.length; j++) {
                    for (int k = 0; k < hub[j].length; k++) {
                        if (prioridad == 1) {
                            s+= "ID: " +  c.getID()+ "\n";
                            s+= "Peso: " + c.getPeso() + "\n";
                            s+= "Empresa que lo envia: " + c.getEmpresaEnvia() + "\n";
                        }
                    }
                }
            }

        }
        return s;

    }


}
