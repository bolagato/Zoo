package projetozoo;

public class ProjetoZoo {
    public static void main(String[] args) {
       Cachorro dog = new Cachorro();
       Gato tito = new Gato();
       
       dog.late();
       tito.mia(); 
       
       dog.caminha();
       tito.caminha();
    }
    
}
