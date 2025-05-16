public class SignedText{
    private String first, last;

    public SignedText(String a, String b){
        first = a;
        last = b;
    }
    public String getSignature(){
        String result = "";
        if(first.length()!=0){
            result+=first.substring(0,1)+"-";
        }
        return result + last;
    }
    public String addSignature(String text){
        String signature = getSignature();
        if(text.indexOf(signature)==-1){
            return text+signature;
        } else if(text.indexOf(signature)==0){
            return text.substring(signature.length())+signature;
        } else {
            return text;
        }
    }
}
