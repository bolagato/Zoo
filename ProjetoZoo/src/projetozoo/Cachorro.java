package projetozoo;
public class Cachorro extends Animal{
    
    public void late(){
        System.out.println("AU AU");
    }
    @Override
    public void caminha(){
        System.out.println("O cachorro está caminhando!!");
}
}