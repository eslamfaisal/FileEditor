
package simplejavatexteditor;

import javax.swing.JTextPane;

public class SimpleJavaTextEditor extends JTextPane {

    private static final long serialVersionUID = 1L;
    public final static String AUTHOR_EMAIL = "Mostafahelala78@gmail.com";
    public final static String NAME = "Mostafa Khalid Abd Elsalam";
        public final static String EDITOR_EMAIL = "Mostafahelala78@gmail.com";
    public final static double VERSION = 3.0;

    /**
     * @param args
     */
    public static void main(String[] args) {
        new UI().setVisible(true);
    }

}
