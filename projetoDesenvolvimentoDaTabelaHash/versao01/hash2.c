//desenvolvimento 02
/*
    *atividade para a faculdade
    *tabela Hash fixo com Hash de 8
*/

/*
*primeira atualização
    * objetivo: desenvolver o menu com a tela de ajuda--(completo)

*segunda atualização
    *objetivo: desenvolver a opção adicionar e imprimir --(completo)

*/

#include<locale.h>//POSSO COLOCAR ACENTUAÇÃO
#include <stdio.h>
#include <stdlib.h>
#include<ctype.h>
#include<windows.h>//USO DO SLEEP()

struct cadastro
{
    int ValorDaCaixa;

    struct cadastro *prox;
    struct cadastro *ant;
    struct cadastro *baixo;
};
typedef struct cadastro base;

int valorDoHash=6;//variavel que decide o tamanho da tabela hash


//INICIO DO PROGRAMA

//INICIO DO encontrarValor
void encontrarValor(base *inicio)
{
    //recolhe informacoes
    system("cls");
    int valor,ajuda=1;
    printf("informe um valor para procurar na estrutura: ");
    scanf(" %i",&valor);
    system("cls");

    //rodar o programa procurando o valor
    base *auxiliarIndice;
    base *auxiliarEstrutura;

    auxiliarIndice=inicio;
    while(auxiliarIndice->baixo!=NULL)//passa por todos os indices do programa
    {
        auxiliarIndice=auxiliarIndice->baixo;
        auxiliarEstrutura=auxiliarIndice;
        while(auxiliarEstrutura->prox!=NULL)//passa por todos os dados dentro dos indices
        {
            auxiliarEstrutura=auxiliarEstrutura->prox;
            if(valor==auxiliarEstrutura->ValorDaCaixa)//quando encontra o valor
            {
                printf("O valor %i foi encontrado\n\n", valor);
                ajuda=0;
            }
        }

    }
    if(ajuda!=0)//caso nao encontre o valor
    {
        printf("valor nao encontrado\n\n");
    }
    system("pause");
}
//FIM DO encontrarValor

//INICIO DO apagarUmDado
void apagarUmDado(base *inicio)
{
    //recolhe informacoes
    system("cls");
    int valor,ajuda=1;
    printf("informe um valor para apagar da estrutura: ");
    scanf(" %i",&valor);
    system("cls");

    //rodar o programa procurando o valor
    base *auxiliarIndice;
    base *auxiliarEstrutura;

    base *valorParaApagar;
    base *proximo;
    base *anterior;

    auxiliarIndice=inicio;
    while(auxiliarIndice->baixo!=NULL)//passa por todos os indices do programa
    {
        auxiliarIndice=auxiliarIndice->baixo;
        auxiliarEstrutura=auxiliarIndice;
        while(auxiliarEstrutura->prox!=NULL)//passa por todos os dados dentro dos indices
        {
            auxiliarEstrutura=auxiliarEstrutura->prox;
            if(valor==auxiliarEstrutura->ValorDaCaixa)//quando encontra o valor
            {
                ajuda=0;

                valorParaApagar=auxiliarEstrutura;//marca o valor para ser apagado
            }
        }

    }
    if(ajuda!=0)//caso nao encotre o valor na estrutura
    {
        printf("valor nao encontrado\n\n");
    }
    else//caso encontre o valor
    {
        if(valorParaApagar->prox==NULL)//caso o proximo valor do valor a ser apagado nao exista
        {
            anterior=valorParaApagar->ant;
            anterior->prox=NULL;

            valorParaApagar->prox=NULL;
            valorParaApagar->ant=NULL;
            valorParaApagar->baixo=NULL;
            valorParaApagar->ValorDaCaixa=NULL;

        }
        else//caso o proximo valor do valor a ser apagado exista
        {
            proximo=valorParaApagar->prox;
            anterior=valorParaApagar->ant;
            proximo->ant=anterior;
            anterior->prox=proximo;

            valorParaApagar->prox=NULL;
            valorParaApagar->ant=NULL;
            valorParaApagar->baixo=NULL;
            valorParaApagar->ValorDaCaixa=NULL;
        }
        //free(valorParaApagar);
    }
    system("pause");
}
//FIM DO apagarUmDado

