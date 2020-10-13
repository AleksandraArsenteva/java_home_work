/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package java_homework;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test public void testStringWithDoubleSpase() {
        Solution solution = new Solution();
        assertEquals("test test", solution.shrink_space("test  test"));
    }

    @Test public void testEmptyString() {
        Solution solution = new Solution();
        assertEquals("", solution.shrink_space(""));
    }

    @Test public void testStringWithOneChar() {
        Solution solution = new Solution();
        assertEquals("a", solution.shrink_space("a"));
    }

    @Test public void testStringWithOneSpace() {
        Solution solution = new Solution();
        assertEquals("a a", solution.shrink_space("a a"));
    }

    @Test public void testStringWithManySpaces() {
        Solution solution = new Solution();
        assertEquals("a a", solution.shrink_space("a        a"));
    }

    @Test public void testStringWithSeveralWords() {
        Solution solution = new Solution();
        assertEquals("test test test", solution.shrink_space("test  test  test"));
    }

    @Test public void testStringWithSpacesAtTheEnd() {
        Solution solution = new Solution();
        assertEquals("test ", solution.shrink_space("test     "));
    }

    @Test public void testStringWithOnlySpaces() {
        Solution solution = new Solution();
        assertEquals(" ", solution.shrink_space("     "));
    }
}
