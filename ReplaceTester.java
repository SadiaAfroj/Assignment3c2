package ReplaceTester.java;

public class ReplaceTester {
    private String word;
    public void word(){
        this.word=word;
    }
    public ReplaceTester(String word){
        this.word=word;
    }
    public String replace1(){
        String word1=null;
        word1=word.replace("i","!");
        return word1;
    }
    public String replace2(){
        String word2=null;
        word2=word.replace("s","$");
        return word2;
    }

}