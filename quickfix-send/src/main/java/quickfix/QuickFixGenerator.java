package quickfix;

import org.quickfixj.codegenerator.MessageCodeGenerator;
import org.quickfixj.codegenerator.MessageCodeGenerator.Task;

import java.io.File;

public class QuickFixGenerator {
    public static void main(String[] args) {
        Task task = new Task();
        task.setName("Custom quickfix");
        task.setSpecification(new File("spec/CustomFIX.xml"));
        task.setTransformDirectory(new File("transforms"));
        task.setOutputBaseDirectory(new File("quickfix-send/src/main/java/quickfix"));
        task.setMessagePackage("messages");
        task.setFieldPackage("fields");
        MessageCodeGenerator messageCodeGenerator = new MessageCodeGenerator();
        messageCodeGenerator.generate(task);
    }
}
