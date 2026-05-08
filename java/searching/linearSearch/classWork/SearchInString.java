public class SearchInString {
    public static void main(String [] args){
        String name="sadique";
        char target='d';
        System.out.println(search(name,target));
        System.out.println(search2(name,target));
    }

    static boolean search(String name, char ch){
        if(name.length()==0) return false;
        for(int i=0;i<name.length();i++){
            if(ch==name.charAt(i)) return true;
        }
        return false;
    }
    static boolean search2(String name, char target){
        if(name.length()==0) return false;
        for(char ch: name.toCharArray()){
            if(ch==target) return true;
        }
        return false;
    }
}
