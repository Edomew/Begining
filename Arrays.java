public class Arrays {
    public static void main(String[] args) {
        int[][] matrice = {{1,2,3},{4,5,6},{7,8,9}};
        for(int[] array: matrice){
            for(int num: array){
                System.out.print(num+" ");
            }
            System.out.println("\n");
        }
    }
}
