public class Criaconta {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 300;

        System.out.println("primeira Conta tem " + primeiraConta.saldo);
        System.out.println("segunda Conta tem " + segundaConta.saldo);

        primeiraConta.agencia = 142;
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println(segundaConta.agencia);

        segundaConta.agencia = 142;
        System.out.println("Agora a segunda conta esta na agencia " + segundaConta.agencia);

        if (primeiraConta == segundaConta) {
            System.out.println("são a mesma conta");
        } else {
            System.out.println("conta diferentes");
        }
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
