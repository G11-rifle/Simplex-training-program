import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.MathContext;

public class Calc {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        String Operator = args[1];
        double y = Double.parseDouble(args[2]);

        BigDecimal val1 = BigDecimal.valueOf(x);
        BigDecimal val2 = BigDecimal.valueOf(y);

        if (Operator.equals("+")) {
            BigDecimal bigDecimalAnswer = val1.add(val2);
            System.out.println(bigDecimalAnswer);
        } else if (Operator.equals("-")) {
            BigDecimal bigDecimalAnswer = val1.subtract(val2);
            System.out.println(bigDecimalAnswer);
        } else if (Operator.equals("x")) {
            BigDecimal bigDecimalAnswer = val1.multiply(val2);
            System.out.println(bigDecimalAnswer);
        } else if (Operator.equals("/")) {
            BigDecimal bigDecimalAnswer = val1.divide(val2, 10, RoundingMode.HALF_UP); // 4つの演算をbigDecimalで解決した。除算のビット数が多すぎため、将来的に最適化する余地がある
            System.out.println(bigDecimalAnswer);
        } else if (Operator.equals("P")) {
            Double bigDecimalAnswer = Math.sqrt(x * x + y * y);// ピタゴラスの定理はbigDecimalではなく、doubleとmath方法で解決した。エラー出る可能性がある。
            System.out.println(bigDecimalAnswer);
        } else {
            System.out.println("Error");
        }

    }

}
