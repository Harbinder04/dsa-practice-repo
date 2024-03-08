package Operating_System;

public class FactoryClassForOs {

    // Use case : After creating this we do not have to do changes in out main application.
    public Operating_System getInstance(String str){
        if (str.equals("Open")){
            return new Android();
        }
        else if (str.equals("Close")){
            return new Ios();
        }else {
            return new Windows();
        }
    }
}
