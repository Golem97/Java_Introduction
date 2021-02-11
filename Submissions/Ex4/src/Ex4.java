import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class Ex4 {


	
	public static boolean contains(LinkedList lst, BinaryTree bt) {
		
		Node   rootLinkList = lst.getHead();
		BTNode rootBt   = bt.getRoot();
		
		if (rootLinkList==null) {
			return true;
			
		}
		ArrayList<BTNode> BtRootList = new ArrayList<BTNode>();
		BtRootList(BtRootList , rootBt, rootLinkList);
		
		if (BtRootList.isEmpty()) {
			return false;
		}
		
		else {
			for (int i = 0 ; i < BtRootList.size() ; i++) {
				if (ContainInLinkedList(BtRootList.get(i), rootLinkList)){
					
					return true;
}
			}
		}
		return false;
		}
	
	private static void BtRootList (ArrayList<BTNode> BtRootList , BTNode NodeOfBt, Node LinkRoot) {
		//To add in My ArrayList  
		if (NodeOfBt==null) {
			return ;
			
		}
	  if (NodeOfBt.toString().equals(LinkRoot.toString())) {
		  
		  BtRootList.add(NodeOfBt);
	}
	  BtRootList(BtRootList,NodeOfBt.getLeft(),LinkRoot);
	  BtRootList(BtRootList,NodeOfBt.getRight(),LinkRoot);
	
	}

	private static boolean ContainInLinkedList(BTNode NodeOfBt,Node LinkRoot) {
	
		boolean left = true;
		boolean right = true;
		
		
		if (LinkRoot ==null) {
			return true;
		}
		if (NodeOfBt==null) {
			return false;
		}
		if (NodeOfBt.toString().equals(LinkRoot.toString())) {
			
			left = ContainInLinkedList(NodeOfBt.getLeft(), LinkRoot.getNext()); 
			right = ContainInLinkedList(NodeOfBt.getRight(),LinkRoot.getNext());
		}
		
	
		if (right) {
			return true;
			
		}
		if (left) {
			return true;
			
		}
		else {
			return false;
		}
		
		}

	private static BTNode getBTNod(BTNode bt, String name){
		if (bt == null) {
			return null;
		}
		if (bt.toString().equals(name)) {
			return bt;
		}
		BTNode left = getBTNod(bt.getLeft(), name);
		BTNode right = getBTNod(bt.getRight(), name);

		return (left != null) ? left : right;
	}
	
	public static BinaryTree getFamilyTree(String path)  throws IOException {

		BufferedReader file = new BufferedReader(new FileReader(path));
		
		String[] line;
		String tmp;
		
		BinaryTree family = new BinaryTree();
		line = file.readLine().split(",");
		
		family.setRoot(new BTNode(line[0]));
		
		if (line.length >= 2) {family.getRoot().setLeft(new BTNode(line[1]));}
		if (line.length == 3) {family.getRoot().setRight(new BTNode(line[2]));}
		while((tmp = file.readLine()) != null) {
			line = tmp.split(",");
			BTNode actual = getBTNod(family.getRoot(), line[0]);
			
			if (line.length >= 2) {actual.setLeft(new BTNode(line[1]));}
			if (line.length == 3){actual.setRight(new BTNode(line[2]));}
			
			
		}
		return family;
	}

    public static LinkedList[] ZigZagSplit(LinkedList lst) {
		
		Node now=lst.getHead();
		
		LinkedList[] returnedList  = new LinkedList[2] ;
		
		LinkedList odd  = new LinkedList() ;
		LinkedList even = new LinkedList() ;
		
		even.setHead(new Node(now.toString()));
		
		now = now.getNext();
		
		odd.setHead(new Node(now.toString()));
		
		now = now.getNext();
		
		int index =0;
		
		while (now != null) {
			if (index% 2==0) {
				even.AddLast(now.toString());
			}
			else {
				odd.AddLast(now.toString());
			}
			now=now.getNext();
			index ++;
			
		}
		returnedList[0]=even;
		returnedList[1]=odd;
		
		return returnedList;
	}
	
    public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	
	//LinkedList
			LinkedList longList=new LinkedList();
			longList.AddFirst("-2");
			longList.AddLast("3");
			longList.AddLast("100");
			longList.AddLast("9");
			longList.AddLast("-30");
			longList.AddLast("11");
			

			//empty BinaryTree
			BinaryTree bt222=new BinaryTree();
			//empty LinkedList
			LinkedList lL222=new LinkedList();

			LinkedList[] split = ZigZagSplit(longList);
			Node actual = split[0].getHead();
			while(actual != null) {
				System.out.print(actual.toString());
				System.out.print(" > ");
				actual  = actual.getNext();
			}
			System.out.print("\n");
			actual = split[1].getHead();
			while(actual != null) {
				System.out.print(actual.toString());
				System.out.print(" > ");
				actual  = actual.getNext();
			}

}
}