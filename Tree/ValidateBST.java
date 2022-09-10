package Tree;

public class ValidateBST {
    public static void main(String[] args) {
        Node root = new Node(5);
        CreateTree ct = new CreateTree();
        ct.create(root);
        System.out.println(validate(root));
    }

    static boolean validate(Node root) {
        return validBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean validBST(Node root, long minVal, long maxVal) {
        if (root == null)
            return true;
        if (root.val >= maxVal || root.val <= minVal)
            return false;
        boolean f1 = validBST(root.left, minVal, root.val);
        boolean f2 = validBST(root.right, root.val, maxVal);

        if (f1 == false || f2 == false)
            return false;

        return true;
    }
}
