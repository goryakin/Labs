//public class Boy extends Human {
//    private Mood mood;
//
//    enum Mood {
//        GOOD, BAD, N
//    }
//    public Boy(String name) {
//        super(name, Sex.MALE);
//        mood = Mood.N;
//    }
//    public void givePresent(Present present, Girl girl) {
//        int res = girl.getPresent(present);
//        if (res > 0) {
//            mood = Mood.GOOD;
//            System.out.println("Я щасливий");
//        } else if(res < 0) {
//            mood = Mood.BAD;
//            System.out.println("Я нещасний");
//        } else {
//            mood = Mood.N;
//            System.out.println("...");
//        }
//    }
//
//}
