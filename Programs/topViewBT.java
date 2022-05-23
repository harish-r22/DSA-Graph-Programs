class Tuple{
	TreeNode node;
	int row;//(vertical)
	
	public Tuple(TreeNode node,int row,int col){
		this.node=node;
		this.row=row;
	}
}

public class Solution{
   public List<List<Integer>> veriticalTraversal(TreeNode node){
	   Map<Integer,Integer> map= new TreeMap<>();
	   Queue<Tuple> queue= new LinkedList<>();
	   queue.offer(new Tuple(node,0,0));
	   while(!queue.isEmpty()){
		   Tuple tuple= queue.poll();
		   TreeNode node= tuple.node;
		   int x=tuple.row;
		   if(map.get(x)==null){
			   map.put(x,node.val);
		   }
		   
		   if(node.left!=null){
			   queue.offer(new Tuple(node.left,x-1));
		   }
		   
		    if(node.right!=null){
			   queue.offer(new Tuple(node.right,x+1));
		   }
	   }
	   List<Integer>> ans= new ArrayList<>();
	    for(Integer an:map.values()){
			list.add(an);
		}
	   
	   return ans;
   }	   
}

	

