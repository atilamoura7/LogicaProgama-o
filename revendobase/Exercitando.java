package revendobase;

import java.util.Calendar;
import java.util.Scanner;

public class Exercitando 
{
    Scanner read = new Scanner(System.in);
    public void calcIdade()
    {
        System.out.print("Infome o ano do seu nascimento: ");
        int anoNasc = read.nextInt();
        System.out.print("Infome o ano atual: ");
        int anoAtual = read.nextInt();
        int idade = anoAtual - anoNasc;
        System.out.print("Sua idade é: "+ idade);
        //condicional composta
        if(idade>=18)
        {
            System.out.println(", Você é maior de idade!");
        }
        else 
        {
            System.out.println(", Você ainda é menor de idade!");
        }
    }
    
    public void convertReal()
    {
        System.out.print("Infome o total de reais que você quer converter: R$");
        double reais = read.nextDouble();
        double dolar = reais/4.89;
        System.out.format("Resultado da conversão: USD %.2f", dolar);
    }
    
    public void convertTemperatura()
    {
        System.out.print("Informe a temperatura em F°: ");
        double f = read.nextDouble();
        double c = (f-32)/1.8;
        System.out.println("A temperatura após a conversão é: "+c +"C°");
    }
    
    public void porcentagemProduto()
    {
        System.out.println("Informe o valor do produto: USD");
        double dolar = read.nextDouble();
        double pct = dolar * 60 / 100;
        System.out.println("porcentagem do produto: USD"+pct);
    }
    
    public void condicionalSimples()
    {
        System.out.print("Posso contar até 10?");
        String resp = read.nextLine();
        if(resp.toUpperCase().equals("SIM"))
        {
            System.out.println("Abrindo Contagem...");
            for(int i = 0; i<10; i++)
            {
                System.out.println("Número:"+(i+1));
            }
            System.out.println("Encerrando contagem...");
        }
    }
    
