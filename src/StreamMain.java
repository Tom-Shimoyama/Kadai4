import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class StreamMain {
    public static void main(String[] args) {

        //乱数生成
        Random rnd = new Random();
        int num1 = rnd.nextInt(200);
        int num2 = rnd.nextInt(200);
        int num3 = rnd.nextInt(200);
        int num4 = rnd.nextInt(200);
        int num5 = rnd.nextInt(200);


        //List
        List<Integer> numList = List.of(num1, num2, num3, num4, num5);
        System.out.println(numList);

        //最大値の出力
        Integer maxResult = numList.stream().max(Comparator.naturalOrder()).orElse(0);
        System.out.println("リストの最大値は" + maxResult + "です。" );

        //最小値の出力
        Integer minResult = numList.stream().min(Comparator.naturalOrder()).orElse(0);
        System.out.println("リストの最小値は" + minResult + "です。");

        //平均値の出力
        double averageResult = numList.stream().mapToDouble(a -> a).average().orElse(0);
        System.out.println("リストの平均値は" + averageResult + "です。");

        List<Integer> evenNumberResult = numList.stream().filter(i ->i%2==0).sorted().toList();
        long countResult = numList.stream().filter(i ->i%2==0).count();
        System.out.println("リストの偶数を表示します。");
        System.out.println(evenNumberResult);
        System.out.println("偶数の値は" + countResult + "つです。");


    }
}
