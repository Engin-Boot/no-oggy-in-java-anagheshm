package remover;

import java.util.*;
import java.util.stream.Collectors;

public class Application{
    public static void removeOggy(ArrayList<String> names) {
      	Iterator itr = names.iterator(); 
    	 while (itr.hasNext()) 
         { 
            String s = (String) itr.next();
             if (s.contains("oggy")) 
                 itr.remove(); 
         } 
    }
    public static boolean oggyIsRemoved(ArrayList<String> names) {
        List<String> oggys = names.stream().filter(it -> it.contains("oggy")).collect(Collectors.toList());
        return oggys.size() == 0;
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("nobita", "bheem", "oggy", "oggy cockroach", "ninja"));
        removeOggy(names);
        if(oggyIsRemoved(names)) {
            System.out.println("Passed!");
            System.exit(0);
        } else {
            System.out.println("Failed!!");
            System.exit(1);
        }
    }
}