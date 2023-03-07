import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class StreamMain {
    public static void main(String[] args) {

        //乱数生成
        Random rnd = new Random();
        int num1 = rnd.nextInt(300);
        int num2 = rnd.nextInt(400);
        int num3 = rnd.nextInt(1500);
        int num4 = rnd.nextInt(10000);

        //List
        List<Integer> numList = new ArrayList<>();

        //要素
        numList.add(num1);
        numList.add(num2);
        numList.add(num3);
        numList.add(num4);

        System.out.println(numList);

        //最大値の出力
        List<Integer> maxresult = numList.stream().max(Comparator.naturalOrder()).stream().toList();
        System.out.println("リストの最大値");
        System.out.println(maxresult);

        //最小値の出力
        List<Integer> minresult = numList.stream().min(Comparator.naturalOrder()).stream().toList();
        System.out.println("リストの最小値");
        System.out.println(minresult);

        //平均値の出力
        double averageresult = numList.stream().mapToDouble(a -> a).average().orElse(0);
        System.out.println("リストの平均値");
        System.out.println(averageresult);

    }
}
