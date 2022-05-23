public class BstIterator{
	private Stack<TreeNode> stack = new Satck<>();
	boolean reverse =true;
	//reverse true ->before
	//reverse false ->next
	
	public BstIterator(TreeNode root,boolean reverse){
		this.reverse=reverse;
		pushAll(root);
	}
	public boolean hasNext(){
		return !stack.isEmpty();
	}
	public TreeNode next(){
		TreeNode node = stack.pop();
		if(reverse){
			pushAll(node.left);
		}else{
			pushAll(node.right);
		}
		return node.val;
	}
	public void pushAll(TreeNode root){
		while (root!=null){
			stack.push(root);
			if(reverse==true){
				root=root.right;
			}else{
				root=root.left;
			}
		}
	}
}

public class Solution{
	public boolean findTarger(TreeNode root , int k){
		if (root==null){
			return false;
		}
		BstIterator r = new BstIterator(root,true);
		BstIterator n = new BstIterator(root,false);
		 int j=r.next();
		 int i=n.next();
		while(i<j){
			if(i+j ==k){
				return true;
			}else if(i+j <k){
				i=n.next;
			}else{
				j=r.next();
			}
		}
		return false;
		
	}
}