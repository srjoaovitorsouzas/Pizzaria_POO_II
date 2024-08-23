
# Pizzaria_POO_II

Este repositório contém o desenvolvimento de um sistema completo para a gestão de uma pizzaria, abordando desde o atendimento ao cliente até a administração interna e controle de estoque. O projeto é desenvolvido como parte de uma disciplina de Programação Orientada a Objetos (P.O.O) e será realizado ao longo do ano, com a participação dos integrantes João Vitor, Luis Guilhermy e Warley Ostaque.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Descrição do Projeto

O sistema visa cobrir todas as operações de uma pizzaria, incluindo:

- **Gestão de Pedidos:** Permite que clientes façam pedidos, visualizem o status e efetuem o pagamento.
- **Controle de Estoque:** Monitora a quantidade de insumos e emite alertas quando estiverem próximos do limite mínimo.
- **Administração:** Inclui funções para gerenciar finanças, cadastrar funcionários e distribuir cargos, com controle de acesso por meio de login administrativo.
- **Preparação e Entrega:** Cozinheiros podem acessar as receitas e registrar a preparação dos pedidos, enquanto garçons e caixas gerenciam o atendimento ao cliente e a finalização dos pedidos.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Estrutura do Projeto

- **Classes de Modelo (`model`)**: Contém as classes que representam as entidades principais do sistema, como `Administrador`, `Cliente`, `Pedido`, `Receita`, entre outras. Cada classe inclui métodos para acesso e modificação dos dados, bem como representações textuais para facilitar o uso no terminal.
  
- **Classes de Infraestrutura (`infra`)**: Inclui a configuração de conexão com o banco de dados, possibilitando que o sistema se comunique com um banco MySQL, utilizando XAMPP.
  
- **Classes DAO (`dao`)**: Implementa as operações de CRUD (Create, Read, Update, Delete) para cada entidade, permitindo a manipulação dos dados no banco de dados.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Tecnologias Utilizadas

- **Java:** Linguagem de programação principal para o desenvolvimento das funcionalidades do sistema.
- **MySQL:** Banco de dados para armazenamento de informações relacionadas à pizzaria.
- **Maven:** Gerenciamento de dependências e configuração do ambiente de desenvolvimento.
- **XAMPP:** Ferramenta para gerenciar o servidor MySQL.
- **Git/GitHub:** Controle de versão e hospedagem do código fonte.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Instalação

1. Clonar o Repositório:
   bash
   git clone https://github.com/srjoaovitorsouzas/Pizzaria_POO_II.git
   
   
2. Configurar o Banco de Dados:
   - Criar um banco de dados MySQL chamado `pizzaria`.
   - Executar os scripts SQL para criar as tabelas necessárias.

3. Configurar o Projeto:
   - Importar o projeto no IntelliJ IDEA.
   - Configurar o arquivo `pom.xml` para garantir que todas as dependências estejam instaladas.

4. Executar o Projeto:
   - Compilar e rodar o projeto no IntelliJ IDEA.
   - Verificar a conexão com o banco de dados e testar as funcionalidades implementadas.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Contribuidores

- João Vitor
- Luis Guilhermy
- Warley Ostaque
