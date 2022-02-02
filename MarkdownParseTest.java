import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.HashMap;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }


    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("./test-file.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }


    @Test
    public void testFile2() throws IOException {
        String contents= Files.readString(Path.of("test2-file.md"));
        List<String> expect = List.of();
        assertEquals(expect, MarkdownParse.getLinks(contents));
    
    }

    @Test
    public void testFile3() throws IOException {
        String contents= Files.readString(Path.of("test3-file.md"));
        List<String> expect = List.of("https://hello.com");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile4() throws IOException {
        String contents= Files.readString(Path.of("test4-file.md"));
        List<String> expect = List.of();
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile5() throws IOException {
        String contents= Files.readString(Path.of("test-file5.md"));
        List<String> expect = List.of();
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void testFile6() throws IOException {
        String contents= Files.readString(Path.of("test-file6.md"));
        List<String> expect = List.of();
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void testFile7() throws IOException {
        String contents= Files.readString(Path.of("test-file7.md"));
        List<String> expect = List.of();
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void testFile8() throws IOException {
        String contents= Files.readString(Path.of("test-file8.md"));
        List<String> expect = List.of();
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
}     