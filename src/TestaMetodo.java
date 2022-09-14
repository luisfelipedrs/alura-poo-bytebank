public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPipe = new Conta();
        contaDoPipe.saldo = 100;
        contaDoPipe.deposita(50);
        System.out.println(contaDoPipe.saldo);

        boolean conseguiuRetirar = contaDoPipe.saca(20);
        System.out.println(contaDoPipe.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPipe);

        if(sucessoTransferencia) {
            System.out.println("transferencia realizada com sucesso");
        }
        else {
            System.out.println("saldo insuficiente");
        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPipe.saldo);

    }
}
