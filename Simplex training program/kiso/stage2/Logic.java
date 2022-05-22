public class Logic {
    public static void main(String[] args) {
        String x1 = args[0];
        String Operator = args[1];
        String x2 = args[2];


        boolean bool1 = Boolean.parseBoolean(x1);
        boolean bool2 = Boolean.parseBoolean(x2);

        if (Operator.equals("A")) {
            System.out.println(bool1 && bool2);
        } else if (Operator.equals("O")) {
            System.out.println(bool1 || bool2);
        } else {
            System.out.println("Error");
        }

    }
}
