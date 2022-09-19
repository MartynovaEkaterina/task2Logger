import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        try {
            System.out.println("Введите размер списка:");
            int listSize = scanner.nextInt();
            System.out.println("Введите верхнюю границу для значений:");
            int upLimit = scanner.nextInt();
            logger.log("Создаём и наполняем список");
            List list = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < listSize; i++) {
                list.add(random.nextInt(upLimit));
            }
            System.out.println("Вот случайный список: " + list.toString());
            logger.log("Просим пользователя ввести входные данные для фильтрации");
            System.out.println("Введите порог для фильтра:");
            int treshold = scanner.nextInt();
            Filter filter = new Filter(treshold);
            List finalList = filter.filterOut(list);
            logger.log("Прошло фильтр " + finalList.size() + " элемента из " + listSize);
            logger.log("Выводим результат на экран");
            System.out.println("Отфильтрованный список: " + finalList.toString());
            logger.log("Завершаем программу");
        } catch (InputMismatchException ex) {
            System.out.println("Введено некорректное значение");
        }
    }
}
