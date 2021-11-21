public class ExpressionTree {
    public static Double compute(Node root) {
        return root.compute();
    }
    //pre
    public static void preShow(Node root) {
        if(root == null)
            return;
        System.out.print(root.getValue());
        preShow(root.lNode);
        preShow(root.rNode);
    }
    //in
    public static void inShow(Node root) {
        if(root == null)
            return;
        inShow(root.lNode);
        System.out.print(root.getValue());
        inShow(root.rNode);
    }
    //post
    public static void postShow(Node root) {
        if(root == null)
            return;
        postShow(root.lNode);
        postShow(root.rNode);
        System.out.print(root.getValue());
    }

    private static boolean isPureDigit(String str) {
        return str.matches("[0-9]+");
    }
    public static Node build(String str) {
        Node currentRoot = null;
        if(isPureDigit(str)) {
            currentRoot = new OperandNode(str);
            return currentRoot;
        }
        int p = 0, c1 = -1, c2 = -1;
        for(int i = 0; i < str.length(); i++) {
            switch (str.substring(i, i+1)) {
                case "(":
                    p++;
                    break;
                case ")":
                    p--;
                    break;
                case "+":case "-":
                    if(p == 0)
                        c1 = i;
                    break;
                case "*":case "/": case "%":
                    if (p == 0)
                        c2 = i;
                    break;
            }
        }
        if(c1 == -1 && c2 == -1) {
            currentRoot = build(str.substring(1, str.length() - 1));
        } else if(c1 >= 0) {
            currentRoot = new OperatorNode(str.substring(c1, c1 + 1));
            currentRoot.setlNode(build(str.substring(0, c1)));
            currentRoot.setrNode(build(str.substring(c1+1)));
        } else {
            currentRoot = new OperatorNode(str.substring(c2, c2 + 1));
            currentRoot.setlNode(build(str.substring(0, c2)));
            currentRoot.setrNode(build(str.substring(c2+1)));
        }
        return currentRoot;
    }
}
