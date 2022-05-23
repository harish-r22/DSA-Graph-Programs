public class Main {
public ArrayList<Integer> printBoundary(Node node){
	ArrayList<Integer> list= new ArrayList<>();
	if(node ==null){
		return list;
	}
	if(!isLeaf(node)){
		list.add(node.data);
	}
	addLeftBoundary(node,list);
	addLeaf(node,list);
	addRightBoundary(node,list);
	
	return list;
}
public boolean isLeaf(Node node){
	return (node.left==null && node.right==null);
}
public void addLeftBoundary(Node node,ArrayList<Integer> list){
	Node curr=node.left;
	while(curr!=null){
		if(!isLeaf(cur)){
			list.add(curr.data);
		}
		if(curr.left!=null){
			curr=curr.left;
		}else{
			curr=curr.right;
		}
	}
}

public void addRightBoundary(Node node,ArrayList<Integer> list){
	Node curr=node.right;
	ArrayList < Integer > tmp = new ArrayList < Integer > ();
	while(curr!=null){
		if(!isLeaf(curr)){
			temp.add(curr.data);
		}
		if(curr.right!=null){
			curr=curr.right;
		}else{
			curr=curr.left;
		}
		
	}
	int i;
	for(int i=temp.size()-1;i>=0;i--){
		list.add(temp.get(i));
	}
}

public void addLeaf(Node node,ArrayList<Integer> list){
	if(isLeaf(node)){
		list.add(node.data);
		return;
	}
	if(node.left!=null){
		addLeaf(node.left,list);
	}
	if(node.right!=null){
		addLeaf(node.right,list);
	}
}
}

