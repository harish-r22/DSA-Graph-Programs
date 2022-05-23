	public class TopoSort{
	public List<Integer> generateTopoSort(int v, ArrayList<ArrayList<Integer>> adj){
		boolean [] visited= new boolean[v];
		Satck<Integer> stack= new Stack<>();
		for(int i=0;i<v;i++){
			if(!visited[i]){
				dfs(i,visited,adj,stack);
			}
		}
		List<Integer> ans= new ArrayList<>();
		while(!stack.isEmpty()){
			ans.add(stack.pop());
		}
		return ans;
	}
	public void dfs(int node,boolean[] visited,ArrayList<ArrayList<Integer>> adj, Stack<Integer> stack){
		visited[node]=true;
		for(Integer it:adj.get(node){
			if(visited[it]){
				dfs(it,visited,adj,stack);
			}
		}
		stack.push(node);
	}
}