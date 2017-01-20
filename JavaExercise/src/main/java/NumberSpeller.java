/**
 * Created by GHTL on 20/01/2017.
 */
public class NumberSpeller {
    private final String[] UnitWords = new String[]{"zero", "one", "two", "three", "four", "five",
                                                    "six", "seven", "eight", "nine", "ten",
                                                    "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                                                    "sixteen", "seventeen", "eighteen", "ninteen"};

    public String spellOut(int number) {
        if (number == 0) {
            return UnitWords[0];
        }

        String words = "";
        if (number < 20) {
            words += UnitWords[number];
        }

        return words;
    }
}
