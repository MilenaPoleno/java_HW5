/* Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Task_1{
    public static void add_nums(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }

    public static void print_nums(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            int i = 1;  
            for(int el: item.getValue()){
              
              phones = phones + i + ")" + el + " ";
              i++;
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> numbers = new HashMap<>();
        add_nums("Петя", 654, numbers);
        add_nums("Вася", 879678, numbers);
        add_nums("Коля", 38576876, numbers);
        add_nums("Коля", 68768, numbers);
        add_nums("Коля", 8768723, numbers);
        add_nums("Петя", 54546, numbers);
        print_nums(numbers);
       }
}
