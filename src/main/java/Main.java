import bll.NacionalidadeBLL;
import bll.TripulanteBLL;
import entity.NacionalidadeEntity;
import entity.TripulanteEntity;

import java.util.List;

public class Main {
    public static void main(String[] arg){
        List<NacionalidadeEntity> nacionalidades;
        nacionalidades = NacionalidadeBLL.listar();
        for (NacionalidadeEntity nac : nacionalidades){
            System.out.println(nac.getNacionalidade());
        }
        List<TripulanteEntity> tripulantes;
        tripulantes = TripulanteBLL.listar();
        for (TripulanteEntity tri : tripulantes){
            System.out.println("Tripulante " + tri.getNumTripulante() + ": " + tri.getNome());
        }
    }
}
