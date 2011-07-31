package strings;

import java.util.LinkedList;
import java.util.List;

public class BruteForce
{
    public static List<String> words(String s)
    {
        List<String> result = new LinkedList<String>();

        int i = s.length();
        int lastChar = -1;

        while (--i != -1)
        {
            if (lastChar == -1 && s.charAt(i) != ' ')
            {
                lastChar = i;
            }
            else if (lastChar != -1)
            {
                if (s.charAt(i) == ' ' || i == 0)
                {
                    result.add(0, s.substring(i + 1, lastChar + 1));
                    lastChar = -1;
                }
            }
        }

        return result;
    }
}