    public void calcImc()
    {
        System.out.print("Digite seu peso KG: ");
        double peso = read.nextDouble();
        System.out.print("Digite sua Altura M: ");
        double alt = read.nextDouble();
        System.out.println("Calculando IMC");
        double imc = peso/ (alt*alt);
        System.out.format("IMC: %.2f", imc);
        if(imc<17)
        {
            System.out.println("Classificação: Muito abaixo do peso");
        } else if((imc>=17)&&(imc<18.5))
        {
            System.out.println("Classificação: Abaixo do peso");
        }
        else if((imc>=18.5)&&(imc<25))
        {
            System.out.println("Classificação: Peso Normal");
        }
        else if((imc>=25)&&(imc<30))
        {
            System.out.println("Classificação: Sobrepeso");
        }
        else if((imc>=30)&&(imc<35))
        {
            System.out.println("Classificação: Obsidade");
        }
        else if((imc>=35)&&(imc<40))
        {
            System.out.println("Classificação: Obsidade severa");
        }
        else
        {
            System.out.println("Classificação: Obsidade morbida");
        }
    }
    public void depTransito()
    {
        System.out.println("--------------------------");
        System.out.println("-DEPARTAMENTO DE TRANSITO-");
        System.out.println("--------------------------");
        System.out.print("Informe seu ano de nascimento: ");
        int anoNasc = read.nextInt();
        System.out.print("Informe o ano atual: ");
        int anoAtual = read.nextInt();
        int idade = anoAtual - anoNasc;
        if(idade>=18)
        {
            System.out.println("--------------------------");
            System.out.println("-------- AVALIAÇÃO -------");
            System.out.println("--------------------------");
            System.out.println("Resultado: APTO A TIRAR A HABILITAÇÃO");
        }
        else
        {
            System.out.println("--------------------------");
            System.out.println("-------- AVALIAÇÃO -------");
            System.out.println("--------------------------");
            System.out.println("Resultado: INAPTO A TIRAR A HABILITAÇÃO");
        }
    }
    public void mediaAluno()
    {
        System.out.println("--------------------------");
        System.out.println("-----_NEW ORLEANS_--------");
        System.out.println("--------------------------");
        System.out.print("Primeira nota: ");
        double n1  = read.nextDouble();
        System.out.print("Segunda nota: ");
        double n2  = read.nextDouble();
        double media = (n1+n2)/2;
        System.out.format("Média: %.2f",media);
        System.out.println("\n--------------------------");
        System.out.println("-------- RESULTADO --------");
        System.out.println("--------------------------");
        if(media>=7)
        {
            System.out.println("Situação: Aprovado");
        }
        else if((media>=5)&&(media<7))
        {
            System.out.println("Situação: Recuperação");
        }
        else 
        {
            System.out.println("Situação: Reprovado");
        }
    }
    public void escolhaCaso()
    {
        System.out.println("-----------------------");
        System.out.println("---Criança Esperança---");
        System.out.println("-----------------------");
        System.out.println("Muito Obrigado por doar");
        System.out.println("[1] para doar R$10");
        System.out.println("[2] para doar R$25");
        System.out.println("[3] para doar R$50");
        System.out.println("[4] para outro valor");
        System.out.println("[5] para cancelar");
        System.out.print("Opção: ");
        int opcao = read.nextInt();
        System.out.println("");
        System.out.println("-----------------------");
        
        double valor = 0;
        switch(opcao)
        {
            case 1:
                valor = 10;
                break;
            case 2:
                valor = 25;
                break;
            case 3:
                valor = 50;
                break;
            case 4:
                System.out.print("Informe o valor que deseja doar: R$");
                valor = read.nextDouble();
                break;
            case 5:
                valor = 0;
                break;
            default:
                System.out.println("Opção inválida");
                escolhaCaso();
                break;
        }
        System.out.println("-----------------------");
        System.out.println("Opção escolhida: "+opcao);
        if(opcao==5)
        {
            System.out.println("Operação cancelada por usuário...");
            System.out.println("MUITO OBRIGADO!");
            System.out.println("-----------------------");
        }
        else if (opcao!=5)
        {
            System.out.println("Sua doação foi de: R$"+valor);
            System.out.println("MUITO OBRIGADO!");
            System.out.println("-----------------------");
        }
        
        
        
    }
    public void dependentesFunc()
    {
        System.out.println("------------------------");
        System.out.println("FUNCIONÁRIO");
        System.out.print("Nome: ");
        String nome = read.nextLine();
        System.out.print("Salário: R$");
        double sal = read.nextDouble();
        System.out.print("Total de Dependentes: ");
        int dep = read.nextInt();
        System.out.println("------------------------");
        double nSal;
        switch(dep)
        {
            case 0:
                nSal = sal + ((sal*5)/100);
                break;
            case 1,2,3:
                nSal = sal + ((sal*10)/100);
                break;
            case 4,5,6:
                nSal = sal + ((sal*15)/100);
                break;
            default:
                nSal = sal + ((sal*18)/100);
                break;
        }
        System.out.println("------------------------");
        System.out.println("Funcionário : "+nome);
        System.out.format("Novo salário: R$%.2f", nSal);
        System.out.println("\n------------------------");
    }
     public void aproveitamentoAluno()
    {
        System.out.println("--------------------------");
        System.out.println("-----_NEW ORLEANS_--------");
        System.out.println("--------------------------");
        System.out.print("Primeira nota: ");
        double n1  = read.nextDouble();
        System.out.print("Segunda nota: ");
        double n2  = read.nextDouble();
        double media = (n1+n2)/2;
        System.out.format("Média: %.2f",media);
        System.out.println("\n-------------------------");
        System.out.println("-------- RESULTADO --------");
        System.out.println("---------------------------");
        System.out.println("Média: "+media);
        if((media<10)&&(media>=9))
        {
            System.out.println("Classificação: A");
        }
        else 
        {
            if((media<9)&&(media>=8))
            {
                System.out.println("Classificação: B");
            }
            else
            {
                if((media<8)&&(media>=7))
                {
                    System.out.println("Classificação: C");
                }
                else 
                {
                    if((media<7)&&(media>=6))
                    {
                        System.out.println("Classificação: D");
                    }
                    else
                    {
                        if((media<6)&&(media>=5))
                        {
                            System.out.println("Classificação: E");
                        }
                        else
                        {
                            System.out.println("Classificação: F");
                        }
                    }
                }
            }
        }
        System.out.println("--------------------------");
    }
    public void partidaFutebol()
    {
        System.out.println("--------------------------");
        System.out.println("     Bangu x Madureira    ");
         System.out.println("--------------------------");
        System.out.print("Total de Gols Bangu: ");
        int golB = read.nextInt();
        System.out.print("Total de Gols Madureira: ");
        int golM = read.nextInt();
        int dif;
        String resultado;
        String ganhador;
        if(golB>golM)
        {
            dif = golB - golM;
            ganhador = "Bangu";
        }
        else
        {
            dif = golM - golB;
            ganhador = "Madureira";
        }
        switch(dif)
        {
            case 0:
               resultado = "Empate";
               ganhador = "Bangu";
               break;
            case 1,2,3:
                resultado = "Normal";
                break;
            case 4,5,6:
                resultado = "Goleada";
                break;
            default:
                resultado = "Partida incomum";
                break;
        }
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("-------Resultado---------");
        System.out.println("Diferença: "+dif);
        System.out.println("Status: "+resultado);
        if(!resultado.toUpperCase().equals("EMPATE"))
        {
            System.out.println("Ganhador: "+ganhador);
        }
    }
    public void contadorInteligente()
    {
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("      CONTADOR      ");
        System.out.println("Número inicial: ");
        int ini = read.nextInt();
        System.out.println("Número final: ");
        int fim = read.nextInt();
        System.out.println("CONTANDO...");
        if(ini>fim)
        {
            int cont = ini;
            while(cont>=fim)
            {
                System.out.print(cont+"..");
                cont--;
            }
        }
        else 
        {
            int cont =  ini;
            while(cont<=fim)
            {
               System.out.print(cont+"..");
               cont++;
            }
        }
        System.out.println("\n--------------------");
        System.out.println("--------------------");
    }
    
