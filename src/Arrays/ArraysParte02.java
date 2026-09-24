package Arrays;

public class ArraysParte02 {
    static void main(String[] args) {
        int 1=0;
        String[] nomes = new String[4];

        nomes[0] = "Goku";
        nomes[1] = "Luffy";
        nomes[2] = "Naruto";
        nomes[3] = "Ichigo";

        while (i < nomes.length) {
            System.out.println(nomes[i]);
            i++;
        }

        nomes = new String[5];
        nomes[4] = "zoro";

        System.out.println(nomes[4]);
        System.out.println();
    }
}
