import java.util.Stack;

// import javax.swing.text.html.HTMLDocument.Iterator;/

public class stuck {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();  
        Stack<Integer> n = new Stack<Integer>();
        n.add(10);
        n.add(20);
        n.add(30);
        n.add(40);
        n.add(50);
        stack.push("Ayush");  
        stack.push("Garvit");  
        stack.push("Amit");  
        stack.push("Ashish");  
        stack.push("Garima");  
        stack.add("Sunil");
        while(!stack.empty() )
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}