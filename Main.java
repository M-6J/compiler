import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
    public static String output = "";
    public static void main(String[] args) throws IOException {
        ANTLRErrorListener e = new ErrorListener();
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        //FileInputStream fileInputStream = new FileInputStream("C:\\Users\\jmk07\\Desktop\\lab3\\src\\test.txt");
        output = args[1];

        byte[] arr = new byte[100];
        StringBuilder inString = new StringBuilder();
        int p = 0;
        try{
            while((p = fileInputStream.read(arr, 0, 100)) != -1){
                inString.append(new String(arr, 0, p));
            }
        } catch (Exception e1){
            e1.printStackTrace();
            System.exit(0);
        }

        File file = new File(output);
        PrintStream stream = null;
        try {
            stream = new PrintStream(file);
        } catch (Exception e1) {
            e1.printStackTrace();
            System.exit(0);
        }
        System.setOut(stream);



        CharStream inputStream = CharStreams.fromString(String.valueOf(inString));
        lab3Lexer lexer = new lab3Lexer(inputStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(e);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        lab3Parser parser = new lab3Parser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(e);
        ParseTree tree = parser.compUnit();
        Visitor visitor = new Visitor();
        visitor.visit(tree);

        fileInputStream.close();
    }

}

