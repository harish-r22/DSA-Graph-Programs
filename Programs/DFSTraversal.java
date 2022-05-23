public class DfsTraversal{
	public List<Integer> dfsOFGraph(int v, ArrayList<ArrayList<Intger>>() adj){
		ArrayList<Intger> ans=new ArrayList<>();
		boolean [] vis= new boolean[v+1];
		for(int i=1;i<=v;i++){
			if(vis[i]==true){
			dfs(i,vis,adj,ans);	
			}
		}
		return ans;
	}
	
	public void dfs( int i,boolean[] vis,ArrayList<ArrayList<Intger>>() adj,ArrayList<Intger> ans){
		and.add(i);
		vis[i]=true;
		for(Integer it:adj.get(i)){
			if(vis[it] ==false){
				dfs(it,vis,adj,ans);	
			}
		}
	}
}