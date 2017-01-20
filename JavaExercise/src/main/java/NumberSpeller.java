/**
 * Created by GHTL on 20/01/2017.
 *
 * program which given a whole number between 0 and 1 billion; writes it out in words. E.g.
 *
 * Allowed input numbers are 0 , 1 billion, 1 to 999_999_999
 *
 * 0 and 1 billion are checked directly.
 *
 * Logic for converting numbers upto 999_999_999
 * -> Break down a number in 3 digit groups (million, thousand, hundreds place).
 * -> for each group repeat following logic
 *      -> break down in 3 parts hundreds part, tens part, unit part (three hundred and fifty-four etc)
 */
public class NumberSpeller {
    private static final String BILLION = "one billion";
    private final String MILLION = "million";
    private final String THOUSAND = "thousand";
    private final String HUNDRED = "hundred";
    private final String SEPARATOR = " ";
    private final String DIVIDER = "-";

    private final String[] UnitWords = new String[]{"zero", "one", "two", "three", "four", "five",
                                                    "six", "seven", "eight", "nine", "ten",
                                                    "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                                                    "sixteen", "seventeen", "eighteen", "ninteen"};

    private final String[] TensWords = new String[]{"", "", "twenty", "thirty", "forty", "fifty",
                                                    "sixty", "seventy", "eighty", "ninety"};

    public String spellOut(int number) {
        //0 and 1 billion are checked directly.
        if (number == 0) {
            return UnitWords[0];
        }

        if (number == 1000000000) {
            return BILLION;
        }

        String millionPart = spellOutThreeDigits(number / 1_000_000, MILLION);
        String thousandPart = spellOutThreeDigits((number / 1_000) % 1_000, THOUSAND);
        String hundredPart = spellOutThreeDigits(number % 1_000, "");

        return millionPart + thousandPart + hundredPart;
    }

    private String spellOutThreeDigits(int number, String placeStr) {
        StringBuilder sb = new StringBuilder();
        if (number / 100 > 0) {
            sb.append(UnitWords[number / 100]).append(SEPARATOR).append(HUNDRED);
        }

        if (number % 100 > 0) {
            int tensPlace = number % 100;

            if(sb.length() > 0) {
                sb.append(SEPARATOR);
            }

            if (tensPlace > 20) {
                sb.append(TensWords[tensPlace / 10]);

                if (tensPlace % 10 > 0) {
                    sb.append(DIVIDER).append(UnitWords[tensPlace % 10]);
                }
            } else {
                sb.append(UnitWords[tensPlace]);
            }
        }

        if (sb.length() > 0 && !placeStr.isEmpty()) {
            sb.append(SEPARATOR).append(placeStr);
        }

        return sb.toString();
    }
}
