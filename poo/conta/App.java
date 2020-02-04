public class App{
    private void run(){
        ContaEspecial conta = new ContaEspecial("001-01", 1000);
        conta.setSaldo(5000);
        conta.sacar(6000);
        System.out.println(conta);
    }
    
    public static void main(String[] args){
        App app = new App();
        app.run();
    }
}