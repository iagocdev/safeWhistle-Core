#  SafeWhistle-Core

O **SafeWhistle-Core** é um motor de backend desenvolvido em Java focado em governança corporativa, conformidade (*compliance*) e segurança da informação. O sistema simula um canal seguro e resiliente para o recebimento, triagem e auditoria de denúncias anônimas e identificadas, aplicando regras estritas de integridade e proteção de dados em conformidade com as diretrizes da LGPD (Lei Geral de Proteção de Dados).

---

##  Tecnologias e Conceitos Aplicados

Este projeto foi desenvolvido utilizando **Java Standard Edition (Java SE)** com o objetivo de consolidar padrões arquiteturais robustos e boas práticas de Programação Orientada a Objetos (POO):

*   **Encapsulamento & Validação Estrita:** Proteção dos estados dos objetos com barramentos de segurança diretamente nos construtores.
*   **Herança & Polimorfismo:** Especialização de fluxos através de uma classe base (`Denuncia`), permitindo relatórios de triagem customizados para canais anônimos e identificados (`@Override`).
*   **Coleções Dinâmicas (`ArrayList`):** Gerenciamento e centralização dos registros de auditoria em memória.
*   **Tratamento de Exceções Robustas (`Try-Catch` / `throw new`):** Blindagem da aplicação contra falhas operacionais e lançamentos manuais de exceções de negócio (como fraudes de protocolo inexistente).

---

## Estrutura de Pacotes

```text
src/
├── model/
│   ├── Denuncia.java             # Classe base com atributos globais e status
│   ├── DenunciaAnonima.java      # Especialização com garantia de anonimato e não-retaliação
│   └── DenunciaIdentificada.java # Especialização com tratamento de dados sensíveis (LGPD)
├── service/
│   ├── CanalIntegridadeService.java # Gerenciador de auditoria, busca e painel central
│   └── Main.java                 # Simulador e testes de resiliência do ecossistema

Status	                Estágio
🟡 Em Fase Inicial	Core business estruturado em POO, simulador operacional via console concluído com commits semânticos.

Próximos Passos Esperados:

    [ ] Módulo de Segurança Avançada: Integração de criptografia simétrica (AES-256) para mascarar os relatos e dados dos denunciantes na memória.

    [ ] Persistência de Dados: Substituir a lista em memória (ArrayList) por integração com banco de dados relacional utilizando Spring Data JPA ou JDBC.

    [ ] API RESTful: Evoluir o projeto para o ecossistema Spring Boot, expondo endpoints seguros para o envio de denúncias via requisições HTTP.

    [ ] Interface Web: Criação de um front-end responsivo em formato PWA (Progressive Web App) para o portal do denunciante.

Como Executar o Projeto

1 - git clone [https://github.com/seu-usuario/SafeWhistle-Core.git](https://github.com/seu-usuario/SafeWhistle-Core.git)

2 - Abra o projeto na sua IDE de preferência (recomendado: IntelliJ IDEA).

3 - Execute a classe Main.java localizada no pacote service.

4 - Monitore os logs de auditoria e escudos de exceção diretamente no console.

Developed by [Iago Cleber]
