package a_data_structures_part.a_stack;


public class BalancedBrackets {

    private boolean isBalanced(String brackets) {
        boolean balanced = true;
        int index = 0;
        Stack stack = new Stack();
        while (index < brackets.length() && balanced) {
            char symbol = brackets.toCharArray()[index];
            if ("([{".indexOf(symbol) >= 0 ) {
                stack.push(symbol);
            } else {
                if (stack.isEmpty()) {
                    balanced = false;
                } else {
                    Object top = stack.pop();
                    if (!matches((Character) top, symbol)) {
                        balanced = false;
                    }
                }
            }
            index++;
        }

        if (balanced && stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean matches(char open, char close) {
        String opens = "([{";
        String closers = ")]}";
        return opens.indexOf(open) == closers.indexOf(close);
    }

    public static void main(String[] args) {
        System.out.println(new BalancedBrackets().isBalanced("(()")  );
        System.out.println(new BalancedBrackets().isBalanced("((()))")  );
        System.out.println(new BalancedBrackets().isBalanced("{{([][])}()}"));
        System.out.println(new BalancedBrackets().isBalanced("[{()]")  );
    }
}
