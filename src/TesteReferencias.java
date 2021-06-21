public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); //não é um objeto, é uma referência
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta; //duas referências para o mesmo objeto

        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);
        System.out.println("saldo da primeira conta: " + primeiraConta.saldo);
        //ambas ficarão 400 porque as duas referências dizem respeito ao mesmo objeto

        //teste se são referências do mesmo objeto
        if(primeiraConta == segundaConta){
            System.out.println("sao a mesmissima conta");
        }
    }
}
