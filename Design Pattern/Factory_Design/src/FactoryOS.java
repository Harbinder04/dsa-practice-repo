import Operating_System.*;

public class FactoryOS {
    public static void main(String[] args) {
//        Operating_System obj = new Android();
//        obj.spec();

        FactoryClassForOs objF = new FactoryClassForOs();
        Operating_System obj= objF.getInstance("xyz");
        obj.spec();
    }
}
