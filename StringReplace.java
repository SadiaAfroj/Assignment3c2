package Stringreplace.java;

public class StringReplace {
    private String name;

    public StringReplace(String name) {
        this.name = name;
    }

    public StringReplace()
    {
        name = "Mississippi";
    }
    public int replace1()
    {
        String newName = null;
        int newLength;
        newName = name.replace("i","ii");
        newLength = newName.length();
        return newLength;
    }
    public int replace2()
    {
        String newName1;
        int newLength2;
        newName1= name.replace("ss","s");
        newLength2=newName1.length();
        return newLength2;
    }

}