    public void melhorAluno()
    {
        String nome, melhorNome = "";
        Double nota; 
        double melhorNota = 0;
        System.out.println("------------------------");
        System.out.println("AVALIANDO ALUNOS");
        System.out.println("------------------------");
        System.out.print("Informe o total de alunos: ");
        int tot = read.nextInt();
        int cont = 0;
        while(cont<tot)
        {
            System.out.print("Nome: ");
            nome = read.next();
            System.out.print("Nota: ");
            nota = read.nextDouble();
            if(nota>melhorNota)
            {
                melhorNota = nota;
                melhorNome = nome;
            }
            cont++;
        }
         System.out.println("------------------------");
         System.out.println("------------------------");
         System.out.format("Melhor aluno: "+melhorNome+", Nota: %.2f", melhorNota);
         System.out.println("\n------------------------");
         System.out.println("------------------------");
    }
    
    public void enquanto()
    {
        int cont = 0;
        System.out.print("Até quanto deseja contar: ");
        int vezes = read.nextInt();
        System.out.print("Somando mais quanto no contador: ");
        int salto = read.nextInt();
        while(cont<=vezes)
        {
            System.out.println(cont);
            cont = cont + salto;
        }
    }
    
    public void somandoEnquanto()
    {
        int cont = 1;
        double soma = 0;
        while(cont<=5)
        {
            System.out.print("Digite o "+cont+"° número: ");
            double n = read.nextInt();
            soma = soma + n;
            cont = cont + 1;
        }
        System.out.format("O valor total: %.0f",soma);
    }
    public void repitaAte()
    {
        String resp;
        double soma = 0;
        double n = 0;
        do 
        {
            System.out.print("Digite o valor: ");
            n = read.nextInt();
            soma = soma + n;
            System.out.print("Deseja continuar [s/n]");
            resp = read.next();
        }while(resp.toUpperCase().equals("S"));
        System.out.format("O valor total: %.0f",soma);
    }
    public void repitaAte5()
    {
        int cont = 1;
        do 
        {
            System.out.println(cont);
            cont = cont + 1;
        }while(cont<=5);
    }
    public void tabuadaX()
    {
        String resp;
        do
        {
            int cont = 1;
            System.out.println("---------------------------------");
            System.out.println("---------------------------------");
            System.out.println("TABUADA INTELIGENTE");
            System.out.print("Informe o número para visualizar a tabuada: ");
            int n = read.nextInt();
            int r;
            do 
            {
                r = n*cont;
                System.out.println(n+"x" +cont+" = "+r);
                cont = cont +1;
            }while(cont<11);
            System.out.println("---------------------------------");
            System.out.println("---------------------------------");
            System.out.print("Deseja verificar outro número [s/n]");
            resp = read.next();
        }while(resp.toUpperCase().equals("S"));
        System.out.println("Obrigado por participar :p");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
    }
    
