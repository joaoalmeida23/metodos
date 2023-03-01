public class TestaMetodo {
    public static void main(String[] args) {

        Conta contaDoJoão = new Conta();

        contaDoJoão.saldo = 100;

        contaDoJoão.deposita(50);

        System.out.println(contaDoJoão.saldo);

        boolean conseguiuRetirar = contaDoJoão.saca(20);

        System.out.println(contaDoJoão.saldo);

        System.out.println(conseguiuRetirar);
    }
}
