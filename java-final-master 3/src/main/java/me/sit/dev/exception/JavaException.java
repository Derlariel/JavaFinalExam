package me.sit.dev.exception;

import java.io.IOException;

public class JavaException {

    public static void main(String[] args)  {
        // Exception - รู้ว่าจะเกิดแน่ๆถ้าเรียกใช้
        // RuntimeException - ไม่รู้ว่าจะเกิดมั้ยย

//        testUncheckedException();
        try {
            testCheckedException();
        } catch (CheckedException | ArithmeticException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        try {
//            testArrayIndexOutOfBoundsException();
//            testArithmeticException();
//        } catch (ArithmeticException | IndexOutOfBoundsException e) {
//            System.out.println("Exception: " + e.getMessage());
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }

    private static void testCheckedException() throws CheckedException {
        if(Math.random() < 0.5) {
            int a = 1/0;
        }

        throw new CheckedException("Checked Exception");
    }

    private static void testUncheckedException() {
        throw new UncheckedException("Unchecked Exception");
    }

    // รู้ตั้งแต่ตอนเขียน
    private static void testForceThrowException() throws IOException {
        throw new IOException("Force throw exception");
    }

    private static void testArrayIndexOutOfBoundsException() {
        // ArrayIndexOutOfBoundsException
        int[] arr = new int[5];
        arr[5] = 50;
    }

    private static void testArithmeticException() {
        // ArithmeticException
        int a = 10 / 0;
    }

    private static void testNullPointerException() {
        // NullPointerException
        String str = null;
        System.out.println(str.length());
    }
}
