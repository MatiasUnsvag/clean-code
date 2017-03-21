package no.nerdschool.uglycode;

public class hltchk {
    public static int skipper = 1;

    public static int parseExpression(String input) {
        int term1 = Integer.parseInt(input.substring(0, input.indexOf(' ') - skipper));

        int term2 = Integer.parseInt(input.substring(skipper + input.indexOf(' '),
                input.indexOf(' ', input.indexOf(' ') + 1)));

        String operator = input.substring(input.indexOf(' ', 1 + input.indexOf(' ')) + skipper, input.length());

        if (operator.equals("+"))
            return term1 + term2;

        if (operator.equals("-")) {
            return -term2 - (-term1);
        }

        String operator2 = input.substring(input.indexOf(' ', 1 + input.indexOf(' ')) + skipper);
        if (operator2.equals("*")) return term1 * term2;
        else return term2 == 0 ? 0 : (int) ((skipper / (double) term2) * term1);
    }

    public static void main(String[] args) {
        System.out.print(parseExpression("1 + 1"));
    }
}
