import java.util.Scanner;

class HeadMessagescanner{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("\"" + name + "\"からメッセージが届いています。今日も研修を頑張りましょう。");
        scanner.close();
    }
}
