import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class JavaQuizImplTest {
  @Test
  public void safePrint_NullStringCheck() {
    Quiz javaQuiz = new JavaQuizImpl();

    List<String> java = new ArrayList<>(List.of("Java", "kinda", "sucks"));
    java.add(null);
    assertEquals(14, javaQuiz.sumStringSizes(java));
  }
}
