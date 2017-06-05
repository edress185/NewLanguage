import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/**
 * Created by Maks on 04.06.2017.
 */
public class BroLanguageCompiler {





    private static void evaluate( String filename ) throws IOException {
        // Create input stream
        ANTLRInputStream inputStream = new ANTLRFileStream(filename);

        // Create lexer
        BroLanguageLexer lexer = new BroLanguageLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create parser
        BroLanguageParser parser = new BroLanguageParser(tokens);
        ParseTree tree = parser.prog(); // begin parsing at expression rule

        // Type check
        // FIXME: Add a type checker!!
        //    try {
        //       TypeChecker typeChecker = new TypeChecker();
        //       typeChecker.visit(tree);
        //       System.out.println("No errors.");
        //    } catch( CompileException ce ) {
        //       System.err.println( "ERROR: " + ce.getMessage() );
        //    }
    }

    public static void main( String[] args ) throws IOException {

        evaluate("test");
    }
}
