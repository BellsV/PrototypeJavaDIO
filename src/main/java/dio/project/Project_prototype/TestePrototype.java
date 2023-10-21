package dio.project.Project_prototype;

import dio.project.Project_prototype.Retangulo;
import dio.project.Project_prototype.Circulo;
import dio.project.Project_prototype.Formas;

import java.util.List;
import java.util.ArrayList;

public class TestePrototype {
    public static void main (String[] args){
        List<Formas> formas = new ArrayList<>();
        List<Formas> formasCopia = new ArrayList<>();

        Circulo circulo = new Circulo();
        circulo.x = 15;
        circulo.y = 30;
        circulo.radio =20;
        circulo.color = "yellow";

        Circulo outroCirculo = (Circulo) circulo.clone();
        formas.add((outroCirculo));

        Retangulo retangulo = new Retangulo();
        retangulo.largura = 10;
        retangulo.altura = 20;
        retangulo.color = "purple";
        formas.add(retangulo);

        cloneAndCompare(formas, formasCopia);

    }
    private static void cloneAndCompare (List<Formas> formas, List<Formas> formasCopia){
        for(Formas forma : formas){
            formasCopia.add(forma.clone());
        }
        for (int i = 0; i < formas.size(); i++){
            if (formas.get(i) != formasCopia.get(i)){
                System.out.println(i + " : As formas são de objetos diferentes");
              if (formas.get(i).equals(formasCopia.get(i))){
                System.out.println(i + " : E eles são objetos identicos");
            }else{
                System.out.println(i + " : Mas eles não são identicos");
            }
            }else {
                System.out.println(i + ": A forma dos objetos é igual");
            }
        }
    }
}
