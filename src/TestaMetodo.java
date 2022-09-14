public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPipe = new Conta();
        contaDoPipe.saldo = 100;
        contaDoPipe.deposita(50);
        System.out.println(contaDoPipe.saldo);
        boolean conseguiuRetirar = contaDoPipe.saca(20);
        System.out.println(contaDoPipe.saldo);
        System.out.println(conseguiuRetirar);
    }
}
