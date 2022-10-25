
package indice.academico.lab2.progra.pkg1;

import java.util.Scanner;

public class Lab2P1_JoseBendana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.      Indice Academico");
        System.out.println("2.      ¡OK Boomer!");
        System.out.println("3.      ¡Gotta know them all!");
        System.out.print("Eliga ejercicio 1, 2 o 3: ");
        int opcion = sc.nextInt();
        if (opcion == 1){
            System.out.print("Ingrese A: ");
            int num1 = sc.nextInt();
            System.out.print("Ingrese B: ");
            int num2 = sc.nextInt();
            int nummenor = 0;
            int nummayor = 0;
            int mcd = 0;
            if ((num1>0) && (num2>0)){
                if (num1 > num2){
                        nummayor=num1;
                        nummenor=num2;
                    }else if (num2>num1){
                        nummayor=num2;
                        nummenor=num1;
                    }else {
                        System.out.println("El MCD es "+num1);
                    }    
                while (nummayor != nummenor){
                    if (nummayor>nummenor){
                        mcd = nummayor - nummenor;
                    }else if(nummayor<nummenor){
                        mcd = nummenor - nummayor;
                    }
                    int temp1 = nummenor;
                    nummayor=temp1;
                    nummenor=mcd; 
                }
            }else if (num1<=0 || num2 <= 0){
                System.out.println("Los numeros deben ser mayores a 0");
            }
                System.out.println("El MCD de "+num1+" y "+num2+" es: "+mcd);
        }else if (opcion == 2){
            System.out.print("Ingrese su year de nacimiento: ");
            int year = sc.nextInt();
            if ((year>=1960 && year <=1964) || (year>=1946 && year<=1964)){
                System.out.println("Felicidades usted es un baby boomer gen!");
                
            }else if((year>=1975 && year <= 1979) || (year > 1964 && year <= 1979)){
                System.out.println("Felicidades usted es un Generacion X!");
                
            }else if ((year>=1980 && year <= 1985) || (year > 1979 && year <= 1985)){
                System.out.println("Felicidades usted es un Xennials");
                
            }else if((year>=1990 && year <= 1994) || (year > 1985 && year <= 1994)){
                System.out.println("Felicidades usted es un Millenials");   
            }else if(year>1994 && year <= 2012){
                System.out.println("Felicidades usted es un Gen Z");
            }else if(year>=2013 && year<=2025){
                System.out.println("Felicidades usted es un Gen Alpha");
            }else{
                System.out.println("Year no valido");
            }
        }else if(opcion==3){
            System.out.println("1.      Fairy");
            System.out.println("2.      Fighting");
            System.out.println("3.      Steel");
            System.out.println("4.      Psychic");
            System.out.print("Ingrese el tipo Pokemon atacador: ");
            int tipoat = sc.nextInt();
            System.out.print("Ingrese el tipo Pokemon defensor: ");
            int tipodef = sc.nextInt();
            if((tipoat<4 && tipodef<4)&&(tipoat>0&&tipodef>0))
                if  (tipoat==1){
                    if (tipodef==1){
                        System.out.println("Fairy es neutro contra Fairy");
                    }else if(tipodef==2){
                        System.out.println("Fairy es Super eficaz contra Fighting");
                    }else if(tipodef==3){
                        System.out.println("Fairy es debil contra Steel");
                    }else if (tipodef==4){
                        System.out.println("Fairy es Neutro con Psychic");
                    }else{
                        System.out.println("Defensor no valido");
                    }
                }else if (tipoat==2){
                    if (tipodef==1){
                        System.out.println("Fighting es debil contra Fairy");
                    }else if(tipodef==2){
                        System.out.println("Fighting es neutro contra Fighting");
                    }else if(tipodef==3){
                        System.out.println("Fighting es Super eficaz contra Steel");
                    }else if (tipodef==4){
                        System.out.println("Fighting es debil contra Psychic");
                    }else{
                        System.out.println("Defensor no valido");
                    }
                }else if (tipoat==3){
                    if (tipodef==1){
                        System.out.println("Steel es Super eficaz Fairy");
                    }else if(tipodef==2){
                        System.out.println("Steel es neutro contra Fighting");
                    }else if(tipodef==3){
                        System.out.println("Steel es debil contra Steel");
                    }else if (tipodef==4){
                        System.out.println("Steel es neutro contra Psychic");
                    }else{
                        System.out.println("Defensor no valido");
                        }
                }else if (tipoat==4){
                    if (tipodef==1){
                        System.out.println("Psychic es neutro Fairy");
                    }else if(tipodef==2){
                        System.out.println("Psychic es Super eficaz contra Fighting");
                    }else if(tipodef==3){
                        System.out.println("Psychic es debil contra Steel");
                    }else if (tipodef==4){
                        System.out.println("Psychic es deil contra Psychic");
                    }else{
                        System.out.println("Defensor no valido");
                    }        
                }else{
            System.out.println("Tipo Pokemon no valido");
            }
        }else {
            System.out.println("Opcion no valida");
        }
        }    
    }         
