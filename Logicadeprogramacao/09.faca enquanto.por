programa {
  funcao inicio() {
    // declaração das variaveis
real x, y, result
inteiro opcao

//loop faca enquanto
faca
{
   // menu
   escreva("1 - Soma\n")
   escreva("2 - Subtração\n")
   escreva("3 - Multiplicação\n")
   escreva("4 - Divisão\n")
   escreva("S - Sair do programa")
   leia(opcao)
   // verifica se o usuario deseja sair ou não 
   se (opcao >= 1 e opcao <= 4)
  {
    escreva( "informe o valor de x: ")
    leia(x)
    escreva ("informe o valor de y: ")
    leia(y)
  }


  }
}