//INICIO DO verAsInformacoesSalvas
void verAsInformacoesSalvas(base *inicio)
{
    int ajuda=1;
    system("cls");
    base *auxiliarIndice;
    base *auxiliarEstrutura;

    auxiliarIndice=inicio;
    while(auxiliarIndice->baixo!=NULL)//passa por todos os indices do programa
    {
        auxiliarIndice=auxiliarIndice->baixo;
        auxiliarEstrutura=auxiliarIndice;
        while(auxiliarEstrutura->prox!=NULL)//passa por todos os dados dentro dos indices
        {
            ajuda=0;
            auxiliarEstrutura=auxiliarEstrutura->prox;
            printf("%i\n" ,auxiliarEstrutura->ValorDaCaixa);//mostra os valores na tela
        }

    }
    if(ajuda!=0)//quando nao tem nenhum valor adicionado
    {
        printf("erro nada adicionado\n\n");
    }
    system("pause");
}
//FIM DO verAsInformacoesSalvas

//INICIO DO inserirUmDado
void inserirUmDado(base *inicio)
{
    //pede e salva informações ao usuario
    int entrar=1;
    system("cls");
    int valorInformado=0;
    printf("Informe um valor para adicionar na estrutura: ");
    scanf(" %i",&valorInformado);


    //ver se o numero informado ja existe
    base *auxiliarIndice;
    base *auxiliarEstrutura;

    auxiliarIndice=inicio;
    while(auxiliarIndice->baixo!=NULL)//passa por todos os indices do programa
    {
        auxiliarIndice=auxiliarIndice->baixo;
        auxiliarEstrutura=auxiliarIndice;
        while(auxiliarEstrutura->prox!=NULL)//passa por todos os dados dentro dos indices
        {
            auxiliarEstrutura=auxiliarEstrutura->prox;
            if(valorInformado==auxiliarEstrutura->ValorDaCaixa)//quando encontra o valor
            {
                entrar=0;
            }
        }

    }

    if(entrar==0)//caso ja exista o valor(nao pode ser adicionado)
    {
        printf("erro valor ja existente\n\n");
        system("pause");
    }
    else//caso o valor nao exista (pode ser adicionado )
    {
        int indice = valorInformado % valorDoHash;

        base *novo=(base*) malloc(sizeof(base));
        novo->ant=NULL;
        novo->prox=NULL;
        novo->ValorDaCaixa=valorInformado;
        novo->baixo=NULL;

        //colocar o valor do usuario na estrutura

        base *auxiliar;
        base *estruturaEncontrada;
        auxiliar=inicio;
        while(auxiliar->baixo!=NULL)
        {
            auxiliar=auxiliar->baixo;

            if(auxiliar->ValorDaCaixa==indice)
            {
                estruturaEncontrada=auxiliar;
            }

        }

        auxiliar=estruturaEncontrada;

        if(auxiliar->prox==NULL)
        {
            auxiliar->prox=novo;
            novo->ant=inicio;
        }
        else
        {
            while(auxiliar->prox!=NULL)
            {
                auxiliar=auxiliar->prox;
            }
            auxiliar->prox=novo;
            novo->ant=auxiliar;
        }
    }
}
//FIM DO inserirUmDado

