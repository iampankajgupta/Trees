public class Trie {
	public static final int ALPHABETIC_SIZE = 26;
	public static int NON_VALUE = -1;
	
	class TrieNode{
		boolean isLeafNode;
		int value;
		TrieNode[] children;

		// WHENEVER TRIENODE IS INITIALISE IT INITIASE WITH LEAFNODE BOOLEAN VALUE , VALUE AND TRIENODE TYPE ARRAY OF SIZE 26 
		
		TrieNode(boolean isLeafNode,int value){
			this.value = value;
			this.isLeafNode = isLeafNode;
			children = new TrieNode[ALPHABETIC_SIZE];
		}
		
		public void markAsLeaf(int value) {
			this.isLeafNode = true;
			this.value = value;
		}
	}
//	Initializing the root 
	
	TrieNode root;
	
	
	Trie(){
		this.root = new TrieNode(false,NON_VALUE);
	}
	
	private int getIndex(char ch ) {
		return ch-'a';
	}
	
	public int Search(String key ) {
		if (key == null ) {
			return NON_VALUE;
		}
		TrieNode currentNode = this.root;
		int charIndex = 0;
		while((currentNode !=null) && charIndex<key.length() ) {
			int childIndex = getIndex(key.charAt(charIndex));
			 if (childIndex < 0 || childIndex >= ALPHABETIC_SIZE)
	            {
	                return NON_VALUE;
	            }
			 
			 currentNode = currentNode.children[childIndex];
			 charIndex+=1;
		}
		if(currentNode!=null) {
			return currentNode.value;
		}
		return NON_VALUE;
	}
	
	public boolean searchKey(String key) {
		if(key==null) {
			return false;
		}
		TrieNode currentNode = this.root;
		int charIndex = 0;
		while((currentNode!=null) && charIndex < key.length()) {
			int childIndex = getIndex(key.charAt(charIndex));
			 if (childIndex < 0 || childIndex >= ALPHABETIC_SIZE)
	            {
	                return false;
	            }
			 currentNode = currentNode.children[childIndex];
			 charIndex+=1;
		}
		if(currentNode!=null) {
			return true;
		}
		return false;
		
		
	}
	
	
	public void insert(String key ,int value) {
		
		if (key == null ) return;
		
		key = key.toLowerCase();
		
		
		TrieNode currentNode = this.root;
		int charIndex = 0;
		
		while(charIndex < key.length()) {
			int childIndex = getIndex(key.charAt(charIndex));
			
			if (childIndex < 0 || childIndex >=ALPHABETIC_SIZE) {
				System.out.println("Invalid key ");
				return;
			}
			if (currentNode.children[childIndex]==null) {
				currentNode.children[childIndex] = new TrieNode(false,NON_VALUE);
				
			}
			
			currentNode = currentNode.children[childIndex];
			charIndex+=1;
			
		}
		
		currentNode.markAsLeaf(value);
		
	}
	
	public void DeleteKey(String key) {
		if(key==null) {
			return;
		}
		
	}
	
	
	public static void main(String[] args) {
		Trie obj = new Trie();
		obj.insert("abc", 20);
		boolean result = obj.searchKey("");
		System.out.println(result);
	}

}
