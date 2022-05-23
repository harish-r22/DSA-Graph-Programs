pubic class solution{
	public List<Integer> getPath(TreeNode node, int x){
		List<Integer> list= new ArrayList<>();
		getPath(node,list,x);
		return list;
	}
	
	public boolean getPath(Node root,List<Integer> list,int x){
		if(root==null){
			return false;
		}
		list.add(root.val);
		if(root.val==x){
			return true;
		}
		if(getPath(root.left,list,x) || getPath(root.right,list,x)){
			return true;
		}
		list.remove(list.size()-1);
		return false;
	}
}