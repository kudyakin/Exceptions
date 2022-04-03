//    https://habr.com/ru/company/golovachcourses/blog/225585/

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AppSecond {

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


    // пугаем ОБОИМИ исключениями
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }



}
