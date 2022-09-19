import java.util.*;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (int s : source) {
            if (s < treshold) {
                logger.log("Элемент " + s + " не проходит");
            } else {
                logger.log("Элемент " + s + " проходит");
                result.add(s);
            }
        }
        return result;
    }
}