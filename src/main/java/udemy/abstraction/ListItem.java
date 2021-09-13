package udemy.abstraction;

public abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
//run in main
//    SearchTree tree = new SearchTree(null);
//        tree.traverse(tree.getRoot());
//
//                String stringData = "5 7 3 9 8 2 1 0 4 6";
//                String[] data = stringData.split(" ");
//                for (String s : data) {
//                tree.addItem(new Node(s));
//                }
//
//                tree.traverse(tree.getRoot());
//                tree.removeItem(new Node("3"));
//                tree.traverse(tree.getRoot());
//
//                tree.removeItem(new Node("5"));
//                tree.traverse(tree.getRoot());
//
//                tree.removeItem(new Node("0"));
//                tree.removeItem(new Node("4"));
//                tree.removeItem(new Node("2"));
//                tree.traverse(tree.getRoot());
//
//                tree.removeItem(new Node("9"));
//                tree.traverse(tree.getRoot());
//                tree.removeItem(new Node("8"));
//                tree.traverse(tree.getRoot());
//                tree.removeItem(new Node("6"));
//                tree.traverse(tree.getRoot());
//                tree.removeItem(tree.getRoot());
//                tree.traverse(tree.getRoot());
//                tree.removeItem(tree.getRoot());
//                tree.traverse(tree.getRoot());
//                }
