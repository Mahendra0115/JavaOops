// join(CharSequence delimiter, CharSequence... elements)--> Multiple strings ko join karta hai with a delimiter.
public class Join {
    public static void main(String[] args) {
        String str = String.join("-","java","python","javascript");
        System.out.println(str);

        // O/p --> java-python-javascript
    }
}
