import java.util.Stack;

public class BaseBallGame {
    Stack<String> records = new Stack<>();
    public int calPoints(String[] operations) {

        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("D") || operations[i].equals("+")){
                checkOperator(operations[i]);
            }
            else if(operations[i].equals("C")){
                removeTheRecord();
            }
            else{
                records.push(operations[i]);
            }
        }
        if(records.size() > 0){
            int ans = 0;
            while (!records.isEmpty()){
                ans += Integer.parseInt(records.pop());
            }
            return ans;
        }
        return 0;
    }
    public void checkOperator(String operation){


        if(operation.equals("D")){
            records.push(doubleTheRecord());
            return;
        }
        else if(operation.equals("+")){
            records.push(addTheRecord());
            return;
        }

        return;
    }
    public String doubleTheRecord(){
        Integer num1 = Integer.parseInt(records.peek());

        return Integer.toString(num1*2);
    }
    public void removeTheRecord(){
        records.pop();
        return;
    }
    public String addTheRecord(){
        Integer sum = 0;

        Integer num1 = Integer.parseInt(records.peek());
        Integer tempPop = Integer.parseInt(records.pop());
        Integer num2 = Integer.parseInt(records.peek());
        records.push(Integer.toString(tempPop));

        sum = num1+num2;

        return Integer.toString(sum);
    }
}
