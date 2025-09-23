programa {
  funcao inicio() {
    // declração de variáveis
    cadeia nome
    inteiro idade

    // entrada de dados
    escreva("Informe seu nome: ")
    leia(nome)
    escreva("Informe sua idade: ")
    leia(idade)

    // estrutura de decisão
    se (idade >= 18)
    {
      escreva(nome, " é maior de idade.")
    }
    senao
    {
      escreva(nome, " é menor de idade.")
    }
  }
}
