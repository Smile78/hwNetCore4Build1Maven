public class Main {

    //db - модуль работы с базой данных;
    //
    //api - модуль работы с web;
    //
    //service - слой сервисов.


    public static void main(String[] args) {
        MyService myService = new MyService();
        System.out.println(myService.getMyEntity());
        System.out.println(myService.setMyEntity(new MyEntity("second")));
        System.out.println(myService.getMyEntity());
    }
}