    public void fatorial()
    {
        System.out.print("Digite o número para calcular o fatorial: ");
        int n = read.nextInt();
        int cont = n;
        int f = 1;
        do
        {
          f = f* cont;
          System.out.println(cont+"x");
          cont = cont - 1;
        }while(cont>=1);
        System.out.println("O fatorial de "+ n +" é "+ f);
    }
    public void fatorialN()
    {
        String resp;
        do 
        {
            System.out.print("Digite o número para calcular o fatorial: ");
            int n = read.nextInt();
            int f = n;
            int cont = 1;
            do
            {
              f = f * cont;
              cont = cont + 1;
            }while(cont<n);
            System.out.println("O fatorial de "+ n +" é "+ f);
            System.out.println("Deseja continuar [s/n]");
            resp = read.next();
        }while(resp.toUpperCase().equals("S"));
    }
    public void menuContador()
    {
        int opcao;
        do 
        {
            System.out.println("\n===================");
            System.out.println("===================");
            System.out.println("   Menu Contador   ");
            System.out.println("[1] 1 a 10 ");
            System.out.println("[2] 10 a 1 ");
            System.out.println("[3] sair ");
            System.out.println("===================");
            System.out.println("===================");
            System.out.print("Opção: ");
            opcao = read.nextInt();
            
            if(opcao==1)
            {
                int cont = 0;
                while(cont<10)
                {
                    System.out.print((cont+1)+"..");
                    cont++;
                }
            }
            if(opcao==2)
            {
                int cont = 10;
                while(cont>=1)
                {
                    System.out.print(cont+"..");
                    cont--;
                }
            }
        }while(opcao!=3);
    }
    public void para()
    {
        int n;
        int tot =0;
        int soma = 0;
        for(int i=1; i<=6; i++)
        {
            System.out.print("Digite um valor: ");
            n = read.nextInt();
            if(n%2==1)
            {
                    soma = soma + n;
            }
            if((n>=0)&&(n<=10))
            {
                tot++;
            }
        }
        System.out.println("Total de números entre 0 e 10 é: "+tot);
        System.out.println("A soma total de números impares nesse intervalor é: "+soma);
    }
    public void combinacoesPara()
    {
        for(int i = 1; i<=3;i++)
        {
            for(int j = 1; j<=3;j++)
            {
                System.out.print("["+i+"]["+j+"], ");
            }
            System.out.println("");
        }
    }
    public void fib()
    {
        int a = 0;
        int b = 1;
        for(int i =0; i<5; i++)
        {
            System.out.println(a);
            int troca = a;
            a = b;
            b = troca +b ;
        }
    }
    public void verificador()
    {
        int n;
        int vzs = 0;
        double soma = 0;
        int qtdDiv = 0;
        int qtdNulos = 0;
        int somaPares = 0; 
        double media = 0;
        for(int i = 1; i<=5; i++)
        {
            System.out.print("Digite um valor: ");
            n = read.nextInt();
            soma = soma + n;
            if(n%5==0)
            {
                qtdDiv++;
            }
            if(n==0)
            {
                qtdNulos++;
            }
            if(n%2==0)
            {
                somaPares = somaPares + n;
            }
            vzs++;
        }
        media = soma/vzs;
        System.out.println("=======================");
        System.out.println("RESULTADO AVALIADOS");
        System.out.println("Soma de valores: "+soma);
        System.out.println("Média: "+media);
        System.out.println("Total de números divisiveis por 5: "+qtdDiv);
        System.out.println("Quantidades de números nulos: "+qtdNulos);
        System.out.println("Soma dos números pares: "+somaPares);
        System.out.println("=======================");
        
    }
    public void tabelaJogos()
    {
        String [] time = new String[3];
        System.out.println("Times");
        for(int i = 0; i <3; i++)
        {
            System.out.print("nome do "+(i+1)+"° time: ");
            time[i] = read.next();
        }
        System.out.println("Tabela de jogos");
        System.out.println("----------------");
        for (int i = 0; i <3; i++)
        {
            for(int j = 0; j<3;  j++)
            {
                if(time[i]!=time[j])
                {
                    System.out.println(time[i]+" x "+ time[j]);
                }
                
            }
        }
    }
   public void gabarito()
   {
       String [] gab = new String[5];
       System.out.println("======================");
       System.out.println("PASSO 1: Cadastro de gabarito");
       for(int i = 0; i<gab.length; i++)
       {
           System.out.print("Questão "+(i+1)+": ");
           gab[i] = read.next();
       }
       System.out.println("======================");
       String [] aluno = new String[3];
       String [] resp = new String[5];
       int [] acertos = new int[3];
       System.out.println("");
       System.out.println("======================");
       for(int i=0; i < aluno.length; i++)
       {
           System.out.print("Aluno "+(i+1)+": ");
           aluno[i] = read.next();
           int tot = 0;
           for(int j = 0; j<resp.length; j++)
           {
               System.out.print("Questão "+(j+1)+": ");
               resp[j] = read.next();
               if(resp[j].equals(gab[j]))
               {
                   tot = tot + 2;
                   acertos[i] = tot;
               }
           }
       }
       for(int i =0; i < acertos.length; i++)
       {
           System.out.println(acertos[i]);
       }
       System.out.println("======================");
       System.out.println("");
       System.out.println("======================");
       System.out.println("Notas Finais");
       for(int i = 0; i<aluno.length; i++)
       {
           System.out.println("Nome: "+aluno[i]+", acertos: "+acertos[i]);
       }
       System.out.println("======================");
   }
   public void escolherPoltrona()
   {
        String [] B = {"","","","","","","","","",""};
        String resp = "";
        int cad;
        do
        {
            for(int i = 0; i <B.length; i++)
            {
                if(B[i].equals(""))
                {
                    System.out.print("{B"+(i+1)+"}");
                }
                else if(B[i].equals("---"))
                {
                    System.out.println("{---}");
                }
            }
            System.out.print("\nReservar poltrona: ");
            cad = read.nextInt();
            if(B[cad].equals(""))
            {
                B[cad] = "---";
            }
            else if(B[cad].equals("---"))
            {
                System.out.println("Erro, poltrona ocupada!");
            }
            else
            {
                System.out.print("Informe um número válido!");
            }
            System.out.println("Deseja Reservar outra poltrona [s/n]");
            resp= read.next();
        }while(resp.toUpperCase().equals("S"));
   }
   public void matriz()
   {
       int [][] mat = new int [3][3];
       int totPar = 0;
       for(int i=0; i<mat.length; i++)
       {
           for(int j = 0; j<mat.length; j++)
           {
               System.out.print("Informe o número na posição ["+(i+1)+","+(j+1)+"]:");
               mat[i][j] = read.nextInt();
           }
       }
       for(int i=0; i<mat.length;i++)
       {
           for(int j = 0; j<mat.length; j++)
           {
               
               if(mat[i][j]%2==0)
               {
                    System.out.print("{"+mat[i][j]+"}");
                    totPar = totPar + 1;
               }
               else
               {
                    System.out.print(mat[i][j]);
               }
           }
           System.out.println("");
       }
       System.out.println("Ao todo foram digitados: "+totPar+" números pares");
   }
   public void terceiraOrdemMatriz()
   {
       int [][] mat = new int [3][3];
       for(int i=0; i <mat.length; i++)
       {
           for(int j =0; j<mat.length; j++)
           {
               if(mat[i]==mat[j])
               {
                   mat[i][j] = 1;
               }
               else 
               {
                   mat[i][j] = 0;
               }
           }
       }
       for (int i= 0; i<mat.length; i++)
       {
           for(int j=0; j<mat.length; j++)
           {
               System.out.print(mat[i][j]);
           }
           System.out.println("");
       }
   }
   public void matrizQuarta()
   {
       int [][] mat = new int [4][4];
       int totDiag = 0;
       int tot2L = 1;
       int mai = 0;
       for(int i =0; i<mat.length; i++)
       {
           for(int j=0; j<mat.length; j++)
           {
               System.out.print("Informe o número da ["+(i+1)+","+(j+1)+"]: ");
               mat[i][j]=read.nextInt();
           }
       }
       for(int i =0; i<mat.length; i++)
       {
           for(int j=0; j<mat.length; j++)
           {
              System.out.print(mat[i][j]+" ");
              if(i==j)
              {
                  totDiag = totDiag + mat[i][j];
              }
           }
           System.out.println("");
       }
       for(int j =0; j<mat.length; j++)
       {
           if(mat[j][3]>mai)
           {
               mai = mat[j][2];
           }
           tot2L = tot2L * mat[1][j];
           System.out.println("");
           System.out.println(tot2L);
       }
       System.out.println("O total da soma da diagonal principal: "+totDiag);
       System.out.println("Produto da linha 2: "+tot2L);
       System.out.println("Maior valor da coluna 3: "+mai);
   }
}
