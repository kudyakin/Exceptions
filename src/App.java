public class App {
//    public static void main(String[] args) {

//        https://habr.com/ru/company/golovachcourses/blog/223821/

//        public static void main(String[] args) throws String {}

//        try {
//        } catch (Throwable t) {}

//        try {
//        } catch (String s) {}

//        throw new Error();

//        throw new String("Hello!");

//        throw null;

//        Error ref = new Error(); // создаем экземпляр
//        throw ref;               // "бросаем" его

//        f(null);
//    }
//    public static void f(NullPointerException e) {
//        try {
//            throw e;
//        } catch (NullPointerException npe) {
//            f(npe);
//        }

//        System.out.println("sout");
//        throw new Error();

//        System.out.println("sout");
//        throw new Error();

//        public double sqr(double arg) { // надо double
//            return arg * arg; }          // double * double - это double

//        public double sqr(double arg) { // надо double
//            int k = 1;                  // есть int
//            return k; }                  // можно неявно преобразовать int в double

//        public double sqr(double arg) { // надо double
//            int k = 1;                  // есть int
//            return (double) k;  }        // явное преобразование int в double

//        public static double sqr(double arg) {
//            return "hello!"; }

//        public static double sqr(double arg) {}

//        public static double sqr(double arg) {
//            if (System.currentTimeMillis() % 2 == 0) {
//                return arg * arg; // если currentTimeMillis() - четное число, то все ОК
//            }
//            // а если нечетное, что нам возвращать?
//        }

//        public static void main(String[] args) {
//            double d = sqr(10.0); // ну, и чему равно d?
//            System.out.println(d);
//        }
//        public static double sqr(double arg) {
//            // nothing
//        }

//        public static double sqr ( double arg){
//            while (true) ;
//        } // Удивительно, но КОМПИЛИРУЕТСЯ!

//        double d = sqr(10.0);  // sqr - навсегда "повиснет", и
//        System.out.println(d); // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
//    }
//    public static double sqr(double arg) {
//        while (true); // Вот тут мы на века "повисли"
//    }

        public static double sqr(double arg) {
            if (System.currentTimeMillis() % 2 == 0) {
                return arg * arg; // ну ладно, вот твой double
            } else {
                while (true);     // а тут "виснем" навсегда
            }


    }
}
