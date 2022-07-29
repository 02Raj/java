import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String args[]){
    StringTokenizer st = new StringTokenizer("My Name is Divyansh","");
while(st.hasMoreTokens()){
        System.out.println(st.nextToken());
    }
}
}
