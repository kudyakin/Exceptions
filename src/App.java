import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

//        https://habr.com/ru/company/golovachcourses/blog/223821/

//    public static int main(String[] args) {

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


//        public static double sqr(double arg) {
//            if (System.currentTimeMillis() % 2 == 0) {
//                return arg * arg; // ну ладно, вот твой double
//            } else {
//                while (true);     // а тут "виснем" навсегда
//            }
//        }


//        public static double sqr ( double arg){
//            throw new RuntimeException();
//        }


//        public static double sqr(double arg) {// согласно объявлению метода ты должен вернуть double
//            long time = System.currentTimeMillis();
//            if (time % 2 == 0) {
//                return arg * arg;             // ок, вот твой double
//            } else if (time % 2 == 1) { {
//                while (true);                 // не, я решил "повиснуть"
//            } else {
//                throw new RuntimeException(); // или бросить исключение
//            }
//            }


//        // sqr - "сломается" (из него "выскочит" исключение),
//        double d = sqr(10.0);  // выполнение метода main() прервется в этой строчке и
//        // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
//        System.out.println(d); // и печатать нам ничего не придется!
//    }
//    public static double sqr(double arg) {
//        throw new RuntimeException(); // "бросаем" исключение
//    }


//    public static void area(int width, int height) {
//        if (width < 0 || height < 0) {
//            // у вас плохие аргументы, извините
//        } else {
//            return width * height;
//        }
//    }


//        public static int area ( int width, int height){
//            if (width < 0 || height < 0) {
//                System.out.println("Bad ...");
//            }
//            return width * height;
//        }


//        public static int area(int width, int height) {
//            if (width < 0 || height < 0) {
//                return -1; // специальное "неправильное" значение площади
//            }
//            return width * height;
//        }


//        public static int area(int width, int height) {
//            if (width < 0 || height < 0) {
//                System.exit(0);
//            }
//            return width * height;
//        }


//        public static int area(int width, int height) {
//            if (width < 0 || height < 0) {
//                throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
//            }
//            return width * height;

