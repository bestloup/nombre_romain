package fr.insalyon.telecom.mgl;

class RomanNumberConverter {

    private static final int[] values = {1, 5, 10, 50, 100, 500, 1000};
    private static final char[] keys = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

    private static int getValueFor(char c) {
        for (int i = 0; i < keys.length; ++i) {
            if (keys[i] == c) {
                return values[i];
            }
        }
        throw new NullPointerException();
    }

    int convert(String romanNumber) {
        int sum = 0, same = 0, lastValue = 0;
        for (int i = 0; i < romanNumber.length(); ++i) {
            char c = romanNumber.charAt(i);
            try {
                // try to get the corresponding value in dictionary
                int value = getValueFor(c);
                // not more than 3 times the same letter, excepted for M
                if (value == lastValue && c != 'M' && ++same > 2)
                    throw new IllegalArgumentException("Invalid syntax: too much repetitions of char " + c);
                // IV = 4 but VI = 6
                if (lastValue < value) {
                    sum += (value - 2 * lastValue);
                } else {
                    sum += value;
                }
                lastValue = value;
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Unknown char " + c);
            }
        }
        return sum;
    }

    String convert(int number) {
        // get the upper roman number for this int
        try {
            int index = getUpperRoman(number);
            int value = values[index];
            if (number > value) {
                // if above, complete with numbers
                return keys[index] + convert(number - value);
            } else if (number < value) {
                // try by removing one
                for (int i = 0; i < index; ++i) {
                    if (value - values[i] == number) {
                        return keys[i] + "" + keys[index];
                    }
                }
                // else, take previous number and add some to the right
                return keys[index - 1] + convert(number - values[index - 1]);
            } else {
                // if equals, return number
                return "" + keys[index];
            }
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Roman don't know the Zero!");
        }
    }

    int getUpperRoman(int nbr) {
        int i = values.length - 1;
        for (; i >= 0; --i) {
            if (nbr > values[i]) {
                return i == values.length - 1 ? i : i + 1;
            } else if (nbr == values[i]) {
                return i;
            }
        }
        throw new NullPointerException();
    }

}
