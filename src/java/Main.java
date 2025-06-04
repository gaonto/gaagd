import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 계산기 ===\n");

        while (true) {
            System.out.println("계산을 시작하려면 Enter, 종료하려면 \"종료\"를 입력해주세요.");
            String exit = scanner.nextLine();

            if (exit.equals("종료")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }

            System.out.println("숫자를 입력해주세요.");
            int number1 = scanner.nextInt();

            System.out.println("연산기호를 입력해주세요. (+ -, *, /): ");
            char symbol = scanner.next().charAt(0);

            System.out.println("숫자를 입력해주세요.");
            int number2 = scanner.nextInt();
            scanner.nextLine();

            int result = 0;

            if (symbol == '+') {
                result = number1 + number2;

            } else if (symbol == '-') {
                result = number1 - number2;

            } else if (symbol == '*') {
                result = number1 * number2;

            } else if (symbol == '/') {
                if (number2 == 0) {
                    System.out.println(" 0으로 나눌 수 없습니다! 다시 입력해주세요.");
                    continue;
                }
                result = number1 / number2;
            } else {
                System.out.println("잘못된 기호입니다.");
                continue;
            }

            System.out.printf("결과 : %d %c %d = %d\n", number1, symbol, number2, result);
        }
    }
}
