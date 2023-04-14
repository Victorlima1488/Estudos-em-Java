public class Main {
    public static void main(String[] args){

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendendor(); // UpCast

        Vendendor vendendor = (Vendendor) new Funcionario(); // DownCast (Nâo se deve usar)
    }
}
