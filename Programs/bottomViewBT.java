class Node{
	Node node;
	int row;//(vertical)
	
	public Node(Node node,int row){
		this.node=node;
		this.row=row;
	}
}

public class solution{
	public List<Integer> bottomViewBT(Node node){
		List<Integer> ans= new ArrayList<>();
		Map<Integer,Integer> map= new TreeMap<>();
		Queue<Node> queue= new LinkedLisst<>();
		node.row=0;
		queue.offer(node);
		while(!queue.isEmpty()){
			Node temp=queue.remove();
			int hd=temp.row;
			map.put(hd,temp.val);
			if(temp.left!=null){
				temp.row=hd-1;
				queue.add(temp);
			}
			if(temp.right!=null){
				temp.row=hd+1;
				queue.add(temp);
			}
		}
		for(Map.Entry<Integer,Integer> entry: map.entrySet()){
			ans.add(entry.getValue());
		}
		return ans;
	}
}