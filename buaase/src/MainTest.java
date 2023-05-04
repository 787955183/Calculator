

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void solve() {
       String sum = Main.Solve("11+22");
        Assert.assertEquals("11+22=33", sum);
    }
    @Test
    public void solve1 () {
        String sum = Main.Solve("11+33");
        Assert.assertEquals("11+33=44", sum);
    }



}
