import java.util.List;
import org.jetbrains.annotations.Nullable;

public interface Quiz {

  /**
   * @param name, default to "Name" if null
   * @param n, default to "1" if null
   * @return a string with name repeated n times.
   */
  public String nameRepeater(@Nullable String name, @Nullable Integer n);

  /**
   * Prints out the list of numbers from 0 to n, stepping by stepVal.
   * Delimit the values with ", " and prefix the entire string with "nums: "
   *
   * Example: rangePlay(5, 2) = "nums: 0, 2, 4"
   *
   * @param n, default to "0" if null
   * @param stepVal, default to "1" if null
   * @return string form of output
   */
  public String rangePlay(Integer n, Integer stepVal);

  /**
   * Sums the length of all the strings.
   * @param stringList, a list with potentially null string values
   */
  public Integer sumStringSizes(List<String> stringList);

  /**
   * Prints "true" if input equals "true", and "false" if not
   * @param input, a string
   */
  public void easyTernary(String input);
}
