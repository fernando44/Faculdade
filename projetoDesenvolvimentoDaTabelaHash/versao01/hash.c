//desenvolvimento 01
/*
    *atividade para a faculdade
    *tabela Hash fixo com Hash de 8
*/

/*
*primeira atualização
    * objetivo: desenvolver o menu com a tela de ajuda--(completo)

*/

#include<locale.h>//POSSO COLOCAR ACENTUAÇÃO
#include <stdio.h>
#include <stdlib.h>
#include<ctype.h>
#include<windows.h>//USO DO SLEEP()

struct cadastro
{
    int ValorDaCaixa;//armazena a informação

    struct cadastro *prox;//ligação proxima
    struct cadastro *ant;//ligação anterior
};
typedef struct cadastro base;

//INICIO DO PROGRAMA

//INICIO DO apagarUmDado
void apagarUmDado()
{

}
//FIM DO apagarUmDado

//INICIO DO verAsInformacoesSalvas
void verAsInformacoesSalvas()
{

}
//FIM DO verAsInformacoesSalvas

//INICIO DO inserirUmDado
void inserirUmDado()
{

}
//FIM DO inserirUmDado

//INICIO DO VOID HELP
void help()
{
    /*
        *FALA PARA O USUARIO DE FORMA RAPIDA SOBRE AS FUNCIONALIDADES DO PROGRAMA
    */

    printf("\tTela de ajuda");
    printf("\n\ninserir um dado-informando um valor ao programa voce salva este valor na lista\n\nver as informações salvas-o programa mostra para voce todos os valores adicionados\n");
    printf("\nPara apagar um dado-informando um valor ele procura na lista e caso o valor exista ele apaga este valor\n\nfechar o programa-finaliza o programa sem salvar os dados\n\n");
    system("pause");
}
//FIM DO VOID HELP

//INICIO DO VOID escolhaDoMenu()
int escolhaDoMenu()
{
    /*
        *FALA AS OPÇÕES AO USUARIO
        *SALVA A OÇÃO DO USUARIO COMO NUMERO INTEIRO
    */

    printf("\tTabela Hash\n\n");
    printf("Digite 0-para abrir a ajuda\nDigite 1-Para inserir um dado\nDigite 2-Para ver as informações salvas\nDigite 3-Para apagar um dado\nDigite 4-Para fechar o programa\nDigite: ");
    int respostaDoUsuario;
    scanf( "%i",&respostaDoUsuario);
    return respostaDoUsuario;
}
//FIM DO VOID escolhaDoMenu()


//CRIAÇÃO DO VOID MENU
void menu()
{
    /*
        *RECORRE AO escolhaDoMenu();

    */

    int escolhaDoUsuario=escolhaDoMenu();
    system("cls");
    switch(escolhaDoUsuario)
    {
    case 0:
        {
            help();
            break;
        }
    case 1:
        {
            inserirUmDado();
            break;
        }
    case 2:
        {
            verAsInformacoesSalvas();
            break;
        }
    case 3:
        {
            apagarUmDado();
            break;
        }
    case 4:
        {
            exit(0);
        }
    default:
        {
            printf("Erro valor informado invalido\n\n");
            system("pause");
            break;
        }
    }
}
//FIM DO VOID MENU

//CRIAÇÃO DO VOID MAIN
void main()
{
	char controle='s';//VARIAVEL UTILIZADA NO WHILE PARA VER SE O USUARIO QUER CONTINUAR NO PROGRAMA

	base *Raiz=(base*) malloc(sizeof(base));//CRIANDO A "CAIXA" RAIZ PARA INICIAR A SEQUENCIA DE APONTAENTOS
    Raiz->ant=NULL;
    Raiz->prox=NULL;
    Raiz->ValorDaCaixa=NULL;

    while(tolower(controle)=='s')//CONTROLE == S USUARIO PERMANECE NO PROGRAMA
    {
        menu(Raiz);
        system("cls");
    }
}//FIM DO VOID MAIN
//FIM DO PROGRAMA
