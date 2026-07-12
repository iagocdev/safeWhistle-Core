package service;

import model.Denuncia;

import java.util.ArrayList;
import java.util.List;

public class CanalIntegridadeService {
     private List<Denuncia> bancoDenuncias = new ArrayList<>();

     public void registrarDenuncia(Denuncia denuncia){
         bancoDenuncias.add(denuncia);
         System.out.println("Canal SafeWhistle : Protocolo ["+denuncia.getProtocolo()+" registrado com sucesso");

     }

     public void exibirPainelTriagem(){
         if(bancoDenuncias.isEmpty()){
             System.out.println("\n [Painel de Auditoria] Nenhuma denúncia pendente");
             return;
         }
         System.out.println("\n =======================");
         System.out.println("Painel Central de Conformidade");
         System.out.println("\n =======================");

         for(Denuncia d : bancoDenuncias){
             System.out.println(d.gerarRelatorioAuditoria());
             System.out.println("--------------------------");

         }
     }

     public Denuncia buscarProtocolo(String protocoloProcurado){
         for(Denuncia d : bancoDenuncias){
             if(d.getProtocolo().equalsIgnoreCase(protocoloProcurado)){
                 return d;
             }
         }
         throw new IllegalArgumentException("Protocolo nao localizado: "+protocoloProcurado);
     }
}
