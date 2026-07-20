class TrieNode {
    int val;
    TrieNode[] children;
    public TrieNode() {
        this.val = 0;
        this.children = new TrieNode[26];
    }
}
class MapSum {
    TrieNode root;
    public MapSum() {
        this.root = new TrieNode();
    }
    public int getSubtreeSum(TrieNode n) {
        int sum = n.val;
        for (TrieNode child : n.children)
            if (child != null)
                sum += this.getSubtreeSum(child);
        return sum;
    }
    public void insert(String key, int val) {
        TrieNode n = this.root;
        TrieNode[] children = n.children;
        for (char letter : key.toCharArray()) {
            int idx = (int) letter - 97;
            if (children[idx] == null)
                children[idx] = new TrieNode();
            n = children[idx];
            children = n.children;
        }
        n.val = val;
    }
    public int sum(String prefix) {
        TrieNode n = this.root;
        TrieNode[] children = n.children;
        for (char letter : prefix.toCharArray()) {
            int idx = (int) letter - 97;
            if (children[idx] == null)
                return 0;
            n = children[idx];
            children = n.children;
        }
        return getSubtreeSum(n);
    }
}