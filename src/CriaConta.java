
public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);

        segundaConta.agencia = 146;
        System.out.println("agora a segunda conta esta" + " na agencia " + segundaConta.agencia);

        //teste se são referências do mesmo objeto
        if(primeiraConta == segundaConta) {
            System.out.println("mesma conta");
        }else{
            System.out.println("contas diferentes");
        }
    }
}
