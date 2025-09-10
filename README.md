# Desenvolvimento-de-Sistemas-Orientados-Objetos

## Aplicar paradigma de orientação a objetos utilizando uma linguagem de programação representativa do paradigma e recursos disponíveis para ela. 
- Conceitos de classes 
- Objetos 
- Herança 
- Polimorfismo. 
### Apresenta conceitos de análise e projetos orientados a objetos utilizando UML. 
### Desenvolve sistemas com linguagem de programação orientada a objetos.

## Laboratórios: 
### Lab 01:
#### Compilação e Execução de primeiro código
- Abrir um editor de texto: o arquivo deve ter o mesmo nome da classe
- Copiar o código
- Compile: javac Triangulo.java
- Execute: java Triangulo

### Lab 02:
#### Local de Trabalho e Diferenças entre métodos
- Aula para aprender a mexer no software de utilização (escolhido pelo aluno) (No caso: VS Code)
- Diferenciação do código TesteEs e Triangulo na leitura do teclado

### Lab 03:
#### Inicio de Projeto de conta Bancária Simples (Código base fornecido)
1. Criar as seguintes variáveis de instância privadas
- Número da conta
- Nome do correntista
- Saldo
- Limite
2. Criar os getters e setters para as variáveis de instância
- Métodos acessadores (get) e modificadores (set)
3. Criar um método que realiza a impressão de todas as variáveis de instância da classe

### Lab 04:
#### Continuação do Projeto de conta Bancária Simples feito no Lab03 (Código foi duplicado e Lab03 foi comentado para não influênciar nos arquivos do Lab04)
##### Considerando a Classe BankAccount, desenvolvida na aula anterior, implementar:
1. Incluir a variável de instância senha (String, private)
- Esta variável não terá métodos set e get
2. Construtores para a classe
- Forneça 2 construtores para inicialização dos objetos da classe, um sem parâmetros
- Outro com parâmetros (nome do correntista, número da conta e limite)
- O saldo deve ser setado obrigatoriamente como 0.0
- A senha terá valor inicial 0000
3. O método setSaldo não deverá mais existir
4. Desenvolva os métodos withdraw(double value) e deposit(double value)
- O usuário só poderá sacar algum valor se houver saldo
- Ou seu limite cobrir o valor sacado, ficando sua conta negativa
5. Desenvolva um método changePassword(String oldPass, String newPass)
- Permite que o usuário altere a senha, desde que conheça a senha antiga
- Caso a senha antiga esteja incorreta, avisar ao usuário e não realizar a alteração

### Lab 05:
#### Continuação do Projeto de conta Bancária Simples iniciado no Lab03 (Código foi duplicado e Lab04 foi comentado para não influênciar nos arquivos do Lab05)
##### Criar uma Classe Date - deve estar no mesmo diretório da classe bankAccount
1. Inclua as variáveis de instância (int, private) month, day e year para representar uma data
2. O construtor da Classe Date recebe como parâmetros: month, day e year, deve:
- Verificar se o valor de month está no intervalo válido
- Verificar se o valor de dia está no intervalo do mês dado
- Verificar se é ano bissexto
- Caso uma das verificações falhe, deve lançar uma exceção para o método que o chamou 

##### Dentro da Classe BankAccount
3. Inclua a variável de instância openingDate (Date, private)
- Esta variável representa a data de abertura da conta
- Esta variável terá um método get
4. No construtor (com parâmetro) da classe, inclua mais um parâmetro: Date openingDate
- Dentro do bloco construtor, deve-se instanciar a variável de instância openingdate com o parâmetro recebido
- Utilizar a referência this