package model;

public class DenunciaAnonima extends Denuncia {
    public DenunciaAnonima(String protocolo, String descricaoFatos) {
        super(protocolo,descricaoFatos);
    }

    @Override
    public String gerarRelatorioAuditoria(){
        return "=== Relatorio de triagem (Canal Anônimo) ===\n"+
                "Protocolo: "+getProtocolo() + "\n"+
                "Status: "+getStatus() + "\n"+
                "Relato: "+getDescricaoFatos() + "\n"+
                "Identidade do denunciante : Preservada(não retaliação)";
    }
}
