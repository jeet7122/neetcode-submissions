class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String op : operations){

            switch (op){
                case "+":
                    int first = stack.pop();
                    int second = stack.peek();
                    int sum = first + second;
                    stack.push(first);
                    stack.push(sum);
                    break;

                case "D":
                    stack.push(stack.peek() * 2);
                    break;

                case "C":
                    stack.pop();
                    break;

                default:
                    stack.push(Integer.parseInt(op));
            }

        }

        int total = 0;
        for (int score : stack){
            total+= score;
        }

        return total;

    }
}