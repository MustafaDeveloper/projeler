import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class TestCodes {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }


    @Test
    public void reverseString1() {
        final String testString = "turkiye";
        provideInput(testString);
        ReverseString.main(new String[0]);

        String reelSonuc = "eyikrut";
        String proSonuc = getOutput();

        Assert.assertTrue("Output: " + reelSonuc + " olmali, " +
                "Sizin Output :: " + proSonuc, proSonuc.equals(reelSonuc));
    }

    @Test
    public void reverseString2() {
        final String testString = "Bu bir    deneme   metnidir       ";
        provideInput(testString);
        ReverseString.main(new String[0]);

        String reelSonuc = "ridintem   emened    rib uB";
        String proSonuc = getOutput();

        Assert.assertTrue("Output: " + reelSonuc + " olmali, " +
                "Sizin Output :: " + proSonuc, proSonuc.equals(reelSonuc));
    }


    @Test
    public void middleNumber1() {
        final String testString = "0 -10 23";
        provideInput(testString);
        MiddleNumber.main(new String[0]);

        String reelSonuc = "0";
        String proSonuc = getOutput().trim();

        Assert.assertTrue("Output: " + reelSonuc + " olmali, " +
                "Sizin Output :: " + proSonuc, proSonuc.equals(reelSonuc));
    }


    @Test
    public void sacedeSessizHarfler1() {
        final String testString = "turkiye";
        provideInput(testString);
        SacedeSessizHarfler.main(new String[0]);

        String reelSonuc = "trky";
        String proSonuc = getOutput().trim();

        Assert.assertTrue("Output: " + reelSonuc + " olmali, " +
                "Sizin Output :: " + proSonuc, proSonuc.equals(reelSonuc));
    }

    @Test
    public void findNumbers1() {
        final String testString = "sd 2 r3as s";
        provideInput(testString);
        FindNumbers.main(new String[0]);

        String reelSonuc = "132";
        String proSonuc = getOutput().trim();

        Assert.assertTrue("Output: " + reelSonuc + " olmali, " +
                "Sizin Output :: " + proSonuc, proSonuc.equals(reelSonuc));
    }


    @Test
    public void asalSayi1() {
        final String testString = "7919";
        provideInput(testString);
        AsalSayi.main(new String[0]);

        String reelSonuc = "true";
        String proSonuc = getOutput().trim();

        Assert.assertTrue("Output: " + reelSonuc + " olmali, " +
                "Sizin Output :: " + proSonuc, proSonuc.equals(reelSonuc));
    }


    @Test
    public void karakterTekrarlama1() {
        final String testString = "turkiye";
        provideInput(testString);
        KarakterTekrarlama.main(new String[0]);

        String reelSonuc = "tuurrrkkkkiiiiiyyyyyyeeeeeee";
        String proSonuc = getOutput().trim();

        Assert.assertTrue("Output: " + reelSonuc + " olmali, " +
                "Sizin Output :: " + proSonuc, proSonuc.equals(reelSonuc));
    }


    @Test
    public void sayininTersi1() {
        final String testString = "1234567";
        provideInput(testString);
        SayininTersi.main(new String[0]);

        String reelSonuc = "7654321";
        String proSonuc = getOutput().trim();

        Assert.assertTrue("Output: " + reelSonuc + " olmali, " +
                "Sizin Output :: " + proSonuc, proSonuc.equals(reelSonuc));
    }


    @Test
    public void sesliHarfleriSay1() {
        final String testString = "istanbul'da iki kapalı çarşı vardır. ";
        provideInput(testString);
        SesliHarfleriSay.main(new String[0]);

        String reelSonuc = "13";
        String proSonuc = getOutput().trim();

        Assert.assertTrue("Output: " + reelSonuc + " olmali, " +
                "Sizin Output :: " + proSonuc, proSonuc.equals(reelSonuc));
    }


    @Test
    public void gizlenmisRakamlar1() {
        final String testString = "ABC CDEFFGHI FJKLFMNOFPRSFTUVFWXY";
        provideInput(testString);
        GizlenmisRakamlar.main(new String[0]);

        String reelSonuc = "44";
        String proSonuc = getOutput().trim();

        Assert.assertTrue("Output: " + reelSonuc + " olmali, " +
                "Sizin Output :: " + proSonuc, proSonuc.equals(reelSonuc));
    }

    @Test
    public void fibonacciSerisi1() {
        final String testString = "10";
        provideInput(testString);

        FibonacciSerisi.main(new String[0]);

        String reelSonuc = fbSeries(10);
        String proSonuc = getOutput();

        Assert.assertTrue("Output: " + reelSonuc + " olmali, " +
                "Sizin Output :: " + proSonuc, proSonuc.equals(reelSonuc));
    }

    public static String fbSeries(int n){
        int a = 0, b = 1, c = 1;
        String retVal = "";
        for (int i = 1; i <= n; i++) {
            retVal += a + " ";
            a = b;
            b = c;
            c = a + b;
        }
        return retVal;
    }


}