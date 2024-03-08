package Collection;

public class Enum {
        enum Week implements A{
            Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
            // These are called as Enum constants.
            // every single element is public, static and final.
            // since its final you can create child enums
            //type is Week

            Week(){
                System.out.println("Constructor "+ this);
            }  // constructor is not public or protected, only private or default

            @Override
            public void Hello() {
                System.out.println("Hello, everyone!");
            }
            // why?
            // we don't want to create new objects.
            // this is not the enum concept

            //When the constructor is being called
            // internally: public static final Week Monday = new Week();
        }

    public static void main(String[] args) {
        Week week;
        week = Week.Friday;
        week.Hello();
        System.out.println(Week.valueOf("Monday"));
//        for (Week day : Week.values()){
//            System.out.println(day);
//        }

//        System.out.println(week);
//        System.out.println(week.ordinal()); // give the position of the enum.
    }
}
