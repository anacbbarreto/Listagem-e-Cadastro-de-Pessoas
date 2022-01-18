# Listagem-e-Cadastro-de-Pessoas



Projeto do curso de analise e desenvolvilemto de sistemas: listagem e cadastro de pessoas usando as tecnologias Spring MVC, Thymeleaf, H2 e Bean Validation.

Funcionalidades do sistema: 
• Listagem das pessoas 
• Inclusão de uma nova pessoa 
• As informações cadastradas devem ficar em memória.
• A integração com banco de dados H2

Cada pessoa deve ter as seguintes informações: 
• Nome completo
• E-mail válido
• Data de nascimento
 
Requisitos adicionais 
• Ao incluir uma pessoa, todos os campos devem ser preenchidos com valores válidos. O sistema deve apresentar erro caso fique algum campo em branco ou com formato ou valor inválido 
• Caso ocorra erro de validação em um campo, todos os demais dados preenchidos corretamente devem ser reapresentados preenchidos na tela. 
• A validação deve ser feita do lado da aplicação rodando no servidor.
• As informações salvas durante o uso da aplicação devem ser mantidas em memória da aplicação. 
• O banco de dados deve-se ser chamado de "pessoabd". 
• Criar Controllers Spring MVC com validação
• Alterar os protótipos das telas para transformá-las em templates do Thymeleaf 
