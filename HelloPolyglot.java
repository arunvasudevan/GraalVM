import org.graalvm.polyglot.*;
import org.graalvm.polyglot.proxy.*;
import java.io.File;
import java.io.IOException;
import java.lang.Throwable;

public class HelloPolyglot {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
		String name = "CloudEngineering";
		
        try (Context context = Context.create()) {
			File file = new File("./GraalVMPythonTest.py");
			Source source = Source.newBuilder("python", file).build();
			Value pythonBindings = context.getBindings("python");
			pythonBindings.putMember("name", name);
			context.eval(source);
        } catch(IOException ie) {
        	ie.printStackTrace();
        }
    }
}
