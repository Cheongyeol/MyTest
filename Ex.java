public class Ex {
    public static void main(String[] args){
        int intArray[] = new int[30];
        for(int i=0;i<intArray.length;i++){
            intArray[i] = 1001+i;
        }
        String remainders[] = {"Zero", "One", "Two", "Three"};
        /*for(int e:intArray){
            System.out.println(remainders[e % 4]);

        }*/
        for(int e = 1; e<=intArray.length; e++) {
            System.out.println(remainders[e % 4]);
        }
    }
}
