#language: pt
Funcionalidade: Cadastro de contas

Como um usuário 
Gostaria de cadastrar contas
Para que eu possa distribuir meu dinheiro de uma forma mais organizada

@ignore
Cenário: Deve inserir uma conta com sucesso

Dado que estou acessando a aplicação
Quando informo o usuário "brunakvasconcelos@gmail.com"
E a senha "221204"
E seleciono entrar
Então visualizo a página inicial
Quando seleciono Contas
E seleciono Adicionar
E informo a conta "Conta de Teste3"
E seleciono Salvar
Então a conta é inserida com sucesso


Cenário: Não deve inserir uma conta sem nome

Dado que estou acessando a aplicação
Quando informo o usuário "brunakvasconcelos@gmail.com"
E a senha "221204"
E seleciono entrar
Então visualizo a página inicial
Quando seleciono Contas
E seleciono Adicionar
E seleciono Salvar
Então sou notificado que o nome da conta é obrigatório

