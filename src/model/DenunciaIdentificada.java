package model;

public class DenunciaIdentificada extends Denuncia {
    private String nomeDenunciante;
    private String cpfDenunciante;

    public DenunciaIdentificada(String protocolo, String descricaoFatos,String nomeDenunciante, String cpfDenunciante) {
        super(protocolo,descricaoFatos);

        if (nomeDenunciante == null || nomeDenunciante.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome em denuncia identificada é obrigatorio!");
        }
        this.nomeDenunciante = nomeDenunciante;
        this.cpfDenunciante = cpfDenunciante;
    }
    @Override
    public String gerarRelatorioAuditoria(){
        return "==== Relatório de triagem (Canal Identificado) === \n"+
                "Protocolo: "+getProtocolo()+"\n"+
                "Status: "+getStatus()+"\n"+
                "Protocolo: "+getDescricaoFatos()+"\n"+
                "Denunciante:  "+nomeDenunciante + "| CPF: "+cpfDenunciante;
    }
    public String getNomeDenunciante() {return nomeDenunciante;}
    public String getCpfDenunciante() {return cpfDenunciante;}
}
