public class App {
//    public static int main(String[] args) {

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


    public static void main(String[] args) {
        if (args.length > 1) {
            if (args.length > 2) {
                if (args.length > 3) {
                }
            }
        }
    }




}