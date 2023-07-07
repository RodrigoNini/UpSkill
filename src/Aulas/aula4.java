package Aulas;
import javax.sound.midi.Soundbank;
public class aula4 {
        public static void main(String[] args) {
            //getEvenWhile();
            //getEvenDoWhile();
            //getEvenFor();
            System.out.println(findMax(new int[]{5,1,8,3,2,1,0,7,9}));
        }

        //while
        public static void getEvenWhile(){
            int i=0;
            while(i<=20){
                if(i%2==0){
                    System.out.println(i);
                }
                i++;
            }
        }
        //doWhile
        public static void getEvenDoWhile(){
            int i=0;
            do{
                if(i%2==0){
                    System.out.println(i);
                }
                i++;
            } while(i<=20);
        }
        //for
        public static void getEvenFor(){
            for (int i=0;i<=20;i++){
                if (i%2==0){
                    System.out.println(i);
                }
            }
        }

        //count with for Loop
        public static int countFor(int a, int[] v){
            int count=0;
            for (int i=0;i<v.length;i++){
                if(a==v[i]){
                    count++;
                }
            }
            return count;
        }

        public static boolean isThereN(int a, int[] v){

            for (int i=0; i<v.length; i++){
                if (a==v[i]){
                    return true;
                }
            }
            return false;
        }

        public static int findMax(int[] v){
            int max = v[0];
            for(int i=1;i<v.length;i++){
                if(v[i]>max){
                    max = v[i];
                }
            }
            return max;
        }
    }
