public class BinarySearchTree{
    MyNode root;
    public BinarySearchTree(){
        root=null;
    }
    public MyNode addRecursive(MyNode current , int data){
        if(current==null){
            return new MyNode(data);
        }
        if(data<current.data){
            current.right=addRecursive(current.left,data);
        }
       else if (data>current.data){
            current.right=addRecursive(current.right,data);
        }
       else {
           return current;
        }
       return current;
    }
    public  void insert(int data){
        root=addRecursive(root,data);
    }
    public void traverseInOrder(MyNode node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println(" " + node.data);
            traverseInOrder(node.right);
        }
    }
    public  boolean containsNOdeRecursion(MyNode current,int data){
        if(current==null){
            return false;
        }
        if(data==current.data){
            return true;
        }
        return data<current.data ? containsNOdeRecursion(current.left,data):containsNOdeRecursion(current.right,data);
    }
    public void SearchNode(int data){
       if(containsNOdeRecursion(root,data)){
           System.out.println("This data present: "+data);
       }
       else {
           System.out.println("This data not present");
       }
    }
}
