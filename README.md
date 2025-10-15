# MintAether - E-Commerce de NFT com Geração por IA

## 1. Sobre o Projeto

O **MintAether** é uma plataforma inovadora de e-commerce projetada para democratizar a criação e a comercialização de arte digital. O projeto tem como núcleo uma poderosa ferramenta de Inteligência Artificial que permite aos usuários gerar obras de arte únicas (NFTs) a partir de simples descrições em texto (prompts).

A plataforma oferecerá um ciclo completo para o artista digital:

* **Criação:** Uma interface intuitiva onde qualquer pessoa, independentemente de sua habilidade técnica, pode descrever uma ideia e ver a IA transformá-la em uma imagem digital.
* **Tokenização (Minting):** A capacidade de transformar a arte gerada em um Token Não Fungível (NFT) em uma blockchain, garantindo autenticidade e propriedade.
* **Comercialização:** Um marketplace integrado onde os criadores podem listar seus NFTs para venda e colecionadores podem adquirir obras únicas.

O objetivo é criar um ecossistema vibrante para a nova geração de arte digital, combinando a criatividade humana com o poder computacional da IA.

## 2. Tecnologias Utilizadas

A arquitetura do projeto foi desenhada utilizando um stack de tecnologias modernas, robustas e escaláveis, separando claramente as responsabilidades entre o backend, o frontend e a infraestrutura.

| Categoria         | Tecnologia                                        |
| ----------------- | ------------------------------------------------- |
| **Backend** | Java 21, Spring Boot, Spring Data JPA, Spring Security |
| **Banco de Dados**| PostgreSQL                                        |
| **Versionamento BD**| Flyway                                            |
| **Infraestrutura**| Docker, Docker Compose                            |
| **Frontend (Planejado)** | React, JavaScript/TypeScript, HTML5, CSS3          |
| **Blockchain (Planejado)**| Solidity (para Smart Contracts), Web3j/Ethers.js |
| **Geração de Arte**| Integração com APIs de IA (ex: OpenAI DALL-E)   |

## 3. Status Atual do Projeto

O projeto está em desenvolvimento ativo e organizado em fases.

- [x] **Fase 1: Banco de Dados** - Schema completo, incluindo tabelas de usuários, nfts, coleções e transações, com versionamento via Flyway.
- [ ] **Fase 2: Backend (API)** - Desenvolvimento das entidades, repositórios e endpoints REST.
- [ ] **Fase 3: Frontend** - Construção da interface de usuário com React.
- [ ] **Fase 4: Integração com IA** - Conexão com API para geração de imagens.
- [ ] **Fase 5: Integração com Blockchain** - Implementação de smart contracts e minting.

## 4. Arquitetura do Projeto

A arquitetura planejada segue o modelo de microsserviços/serviços desacoplados, garantindo escalabilidade e manutenibilidade.

```
+----------------+      +------------------+      +------------------------+
|                |      |                  |      |                        |
|   Frontend     |----->|    API Gateway   |----->|   Backend Principal    |
|    (React)     |      |  (Spring Cloud)  |      |  (Spring Boot/Java)    |
|                |      |                  |      |                        |
+----------------+      +--------+---------+      +-----------+------------+
                                 |                            |
                                 |                            |
          +----------------------+----------------------+-----+
          |                      |                      |
+---------v---------+  +---------v---------+  +---------v-----------+
|                   |  |                   |  |                     |
|   Serviço de IA   |  |   Banco de Dados  |  |  Serviço Blockchain |
| (API Externa)     |  |   (PostgreSQL)    |  |  (Nó/Smart Contract)|
|                   |  |                   |  |                     |
+-------------------+  +-------------------+  +---------------------+
```

* **Frontend:** Uma Single-Page Application (SPA) construída em React que consome os dados do backend.
* **Backend Principal:** Uma API RESTful construída com Spring Boot, responsável por toda a lógica de negócio (gerenciamento de usuários, NFTs, transações).
* **Banco de Dados:** PostgreSQL, rodando em um container Docker, com seu schema gerenciado pelo Flyway.
* **Serviços Externos:** A arquitetura prevê a integração com serviços externos para geração de arte (IA) e para interação com a blockchain.

## 5. Requisitos Técnicos

Para configurar e executar este projeto em um ambiente de desenvolvimento, você precisará ter as seguintes ferramentas instaladas:

* **Java Development Kit (JDK) 21**
* **Docker e Docker Compose**
* **Git** para controle de versão
* Uma IDE de sua preferência (recomendado: Visual Studio Code com o "Extension Pack for Java" ou IntelliJ IDEA).
* Um cliente de banco de dados (recomendado: DBeaver).

## 6. Como Executar

Siga os passos abaixo para iniciar o ambiente de desenvolvimento local.

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/MarcioBezerra-des/MintAether.git](https://github.com/MarcioBezerra-des/MintAether.git)
    cd MintAether
    ```

2.  **Inicie o banco de dados com Docker:**
    Este comando irá baixar a imagem do PostgreSQL e iniciar o container em segundo plano.
    ```bash
    docker compose up -d
    ```

3.  **Execute a aplicação Spring Boot:**
    A aplicação pode ser iniciada diretamente pela sua IDE ou através do terminal.

    * **Via IDE:** Abra o projeto e localize a classe principal `MintAetherApplication.java`. Execute-a.
    * **Via Terminal (usando o Maven Wrapper):**
        ```bash
        ./mvnw spring-boot:run
        ```

4.  **Verificação:**
    Após a inicialização, o backend estará rodando na porta `8080`. O Flyway terá executado as migrações automaticamente, criando e populando as tabelas no banco de dados.

## 7. Conclusão

O MintAether representa um passo ambicioso na intersecção entre arte, tecnologia e finanças descentralizadas. Com uma base técnica sólida e uma visão clara, o projeto está bem posicionado para se tornar uma plataforma de referência para a criação e negociação de arte gerada por IA. Os próximos passos focarão na construção da API backend e na prototipação da interface do usuário.
