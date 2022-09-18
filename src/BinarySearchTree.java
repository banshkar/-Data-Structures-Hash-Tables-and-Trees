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
}
