package Task_9thFeb;

public class LeftTrianglepattern {
    public static void main(String[] args) {
        int rows=5;
        char[] stars =new char[rows];

        for(int i=0;i<rows;i++){
            stars[i]='*';


        }
        for(int i=rows;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.println(stars[j]);
            }
            System.out.println();
        }

    }
}
