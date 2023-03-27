package day31_practice.Browser;

public class TestBrowser {
    public static void main(String[] args) {

        ChromBrowser chrom = new ChromBrowser();
        chrom.closeBrowser();

        FireFox firefox = new FireFox();
        firefox.closeBrowser();

        Opera opera = new Opera();
        opera.openBrowser();
    }
}
