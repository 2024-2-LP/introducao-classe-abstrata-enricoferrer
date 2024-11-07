package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double somaAreas = 0.0;
        for(int i = 0; i < figuras.size();i++){
            somaAreas += figuras.get(i).calcularArea();
        }
        return somaAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> figurasMaiorQue20 = new ArrayList<>();
        for(int i = 0; i < figuras.size();i++){
            if(figuras.get(i).calcularArea() > 20.0){
                figurasMaiorQue20.add(figuras.get(i));
            }
        }
        return figurasMaiorQue20;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> quadrados = new ArrayList<>();
        for(int i = 0; i < figuras.size();i++){
            if(figuras.get(i) instanceof Quadrado){
                quadrados.add(figuras.get(i));
            }
        }
        return quadrados;
    }
}
