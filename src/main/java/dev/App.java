package dev;

import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "New Hello World!" );
        String titre = ResourceBundle.getBundle("application").getString("titre");
         //String asciiArt = FigletFont.convertOneLine("New hello2!");
        String asciiArt = FigletFont.convertOneLine(titre);
        System.out.println(asciiArt);
    }
}
