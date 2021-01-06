package exercises;

public class ArrayPractice {
    public static void main(String[] args){
        int array[]= {1,1,2,3,5,8};
//        int maxNum = 6;
//        int [] array = new int [maxNum];
//            array[0] = 1;
//            array[1] = 1;
//            array[2] = 2;
//            array[3] = 3;
//            array[4] = 5;
//            array[5] = 8;

        //for (int i=0; i<maxNum; i++){
            //System.out.println(array [i]);
        for (int i=0; i<array.length; i++){
            if (array[i]%2!=0) {
                System.out.println(array[i]);
            }
        }
    }
}
