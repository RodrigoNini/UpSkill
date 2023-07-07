package Aulas;
import java.util.Scanner;
public class aula3 {
        public static void main(String[] args) {
            //getGrade(-6);
            //System.out.println(getWheels());
            //getSign();
        }
        //exercise 1
        public static int age(int y){
            return 2023-y;
        }
        //exercise 2
        public static double divide(double a, double b){
            return a/b;
        }

        //exercise 3
        public static boolean even(int a){
            return a % 2 == 0;
        }

        //exercise 4
        public static boolean posOrNeg(int a){
            return a >= 0;
        }

        //exercise 5
        public static void printer(){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("O que queres que imprima?");
            String input = keyboard.nextLine();
            System.out.println(input);
        }

        //exercise 6
        public static int getWheels(){
            Scanner input = new Scanner(System.in);
            System.out.println("Diz-me um veiculo");
            String v = input.nextLine();

            switch (v) {
                case ("automóvel") -> {
                    return 4;
                }
                case ("moto"), ("bicicleta") -> {
                    return 2;
                }
                case ("triciclo") -> {
                    return 3;
                }
                case ("camião") -> {
                    return 8;
                }
                case ("monociclo") -> {
                    return 1;
                }
                default -> {
                    return 0;
                }
            }

        }

        //exercise 7
        public static void getGrade(int n){
            if (n>=0&&n<30){
                System.out.println("Muito Insuficiente");
            } else if(n>=30&&n<50){
                System.out.println("Insuficiente");
            } else if(n>=50&&n<70){
                System.out.println("Suficiente");
            } else if(n>=70&&n<80){
                System.out.println("Bom");
            } else if(n>=80&&n<90){
                System.out.println("Muito bom");
            } else if(n>=90&&n<=100){
                System.out.println("Excelente");
            } else {
                System.out.println("Nota inválida");
            }
        }

        //exercise 8
        public static void getMonth(int m){
            switch (m) {
                case 1 -> System.out.println("Janeiro");
                case 2 -> System.out.println("Fevereiro");
                case 3 -> System.out.println("Março");
                case 4 -> System.out.println("Abril");
                case 5 -> System.out.println("Maio");
                case 6 -> System.out.println("Junho");
                case 7 -> System.out.println("Julho");
                case 8 -> System.out.println("Agosto");
                case 9 -> System.out.println("Setembro");
                case 10 -> System.out.println("Outubro");
                case 11 -> System.out.println("Novembro");
                case 12 -> System.out.println("Dezembro");
                default -> System.out.println("Mês inválido");
            }
        }

        //exercise 9
        public static void getSign(){

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Em que dia nasceste?");
            int d = keyboard.nextInt();
            System.out.println("Em que mês nasceste?");
            int m = keyboard.nextInt();

            if((d>=20 && m==1) || (d<=18 && m==2)){
                System.out.println("Aquário");
            } else if ((d>=19 && m==2) || (d<=20 && m==3)) {
                System.out.println("Peixes");
            } else if ((d>=21 && m==3) || (d<=19 && m==4)) {
                System.out.println("Carneiro");
            } else if ((d>=20 && m==4) || (d<=20 && m==5)) {
                System.out.println("Touro");
            } else if ((d>=21 && m==5) || (d<=21 && m==6)) {
                System.out.println("Gémeos");
            } else if ((d>=22 && m==6) || (d<=22 && m==7)) {
                System.out.println("Caranguejo");
            } else if ((d>=23 && m==7) || (d<=22 && m==8)) {
                System.out.println("Leão");
            } else if ((d>=23 && m==8) || (d<=22 && m==9)) {
                System.out.println("Virgem");
            } else if ((d>=23 && m==9) || (d<=22 && m==10)) {
                System.out.println("Balança");
            } else if ((d>=23 && m==10) || (d<=21 && m==11)) {
                System.out.println("Escorpião");
            } else if ((d>=22 && m==11) || (d<=21 && m==12)) {
                System.out.println("Sagitário");
            } else if ((d>=22 && m==12) || (d<=19 && m==1)) {
                System.out.println("Capricórnio");
            } else {
                System.out.println("Essa data não é válida");
            }
        }

        //exercise 10
        public static int returnOrdered () {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Diz-me um número:");
            ;
            int a = keyboard.nextInt();
            int max = a;
            System.out.println("Diz-me um número:");
            ;
            int b = keyboard.nextInt();
            if (b > a) {
                max = b;
            }
            System.out.println("Diz-me um número:");
            ;
            int c = keyboard.nextInt();
            if (c > max) {
                max = c;
            }
            return c;
        }
}

