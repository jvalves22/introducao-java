package pilares_poo;

public class SistemaMensagemInstantanea {
    public void enviarMensagem() {
        //verifica se esta conectado a internet

        if (validarConectadoInternet() ) {
            System.out.println("Enviando mensagem");
        } else{
            System.err.println("Computador offline");
        }

        //salva o histórico da mensagem
        salvarHistoricoMensagem();
    }

    public void receberMensagem(){
        System.out.println("Recebendo Mensagem");
    }

    //metodos privados, visivel somente na classe
    private boolean validarConectadoInternet(){
        System.out.println("Validando se está conectado a Internet");
        return true;
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico da mensagem");
    }
}
