public class stringBuilder{     
    public String concatenate(String name1, String name2) {         
        String name = name1 + name2;         
        return name;     
    }     
    public static void main(String args[]) {         
        stringBuilder obj = new stringBuilder();         
        String x = obj.concatenate("hello", "java");         
        System.out.println(x);     
    } 
}
