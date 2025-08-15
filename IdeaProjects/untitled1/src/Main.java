import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter numbers of Pokemons");
        int num = S.nextInt();
        Pokemons p = new Pokemons();

        for(int x=1;x<=num;x++){
      p.setName();p.setGender();p.setAge();
    System.out.println();
}
        for(int y=1;y<=num;y++){
            p.print();
            System.out.println();
        }
  }
}