package Week6.BookAndLibrary;

public class StringUtils {
    public static boolean included(String word, String searched){
        String search = searched.toUpperCase();
        if(search.trim().contains(word.toUpperCase().trim())){
            return true;
        }
        return false;
    }
}