//        public static void main(String[] args) {
//        System.err.println("#1.in");
//        f(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println("#1.out"); // вернулись
//    } // выходим из текущего фрейма, кончились инструкции
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   #2.out");  //вернулись
//    } // выходим из текущего фрейма, кончились инструкции
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        h(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   .   #3.out"); // вернулись
//    } // выходим из текущего фрейма, кончились инструкции
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.RETURN");
//            return; // выходим из текущего фрейма по 'return'
//        }
//        System.err.println(".   .   .   #4.out"); // ПРОПУСКАЕМ
// }


//    public static void main(String[] args) {
//        System.err.println("#1.in");
//        f(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println("#1.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   #2.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        h(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   .   #3.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.THROW");
//            throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
//        }
//        System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
//    }


//    public static void main(String[] args) {
//        System.err.println("#1.in");
//        try {
//            f(); // создаем фрейм, помещаем в стек, передаем в него управление
//        } catch (Error e) { // "перехватили" "летящее" исключение
//            System.err.println("#1.CATCH");  // и работаем
//        }
//        System.err.println("#1.out");  // работаем дальше
//    }
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   #2.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        h(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   .   #3.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.THROW");
//            throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
//        }
//        System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
//    }


//        public static void main(String[] args) {
//            System.err.println("#1.in");
//            f(); // создаем фрейм, помещаем в стек, передаем в него управление
//            System.err.println("#1.out"); // вернулись и работаем
//        }
//
//        public static void f() {
//            System.err.println(".   #2.in");
//            try {
//                g(); // создаем фрейм, помещаем в стек, передаем в него управление
//            } catch (Error e) { // "перехватили" "летящее" исключение
//                System.err.println(".   #2.CATCH");  // и работаем
//            }
//            System.err.println(".   #2.out");  // работаем дальше
//        }
//
//        public static void g() {
//            System.err.println(".   .   #3.in");
//            h(); // создаем фрейм, помещаем в стек, передаем в него управление
//            System.err.println(".   .   #3.out"); // ПРОПУСТИЛИ!
//        }
//
//        public static void h() {
//            System.err.println(".   .   .   #4.in");
//            if (true) {
//                System.err.println(".   .   .   #4.THROW");
//                throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
//            }
//            System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
//        }


//    public static void main(String[] args) {
//        System.err.println("#1.in");
//        f(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println("#1.out"); // вернулись и работаем
//    }
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   #2.out"); // вернулись и работаем
//    }
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        try {
//            h(); // создаем фрейм, помещаем в стек, передаем в него управление
//        } catch (Error e) { // "перехватили" "летящее" исключение
//            System.err.println(".   .   #3.CATCH");  // и работаем
//        }
//        System.err.println(".   .   #3.out");  // работаем дальше
//    }
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.THROW");
//            throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
//        }
//        System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (Exception e) { // catch по Exception ПЕРЕХВАТЫВАЕТ RuntimeException
//            System.err.print(" 2");
//        }
//        System.err.println(" 3");
//    }

//    public static void main(String[] args) {
//        try {
//            throw new RuntimeException();
//        } catch (Exception e) {
//            if (e instanceof RuntimeException) {
//                RuntimeException re = (RuntimeException) e;
//                System.err.print("Это RuntimeException на самом деле!!!");
//            } else {
//                System.err.print("В каком смысле не RuntimeException???");
//            }
//        }
//    }


//    public static void main(String[] args) throws Exception { // пока игнорируйте 'throws'
//        try {
//            System.err.print(" 0");
//            if (true) {throw new Exception();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {
//            System.err.print(" 2");
//        }
//        System.err.print(" 3");
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new Error();}
//            System.err.print(" 1");
//        } catch (Exception e) {
//            System.err.print(" 2");
//        }
//        System.err.print(" 3");
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {     // перехватили RuntimeException
//            System.err.print(" 2");
//            if (true) {throw new Error();} // но бросили Error
//        }
//        System.err.println(" 3");          // пропускаем - уже летит Error
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) { // перехватили RuntimeException
//            System.err.print(" 2");
//            if (true) {throw e;}       // и бросили ВТОРОЙ раз ЕГО ЖЕ
//        }
//        System.err.println(" 3");      // пропускаем - опять летит RuntimeException
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {     // перехватили RuntimeException
//            System.err.print(" 2");
//            if (true) {throw new Error();} // и бросили новый Error
//        } catch (Error e) { // хотя есть cath по Error "ниже", но мы в него не попадаем
//            System.err.print(" 3");
//        }
//        System.err.println(" 4");
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) { // перехватили RuntimeException
//            System.err.print(" 2.1");
//            try {
//                System.err.print(" 2.2");
//                if (true) {throw new Error();} // и бросили новый Error
//                System.err.print(" 2.3");
//            } catch (Throwable t) {            // перехватили Error
//                System.err.print(" 2.4");
//            }
//            System.err.print(" 2.5");
//        } catch (Error e) { // хотя есть cath по Error "ниже", но мы в него не попадаем
//            System.err.print(" 3");
//        }
//        System.err.println(" 4");
//    }


//    public static void main(String[] args) {
//        try {
//        } catch (Exception e) {
//        } catch (RuntimeException e) {
//        }
//    }


//    public static void main(String[] args) {
//        try {
//        } catch (Error e) {
//        } catch (RuntimeException e) {
//        }
//    }


//    public static void main(String[] args) {
//        try {
//            throw new Exception();
//        } catch (RuntimeException e) {
//            System.err.println("catch RuntimeException");
//        } catch (Exception e) {
//            System.err.println("catch Exception");
//        } catch (Throwable e) {
//            System.err.println("catch Throwable");
//        }
//        System.err.println("next statement");
//    }


//    public static void main(String[] args) {
//        try {
//            Throwable t = new Exception(); // ссылка типа Throwable указывает на объект типа Exception
//            throw t;
//        } catch (RuntimeException e) {
//            System.err.println("catch RuntimeException");
//        } catch (Exception e) {
//            System.err.println("catch Exception");
//        } catch (Throwable e) {
//            System.err.println("catch Throwable");
//        }
//        System.err.println("next statement");
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//        } finally {
//            System.err.println("finally");
//        }
//    }


//    public static void main(String[] args) {
//        try {
//            throw new RuntimeException();
//        } finally {
//            System.err.println("finally");
//        }
//    }


//    public static void main(String[] args) {
//        try {
//            return;
//        } finally {
//            System.err.println("finally");
//        }
//    }


//    public static void main(String[] args) {
//        try {
//            System.exit(42);
//        } finally {
//            System.err.println("finally");
//        }
//    }


//    public static void main(String[] args) {
//        try {
//            Runtime.getRuntime().exit(42);
//        } finally {
//            System.err.println("finally");
//        }
//    }


//    public static void main(String[] args) {
//        try {
//            Runtime.getRuntime().halt(42);
//        } finally {
//            System.err.println("finally");
//        }
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//            if (true) {throw new RuntimeException();}
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//            throw new RuntimeException();
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//            if (true) {return;}
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");
//    }


//    public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            return 0;
//        } finally {
//            return 1;
//        }
//    }


//    public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            throw new RuntimeException();
//        } finally {
//            return 1;
//        }
//    }


//    public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            return 0;
//        } finally {
//            throw new RuntimeException();
//        }
//    }


//    public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            throw new Error();
//        } finally {
//            throw new RuntimeException();
//        }
//    }


//    public static void main(String[] args) {
//        System.err.println(f());
//    }
//
//    public static int f() {
//        long rnd = System.currentTimeMillis();
//        boolean finished = false;
//        try {
//            if (rnd % 3 == 0) {
//                throw new Error();
//            } else if (rnd % 3 == 1) {
//                throw new RuntimeException();
//            } else {
//                // nothing
//            }
//            finished = true;
//        } finally {
//            if (finished) {
//                // не было исключений
//            } else {
//                // было исключение, но какое?
//            }
//        }
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            // nothing
//            System.err.print(" 1");
//        } catch(Error e) {
//            System.err.print(" 2");
//        } finally {
//            System.err.print(" 3");
//        }
//        System.err.print(" 4");
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new Error();}
//            System.err.print(" 1");
//        } catch(Error e) {
//            System.err.print(" 2");
//        } finally {
//            System.err.print(" 3");
//        }
//        System.err.print(" 4");
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch(Error e) {
//            System.err.print(" 2");
//        } finally {
//            System.err.print(" 3");
//        }
//        System.err.print(" 4");
//    }


//    public static void main(String[] args) {
//        if (args.length > 1) {
//            if (args.length > 2) {
//                if (args.length > 3) {
//                }
//            }
//        }
//    }


//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; i++) {
//                for (int k = 0; k < 10; k++) {
//
//                }
//            }
//        }
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            try {
//                System.err.print(" 1");
//                // НИЧЕГО
//                System.err.print(" 2");
//            } catch (RuntimeException e) {
//                System.err.print(" 3"); // НЕ заходим - нет исключения
//            } finally {
//                System.err.print(" 4"); // заходим всегда
//            }
//            System.err.print(" 5");     // заходим - выполнение в норме
//        } catch (Exception e) {
//            System.err.print(" 6");     // НЕ заходим - нет исключения
//        } finally {
//            System.err.print(" 7");     // заходим всегда
//        }
//        System.err.print(" 8");         // заходим - выполнение в норме
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            try {
//                System.err.print(" 1");
//                if (true) {throw new RuntimeException();}
//                System.err.print(" 2");
//            } catch (RuntimeException e) {
//                System.err.print(" 3"); // ЗАХОДИМ - есть исключение
//            } finally {
//                System.err.print(" 4"); // заходим всегда
//            }
//            System.err.print(" 5");     // заходим - выполнение УЖЕ в норме
//        } catch (Exception e) {
//            System.err.print(" 6");     // не заходим - нет исключения, УЖЕ перехвачено
//        } finally {
//            System.err.print(" 7");     // заходим всегда
//        }
//        System.err.print(" 8");         // заходим - выполнение УЖЕ в норме
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            try {
//                System.err.print(" 1");
//                if (true) {throw new Exception();}
//                System.err.print(" 2");
//            } catch (RuntimeException e) {
//                System.err.print(" 3"); // НЕ заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
//            } finally {
//                System.err.print(" 4"); // заходим всегда
//            }
//            System.err.print(" 5");     // не заходим - выполнение НЕ в норме
//        } catch (Exception e) {
//            System.err.print(" 6");     // ЗАХОДИМ - есть подходящее исключение
//        } finally {
//            System.err.print(" 7");     // заходим всегда
//        }
//        System.err.print(" 8");         // заходим - выполнение УЖЕ в норме
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            try {
//                System.err.print(" 1");
//                if (true) {throw new Error();}
//                System.err.print(" 2");
//            } catch (RuntimeException e) {
//                System.err.print(" 3"); // НЕ заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
//            } finally {
//                System.err.print(" 4"); // заходим всегда
//            }
//            System.err.print(" 5");     // НЕ заходим - выполнение НЕ в норме
//        } catch (Exception e) {
//            System.err.print(" 6");     // не заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
//        } finally {
//            System.err.print(" 7");     // заходим всегда
//        }
//        System.err.print(" 8");         // не заходим - выполнение НЕ в норме
//    }



//    https://habr.com/ru/company/golovachcourses/blog/225585/


    //    public static void main(String[] args) {
//        throw new Exception(); // тут ошибка компиляции
//    }


//    public static void main(String[] args) throws IOException {
//        throw new Exception(); // тут ошибка компиляции
//    }


//    public static void main(String[] args) throws Exception { // предупреждаем о Exception
//        throw new Exception(); // и кидаем Exception
//    }


//    public static void main(String[] args) throws Throwable { // предупреждаем "целом" Throwable
//        throw new Exception(); // а кидаем только Exception
//    }


//    public static void main(String[] args) throws Exception { // пугаем
//        // но ничего не бросаем
//    }


//    public static void main(String[] args) {
//        f(); // тут ошибка компиляции
//    }
//
//    public static void f() throws Exception {
//    }


//    // они пугают целым Throwable
//    public static void main(String[] args) throws Throwable {
//        f();
//    }
//    // хотя мы пугали всего-лишь Exception
//    public static void f() throws Exception {
//    }


//    public static byte[] (String url) throws IOException {
//        return "<html><body>Nothing! It's stub!</body></html>".getBytes();
//    }


//    public static void main(String[] args) {
//        f();
//    }
//    public static void f() throws RuntimeException {
//    }

//package java.lang;
//    public final class Integer extends Number implements Comparable<Integer> {
//        /**
//         * ...
//         *
//         * @param s    a {@code String} containing the {@code int}
//         *             representation to be parsed
//         * @return     the integer value represented by the argument in decimal.
//         * @exception  NumberFormatException  if the string does not contain a
//         *               parsable integer.
//         */
//        public static int parseInt(String s) throws NumberFormatException {
//            return parseInt(s,10);
//        }


//    // пугаем ОБОИМИ исключениями
//    public static void main(String[] args) throws EOFException, FileNotFoundException {
//        if (System.currentTimeMillis() % 2 == 0) {
//            throw new EOFException();
//        } else {
//            throw new FileNotFoundException();
//        }
//    }


//    // пугаем ОБОИМИ исключениями
//    public static void main(String[] args) throws EOFException, FileNotFoundException {
//        f0();
//        f1();
//    }
//    public static void f0() throws EOFException{};
//    public static void f1() throws FileNotFoundException {};


//    // пугаем ПРЕДКОМ исключений
//    public static void main(String[] args) throws IOException {
//        if (System.currentTimeMillis() % 2 == 0) {
//            throw new EOFException();
//        } else {
//            throw new FileNotFoundException();
//        }
//    }


//    // пугаем ПРЕДКОМ исключений
//    public static void main(String[] args) throws IOException {
//        f0();
//        f1();
//    }
//    public static void f0() throws EOFException {};
//    public static void f1() throws FileNotFoundException {};


//    public static void main(String[] args) throws IOException, InterruptedException {
//        f0();
//        f1();
//        f2();
//    }
//    public static void f0() throws EOFException {};
//    public static void f1() throws FileNotFoundException {};
//    public static void f2() throws InterruptedException {};


//    public static void main(String[] args) {
//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            // ...
//        }
//    }


//    public static void main(String[] args) {
//        try {
//            throw new Exception();
//        } catch (Throwable e) {
//            // ...
//        }
//    }


//    public static void main(String[] args) {
//        try {
//            throw new Exception();
//        } catch (Throwable e) {
//            // ...
//        }
//    }


//    public static void main(String[] args) {
//        try {
//            throw new Throwable();
//        } catch (Exception e) {
//            // ...
//        }
//    }


//    public static void main(String[] args) {
//        try {
//            throw new Exception();
//        } catch (Error e) {
//            // ...
//        }
//    }


//    // EOFException перехватили catch-ом, им не пугаем
//    public static void main(String[] args) throws FileNotFoundException {
//        try {
//            if (System.currentTimeMillis() % 2 == 0) {
//                throw new EOFException();
//            } else {
//                throw new FileNotFoundException();
//            }
//        } catch (EOFException e) {
//            // ...
//        }
//    }


//    // пугаем Exception
//    public static void main(String[] args) throws Exception {
//        Throwable t = new Exception(); // и лететь будет Exception
//        throw t; // но тут ошибка компиляции
//    }


//    public static void main(String[] args) throws Exception {
//        Object ref = "Hello!";  // ref указывает на строку
//        char c = ref.charAt(0); // но тут ошибка компиляции
//    }


//    public static void f0(Throwable t) throws Exception {
//        throw t;
//    }
//    public static void f1(Object ref){
//        char c = ref.charAt(0);
//    }


//    // пугаем Exception
//    public static void main(String[] args) throws Exception {
//        try {
//            Throwable t = new Exception(); // и лететь будет Exception
//            throw t; // но тут ошибка компиляции
//        } catch (Exception e) {
//            System.out.println("Перехвачено!");
//        }
//    }


//    // ТЕПЕРЬ пугаем Throwable
//    public static void main(String[] args) throws Throwable {
//        try {
//            Throwable t = new Exception(); // а лететь будет Exception
//            throw t;
//        } catch (Exception e) { // и мы перехватим Exception
//            System.out.println("Перехвачено!");
//        }
//    }


//    // предок пугает IOException и InterruptedException
//    public void f() throws IOException, InterruptedException {}
//}
//
//class Child extends Parent {
//    // а потомок пугает только потомком IOException
//    @Override
//    public void f() throws FileNotFoundException {}


//    public class Parent {
//        public void f() throws IOException, InterruptedException {}
//    }
//
//    class ChildB extends Parent {
//        @Override
//        public void f() throws Exception {}
//    }


//    public class Parent {
//        // предок пугает Exception
//        public void f() throws Exception {}
//    }


//    // тут ошибка компиляции в Java, но, ДОПУСТИМ, ее нет
//    public class Child extends Parent {
//        // потомок расширил Exception до Throwable
//        public void f() throws Throwable {}
//    }


//    public class Demo {
//        public static void test(Parent ref) {
//            // тут все компилируется, Parent.f() пугает Exception и мы его ловим catch
//            try {
//                ref.f();
//            } catch(Exception e) {}
//        }
//    }


    public static void main(String[] args) {
        // тут все компилируется, Demo.test хотел Parent и мы дали ему подтип - Child
        Demo.test(new Child());
    }

}