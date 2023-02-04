import java.io.*;
import java.util.*;

public class WordPattern {

  public static boolean wordPattern(String pattern, String s) {
    HashMap<Character, String> mp = new HashMap<>();
    String[] words = s.split(" ");

    if (words.length != pattern.length()) return false;

    for (int i = 0; i < pattern.length(); i++) {
      char ch = pattern.charAt(i);

      if (mp.containsKey(ch) && mp.get(ch).equals(words[i])) continue;
      if (mp.containsKey(ch) && !mp.get(ch).equals(words[i])) return false;
      if (mp.containsValue(words[i])) return false;

      mp.put(ch, words[i]);
    }

    return true;
  }

  public static void main(String[] args) throws Exception {
    System.out.println(wordPattern("abba","dog cat dog dog"));
  }
}
