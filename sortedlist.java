import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Main {
    
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the elements of the sorted linked list, space-separated:");
        String[] input = sc.nextLine().split(" ");
        
        ListNode head = null;
        ListNode current = null;
        
        // Creating the linked list
        for (String val : input) {
            ListNode newNode = new ListNode(Integer.parseInt(val));
            if (head == null) {
                head = newNode;
                current = head;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }
        
        // Convert the sorted linked list to a balanced BST
        Main solution = new Main();
        TreeNode root = solution.sortedListToBST(head);
        
        // Print the resulting BST in level-order traversal
        System.out.println("The resulting balanced BST in level-order:");
        printLevelOrder(root);
    }

    public TreeNode sortedListToBST(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return sortedListToBSTHelper(head, 0, size - 1);
    }

    private TreeNode sortedListToBSTHelper(ListNode head, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = (left + right) / 2;

        TreeNode leftChild = sortedListToBSTHelper(head, left, mid - 1);
        
        TreeNode root = new TreeNode(head.val);
        root.left = leftChild;

        head = head.next;  // Move to the next node in the linked list

        root.right = sortedListToBSTHelper(head, mid + 1, right);

        return root;
    }
    
    // Utility function to print level-order traversal of the BST
    private static void printLevelOrder(TreeNode root) {
        if (root == null) {
            System.out.println("[]");
            return;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll();
                if (currentNode != null) {
                    System.out.print(currentNode.val + " ");
                    queue.add(currentNode.left);
                    queue.add(currentNode.right);
                } else {
                    System.out.print("null ");
                }
            }
            System.out.println();
        }
    }
}
