public class Node{
	int first;
	int secound;
	public Node(int m,int n){
		this.first=m;
		this.secound=n;
}

public class checkCycleUsingBFS{
	public boolean checkCycleUsingBFs(int v , ArrayList<ArrayList<Integer>> adj){
		boolean[] visited = new boolean[v+1];
		for(int i=0;i<=v;i++){
			if(visited[i]==false){
				if(checkCycle(i,-1,visited,adj)==true){
					return true;
				}
			}
		}
		return false;
	}
	public boolean checkCycle(int node,int parent,boolean[] visited,ArrayList<ArrayList<Integer>> adj){
		Queue<Node> quene= new LinkedList<>();
		queue.add(new Node(node,parent));
		visited[node]=true;
		while(!queue.isEmpty()){
			int node = queue.peek().first;
            int pat= queue.peek().secound;
			queue.remove();
             for(Integer it:adj.get(node)){
				 if(visited[it]==false){
					 queue.add(new Node(it,node));
					 visited[it]=true;
				 }else if(it!=pat){
					 return true;
				 }
			 }				 
		}
		return false;
	}
}