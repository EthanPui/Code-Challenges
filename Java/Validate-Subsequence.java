import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int counter =0;
    List<Integer> checkerArr = new ArrayList<Integer>();
    for(int i =0; i< sequence.size(); i++){
      
      for(int k =0; k < array.size(); k++){
        if(sequence.get(i) == array.get(k)){
          checkerArr.add(array.get(k));
          
        }

      }
    }
    // System.out.println(checkerArr);
    // System.out.println(sequence);
    if(checkerArr.size() == sequence.size()){
      return true;
    }
    return false;
  }
}
