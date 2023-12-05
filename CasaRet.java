import java.util.Scanner;

class AreaCasa {
    static double valorM2 = 1500;
    static int mt ;
    static double precos[] = { 1500, 1100, 750, 500};

    static void areaCasa(float lateral,float cquarto) {             //Parametros area casa()
        float areaq;
        float areas;
        float areat;
        double valor3;

        if (lateral<0 || cquarto<0) System.out.println("Erro: Lareral da sala < 0");                            //A || é = a OU
        else{                
                areas = lateral*lateral;
            System.out.println("A área da sala é "+areas);
                areaq = cquarto*(lateral/2);
            System.out.println("A área do quarto é "+areaq);
            System.out.println("A área do banheiro é "+areaq);
                areat = areas+areaq*2;
            System.out.println("A área total é "+areat);
                valor3 = valorM2*areat;
            System.out.printf("O valor total da casa sera: %.2f R$ %n", valor3);         //Forma de quebrar linha e colocar casas apos a virgula 
            }
        }                    //SISTEMA DE CALCULO DA AREA
    static double areaPiscina(double raio) {

        if (raio >= 0)return(Math.PI * Math.pow(raio,2));
        else return(-1);     //parâmetros area piscina()
    }
    static double valor(double area,int material) {
        if (material<0 || material>4|| area<0) return -1;

        return (area*precos[material]);
        
    }
    public static void main(String[] args) {
        double preco;
        double areap;
        //int tipo = 1;
        float raio;

        System.out.println("=====================================");
        System.out.println("Programa para cálculo da área da casa");
        System.out.println("=====================================");
        Scanner myObj = new Scanner(System.in); 
        System.out.printf("Digite o valor da lateral: ");
        float lateral1 = myObj.nextFloat();
        System.out.println("=====================================");

        System.out.printf("Digite o valor cquarto: "); 
        float cquarto1 = myObj.nextFloat();
        System.out.println("=====================================");
        
        areaCasa(lateral1,cquarto1);
        System.out.println("=====================================");
        System.out.printf("Digite o valor do raio da Piscina: ");
            raio = myObj.nextFloat();

            areap = areaPiscina(raio);

        System.out.printf("Area da piscina sera: %.2f M2 %n", areap);

        System.out.println("=================");
        System.out.println("Materiais piscina");
        System.out.println("=================");
        System.out.println("Alvenaria [0]");
        System.out.println("Vinil [1]");
        System.out.println("Fibra [2]");
        System.out.println("Plastico [3]");
        System.out.println("Todos [4]");
            mt = myObj.nextInt();
        System.out.println("=================");

        switch (mt) {
            case 4 : for(int tipo = 0; tipo <= 3; tipo = tipo +1){                      //(For) = Enquanto/ O processo ira rodar até que a condição for atendida( O processo e a condição estando juntos e o comando depois)
                System.out.printf("Os valores da piscina serao de: %.2f R$ %n",valor(areap, tipo));
                System.out.println("-------------------------------------------"); 
            }
                
                break;
        
            default : preco = valor(areap, mt);
                        System.out.printf("O valor da construção da piscina sera de: %.2f R$ %n",preco);
                        System.out.println("----------------------------------------------------"); 
                break;
        }
           
    }
}
        







/*switch (mt) {
            case 5: while (tipo < mt){              //While é usado para colocar uma condição (Ira continuar até a condição ser atendida)
                        
                        System.out.printf("Os valores da piscina serao de: %.2f R$ %n",valor(areap, tipo));
                        System.out.println("-------------------------------------------");
                        tipo = tipo + 1;
            
            }
                break;
        
            default: preco = valor(areap, mt);
                        System.out.printf("O valor da construção da piscina sera de: %.2f R$ %n",preco);
                break;

                 //boolean usado para saber se o valor é negativo ou positivo---se positivo faça tal coisa ---se negativo faça outra coisa  (True e False)

        } */




        /*double valor;                            //Faça isso ou façça aquilo IF ou else
        switch (material) {
            case 1: valor = precos[0];
                
                break;
            case 2: valor = precos[1];
                
                break;
            case 3: valor = precos[2];
                
                break;
            case 4: valor = precos[3];
                
                break;
        
            default: valor = -1;
                break;
        }  
        return(area*valor); */