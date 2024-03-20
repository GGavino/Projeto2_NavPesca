import bll.*;
import entity.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] arg){

        List<NacionalidadeEntity> nacionalidades;
        nacionalidades = NacionalidadeBLL.listar();
        for (NacionalidadeEntity nac : nacionalidades){
            System.out.println(nac.getNacionalidade());
        }
        System.out.println("Tripulantes:");
        List<TripulanteEntity> tripulantes;
        tripulantes = TripulanteBLL.listar();
        for (TripulanteEntity tri : tripulantes){
            System.out.println("Tripulante " + tri.getNumTripulante() + ": " + tri.getNome());
        }
        System.out.println("Gestores:");
        List<GestorEntity> gestores;
        gestores = GestorBLL.listar();
        for (GestorEntity gestor : gestores){
            System.out.println("Gestor " + gestor.getNumGestor() + ": " + gestor.getNome() + ", Nacionadade: " + gestor.getNacionalidade().getNacionalidade());
        }
        System.out.println("Barcos:");
        List<BarcoEntity> barcos;
        barcos = BarcoBLL.listar();
        for (BarcoEntity barco : barcos){
            System.out.println("Barco " + barco.getIdBarco());
        }

        List<Login> logins;
        logins = LoginDLL.listar();
        System.out.println("Login:");
        for(Login l : logins){
            System.out.println("Login: " + l.getLogin() + "   " + l.getUser().toString());
        }
    }
}
