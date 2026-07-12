package model;

public class Denuncia {
    private String protocolo;
    private String descricaoFatos;
    private String status; // "Recebida","EM_Analise","Arquivada","Deferida"

    public Denuncia(String protocolo, String descricaoFatos) {
        if(descricaoFatos==null || descricaoFatos.trim().isEmpty()){
            throw new IllegalArgumentException("descricaoFatos nao pode estar em branco");
        }
        this.protocolo = protocolo;
        this.descricaoFatos = descricaoFatos;
        this.status = "RECEBIDA";

    }
    public String gerarRelatorioAuditoria(){
        return "=== Relatorio de triagem ===\n"+
                "Protocolo: " + protocolo + "\n"+
                "Status: " + status + "\n"+
                "Relato: " + descricaoFatos + "\n";
    }

    public String getProtocolo() {return protocolo;}
    public String getDescricaoFatos() {return descricaoFatos;}
    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}
}
