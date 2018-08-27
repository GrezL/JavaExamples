public class StringCompareEmp {
    public static void main(String[] args){
        String str = "Hello Word";
        String anotherString = "hello world";
        Object objectStr = str;

        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString));
        System.out.println(str.compareTo(objectStr.toString()));
    }
}
