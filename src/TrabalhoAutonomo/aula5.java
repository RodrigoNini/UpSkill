package TrabalhoAutonomo;

public class aula5 {

    public static void displayArray(int[]v){
        String array = "[";
        for (int i = 0; i < v.length; i++) {
            if (i == v.length - 1){
            array = array + v[i] + "]";
            break;
        }
            array = array + (v[i] + ",");

        }
        System.out.println(array);
    }
    
    public static int[] firstHalf(int[] v, boolean include) {
        int a = v.length / 2 + 1;
        int b = v.length / 2;
        if (include && v.length % 2 == 1) {
            int[] newV = new int[a];
            for (int i = 0; i < a; i++) {
                newV[i] = v[i];
            }
            return newV;
        } else {
            int[] newV = new int[b];
            for (int i = 0; i < b; i++) {
                newV[i] = v[i];
            }
            return newV;
        }
    }

    public static int[] mergeV(int[]a, int[]b){
        int[] v = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            v[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            v[a.length + j] = b[j];
        }
        return v;
    }


    public static int[] reverseArray(int[]a){
        int[]v = new int[a.length];
        int b = a.length - 1;
        for (int i = 0; i < v.length; i++) {
            v[i] = a[b];
            b--;
        }
        return v;
    }

    public static int[] doubleDuplicate(int[]a){
        int[]v = new int[a.length*2];
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            v[c] = a[i];
            v[c+1] = a[i];
            c+=2;
        }
        return v;
    }

    public static int[] doubleReverse(int[]a){
        int[]v = new int[a.length*2];
        int c = a.length - 1;
        for (int i = 0; i < v.length; i++) {
            if(i>=a.length){
                v[i] = a[c];
                c--;
            }else {
                v[i] = a[i];
            }
        }
        return v;
    }

    public static int[] removeMidOdd(int[]a) {
        int[] v = new int[a.length - 1];
        int c = 0;
        if (a.length % 2 == 1) {
            for (int i = 0; i < v.length; i++) {
                if (i == a.length / 2) {
                    c++;
                }
                v[i] = a[c];
                c++;
            }
            return v;
        }
        return a;
    }



    public static void main(String[] args) {
        //displayArray(firstHalf(new int[]{5,4,9,6,3,1,0,7,8}, false));
        //displayArray(mergeV(new int[]{5,4,9,6}, new int[]{1,2,9,6}));
        //displayArray(reverseArray(new int[]{5,4,9,6,3,1,0,7,8}));
        //displayArray(doubleDuplicate(new int[]{1,2,3}));
        //displayArray(doubleReverse(new int[]{1,2,3,4}));
        displayArray(removeMidOdd(new int[]{5,4,9,6,3,1,0,7}));
    }

}