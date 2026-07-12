import model.Denuncia;
import model.DenunciaAnonima;
import model.DenunciaIdentificada;
import service.CanalIntegridadeService;

public class Main {
    public static void main(String[] args) {
        CanalIntegridadeService canal = new CanalIntegridadeService();

        System.out.println("Recebendo Relantos no Canal");
        try {
            Denuncia d1 = new Denuncia("Whistle-001","Suspeita de desvio de insumos do almoxarifado peli lider");
            Denuncia d2 = new Denuncia("Whistle-002","Assédio moral recebido pelo lider de TI fulano de Tal");

            canal.registrarDenuncia(d1);
            canal.registrarDenuncia(d2);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO NO CADASTRO " + e.getMessage());

        }

        canal.exibirPainelTriagem();

        System.out.println("Testando Busca e Escudo de Exceção");

        try {
            System.out.println("\n Tentando localizar WHISTLE-001");
            Denuncia escontrada = canal.buscarProtocolo("Whistle-001");
            System.out.println("Localizado com sucesso! Status Atual: "+escontrada.getStatus());
        }catch (IllegalArgumentException e) {
            System.out.println("Auditoria falhou" + e.getMessage());
        }


        try {
            System.out.println("\n Tentando localizar FALSO-999");
            Denuncia encontrada = canal.buscarProtocolo("FALSO-999");
            System.out.println("Isso nao deve ser printado");
        }catch (IllegalArgumentException e) {
            System.out.println("[Escudo Ativado] Bloqueio de fraude operacional " + e.getMessage());
        }


    }
}