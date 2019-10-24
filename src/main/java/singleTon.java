public class singleTon {

    private singleTon(){

    }

    public static singleTon getInstance() {
        return UserSingletonHolder.INSTANCE;
    }

    private static class UserSingletonHolder {
        private static final singleTon INSTANCE = new singleTon();
    }
}
