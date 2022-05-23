public class CycleDetectionINUnDirectedGraph{
	public boolean checkForCycle(int v , ArrayList<ArrayList<Integer>> adj){
		boolean [] visited= new boolean[v+1];
		for(int i=1;i<=v;i++){
			if(visited[i]==false){
				return checkForCycle(i,-1,visited,adj);
			}
		}
		return false;
	}
	
	public boolean checkForCycle(int node,int parent,boolean [] visited,ArrayList<ArrayList<Integer>> adj){
		visited[node]=true;
		for(Integer it: adj.get(node)){
			if(visited[it]==false){
				if(checkForCycle(it,node,visited,adj)==true){
					return true;
				}
			}else if(it!=node){
				return true;
			}
		}
		return false;
	}
}