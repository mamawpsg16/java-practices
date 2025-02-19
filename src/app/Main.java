package app;

import app.array.ArrayDemo;
import app.array.MultiDimensional;
import app.scanner.ScannerExample;
import java.util.List;
import app.control_flow.ControlFlow;
import app.control_flow.Day;
import test.Test;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//
//        String firstString = "This is";
//        String secondString = " a concatenated string.";
//        String thirdString = firstString + secondString;
//        System.out.println(thirdString);
//
//        System.out.println(GenerateMessage.generateMessage());
//        System.out.println(AnotherMessage.generateAnotherMessage());
//
//        Example obj = new Example(); // ✅ Create an instance
//        obj.nonStaticMethod(); // ✅ Now call the non-static method
//
//        var  scannerExample = new ScannerExample();
//        scannerExample.scan();
//        scannerExample.introduce();
//
//        ArrayDemo array = new ArrayDemo();
//        array.arrayInitialization();
//        array.copyArray();
//        array.printList();
//
//        MultiDimensional multiDimensional = new MultiDimensional();
//        multiDimensional.showNames();
        ControlFlow controlFlow = new ControlFlow();

        controlFlow.ifStatement();
        controlFlow.whileStatement();
        controlFlow.doWhileStatement();
        controlFlow.forStatement();
        controlFlow.switchStatement();
        controlFlow.unlabeledBreakStatement();
        controlFlow.labeledBreakStatement();
        controlFlow.unlabeledContinueStatement();
        controlFlow.labeledContinueStatement();
        controlFlow.yieldStatement();
        // COMMENT

        int result = controlFlow.yieldStatementCalculate(Day.WEDNESDAY);
        System.out.println("Result: " + result);

    }
}

class GenerateMessage {
    static String generateMessage() {
        return "Here is one message";
    }
}

class AnotherMessage {
    static String generateAnotherMessage() {
        return "Here is another message";
    }
}

class Example {
    static void staticMethod() {
        System.out.println("I'm a static method.");
    }

    void nonStaticMethod() {
        System.out.println("I'm a non-static method.");
    }
}

