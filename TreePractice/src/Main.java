import java.util.*;
public class Main {

	public static void main(String[] args) {
		
	}

}

class Node{
	static public int nodeCount = 0;
	public int id;
	public ArrayList<Node> neighbor = new ArrayList<>();
	public boolean check = false;
	
	public Node(){
		this.id = nodeCount++;
	}
	
	public void makePath(Node n) {
		neighbor.add(n);
	}
	
	public ArrayList<Node> getNeighborNoneCheck(){
		ArrayList<Node> al = new ArrayList<>();
		for(Node n : neighbor) {
			if(!n.check) {
				al.add(n);
			}
		}
		return al;
	}
}

class Graph{
	private ArrayList<Node> nodes = new ArrayList<>();
	
	public void addNode(Node n) {
		nodes.add(n);
	}
	
	public void makeRelation(Node n1, Node n2) {
		n1.makePath(n2);
		n2.makePath(n1);
	}
	
	public void dfs() {
		ArrayList<Node> 
	}
}