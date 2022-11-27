package com.codewithmo.Stack;

import java.util.Stack;

public class S1 {
    public static void main(String[] args) {

        // *****************************************************

        // stack = LIFO data structure. Last-In First-Out
        //               stores objects into a sort of "vertical tower"
        //		  push() to add objects to the top
        //		  pop() to remove objects from the top

        // uses of stacks?
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

        // *****************************************************

        Stack<String> stack = new Stack<String>();

        //System.out.println(stack.empty());

        stack.push("C");
        stack.push("C++");
        stack.push("Java");
        stack.push("C#");
        stack.push("Python");

        String myFavProgLang = stack.pop();
        //System.out.println(myFavProgLang);
        System.out.println(stack.peek());
        System.out.println(stack.search("Java"));
        System.out.println(stack);

    }
}


