public class BubbleSortByStep {

    public static void bubbleSortByStep(int list[]){
        for (int i =0;i<list.length;i++){
            for (int j =list.length-1;j>i;j--){
                if (list[j]<list[j-1]){
                    System.out.println("Swap "+list[j]+" to "+list[j-1]);
                    int temp =list[j];
                    list[j] =list[j-1];
                    list[j-1] =temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int [] list ={1,3,-1,2,7,4};
        bubbleSortByStep(list);
        for (int i =0;i<list.length;i++){
            System.out.print(list[i]+"\t");
        }
    }
}
