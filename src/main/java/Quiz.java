import java.util.List;
import org.jetbrains.annotations.Nullable;

public interface Quiz {
  public String nameRepeater(@Nullable String name, @Nullable Integer n);

  public String rangePlay();

  public void safePrintList(List<String> stringList);

  public void easyTernary(String input);
}
