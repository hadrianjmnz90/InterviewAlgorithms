package practice;

import java.util.HashMap;
import java.util.Map;

public class LuxoftChallenge {


    public static void main(String[] args) {
            //  31 -> 3 + 1  = 4
//45 -> 4 + 5  = 9
//101 -> 1 + 0 + 1  = 2
            int input = 31;
            int output = 4;
        int [] numbers = {1, 3, 2, 3, 1};
        LuxoftChallenge challenge = new LuxoftChallenge();
            challenge. getSumNumber(input);
            System.out.println("Try programiz.pro");
            challenge.getValueThatIsUnique(numbers);
        }

        public int getSumNumber(int number){
            int firstDigit = number / 10; //3
            int secondDigit = number % 10; // 1
            int   result = firstDigit + secondDigit;
            
            System.out.println(result);
            return result;
        }

    public Integer getValueThatIsUnique(int [] numbers){
        HashMap<Integer, Integer> numberCounterMap = new HashMap<>();
        for(int number : numbers){
            numberCounterMap.put(number, numberCounterMap.getOrDefault(number, 0) + 1  );
        }
        for(Map.Entry<Integer, Integer> entry : numberCounterMap.entrySet() ){
            if(entry.getValue()  == 1){
                System.out.println(entry.getKey());
                return entry.getKey();
            }
        }
        return 0;
    }
}