//INICIO DO VOID HELP
void help()
{
    /*
        *FALA PARA O USUARIO DE FORMA RAPIDA SOBRE AS FUNCIONALIDADES DO PROGRAMA
    */

    printf("\tTela de ajuda");
    printf("\n\ninserir um dado-informando um valor ao programa voce salva este valor na lista\n\nver as informacoes salvas-o programa mostra para voce todos os valores adicionados\n");
    printf("\nPara apagar um dado-informando um valor ele procura na lista e caso o valor exista ele apaga este valor\n\nencontrar um valor ja adicionado-ao informar um valor o programa procura nos valores salvos e caso o valor exista ele informa o valor\n\nfechar o programa-finaliza o programa sem salvar os dados\n\n");
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
    printf("Digite 0-para abrir a ajuda\nDigite 1-Para inserir um dado\nDigite 2-Para ver as informacoes salvas\nDigite 3-Para apagar um dado\nDigite 4-Para encontrar um valor ja adicionado na estrutura\nDigite 5-Para fechar o programa\nDigite: ");
    int respostaDoUsuario;
    scanf( "%i",&respostaDoUsuario);
    return respostaDoUsuario;
}
//FIM DO VOID escolhaDoMenu()


//CRIAÇÃO DO VOID MENU
void menu(base *inicio)
{
    /*
        *RECORRE AO escolhaDoMenu();

    */

    system("cls");
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

            inserirUmDado(inicio);
            break;
        }
    case 2:
        {
            verAsInformacoesSalvas(inicio);
            break;
        }
    case 3:
        {
            apagarUmDado(inicio);
            break;
        }
    case 4:
        {
            encontrarValor(inicio);
            break;
        }
    case 5:
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

//INICIO DO VOID CRIACAODOHASH

//FIM DO CRIACAODOHASH
void criacaoDoHash(base *inicio)
{
    int ajuda=0,ohash=0;
    base *aux;

    while(ajuda==0)//estrutura para repetir ate o usuario digitar um valor valido
    {
        system("cls");
        ajuda=1;
        printf("Informe um valor para o hash da tabela: ");//pede um valor ao usuario
        scanf(" %i",&ohash);

        if(ohash<0)//o valor nao pode ser negativo
        {
            printf("Erro o valor nao pode ser negativo\n\n");
            system("pause");
            ajuda=0;
        }
        else if(ohash>=0 && ohash<=2)//o valor precisa ser no minimo maior que 3
        {
            printf("Erro o hash precisa de um valor maior\n\n");
            system("pause");
            ajuda=0;
        }

    }
    valorDoHash=ohash;//colocando o hash valido em uso

    for(int i =0;i<valorDoHash;i++)//cria a estrutura de indices
    {
        aux=inicio;
        while(aux->baixo!=NULL)//encontra o ultimo indice
        {
            aux=aux->baixo;
        }

        base *hashNovo=(base*) malloc(sizeof(base));//cria a "caixa" indice
        hashNovo->ValorDaCaixa=i;
        hashNovo->ant=NULL;
        hashNovo->prox=NULL;
        hashNovo->baixo=NULL;
        aux->baixo=hashNovo;
    }
    printf("hash de tamanho %i\n\n",valorDoHash);//informa ao usuario o valor do indice
    system("pause");
    system("cls");
}
//CRIAÇÃO DO VOID MAIN
void main()
{
	char controle='s';//VARIAVEL UTILIZADA NO WHILE PARA VER SE O USUARIO QUER CONTINUAR NO PROGRAMA

	base *inicio=(base*) malloc(sizeof(base));//CRIANDO A "CAIXA" RAIZ PARA INICIAR A SEQUENCIA DE APONTAENTOS
    inicio->ant=NULL;
    inicio->prox=NULL;
    inicio->ValorDaCaixa=NULL;
    inicio->baixo=NULL;

    criacaoDoHash(inicio);//cria a tabela hash

    while(tolower(controle)=='s')//CONTROLE == S USUARIO PERMANECE NO PROGRAMA
    {
        menu(inicio);
        system("cls");
    }
}//FIM DO VOID MAIN
//FIM DO PROGRAMA
