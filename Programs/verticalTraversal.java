class Tuple{
	TreeNode node;
	int row;//(vertical)
	int col;//(level)
	
	public Tuple(TreeNode node,int row,int col){
		this.node=node;
		this.row=row;
		this.col=col;
	}
}

public class Solution{
   public List<List<Integer>> veriticalTraversal(TreeNode node){
	   TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map= new TreeMap<>();
	   Queue<Tuple> queue= new LinkedList<>();
	   queue.offer(new Tuple(node,0,0));
	   while(!queue.isEmpty()){
		   Tuple tuple= queue.poll();
		   TreeNode node= tuple.node;
		   int x=tuple.row;
		   int y=tuple.col;
		   
		   if(!map.containsKey(x)){
			   map.put(x, new TreeMap<>());
		   }
		   if(!map.get(x).containsKey(y)){
			   map.get(x).put( y, new PriorityQueue<>());
		   }
		   map.get(x).get(y).offer(node.val);
		   
		   if(node.left!=null){
			   queue.offer(new Tuple(node.left,x-1,y+1));
		   }
		   
		    if(node.right!=null){
			   queue.offer(new Tuple(node.right,x+1,y+1));
		   }
	   }
	   List<List<Integer>> ans= new ArrayList<>();
	   for(TreeMap<Integer,PriorityQueue<Integer>> map: map.values()){
		   ans.add(new ArrayList<>){
			   for( PriorityQueue<Integer> queue: map.values()){
				   while(!queue.isEmpty())
				   ans.get(ans.size()-1).add(queue.poll());
			   }
		   }
	   }
	   
	   return ans;
   }	   
}

	

