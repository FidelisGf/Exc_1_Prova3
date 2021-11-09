import java.util.*;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        adicionar_na_Lista(list);
        apresenta_lista(list);
    }
    public static void adicionar_na_Lista(List<String> list){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Digite o valor numerico para inserir na lista");
            list.add(scanner.nextLine());
            System.out.println("Deseja Continuar ? (1)Sim (2) Nao");
            if(scanner.nextLine().contains("2")){
                break;
            }
        }
    }
    public static void apresenta_lista(List<String> list){
        System.out.println("Sua lista atual :");
        for(String string : list){
            System.out.println(string);
        }
        maior_valor_e_menor_valor_e_media(list);
    }
    public static void maior_valor_e_menor_valor_e_media(List<String> list){
        List<Integer> tmp = new ArrayList<>();
        int i = 0;
        for(String string : list){
            if(isNumeric(string)){
                tmp.add(Integer.valueOf(list.get(i)));
            }
            i++;
        }
        int max = Collections.max(tmp);
        System.out.println("O Maior valor é : " + max);
        int min = Collections.min(tmp);
        System.out.println("O Menor valor é : " + min);
        fazer_media(tmp);
    }
    public static void fazer_media(List<Integer> tmp){
        double soma = 0;
        int i = 0;
        for(Integer integer : tmp){
            soma += Double.valueOf(integer);
        }
        System.out.println("A media dos valores é : " + (soma / tmp.size()));
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
