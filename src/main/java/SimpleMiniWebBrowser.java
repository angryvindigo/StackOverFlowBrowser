import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.*;

public class SimpleMiniWebBrowser extends JFrame {

    public SimpleMiniWebBrowser() {
        setTitle("Stackoverflow unofficial client");
        setSize(800, 600);//window size to 640px by 480px
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//what to do on close (default)

        AnswerBlock firstAnswer = new AnswerBlock("text1", "link1",
                10, 12, new String[] {"tag1", "tag2"});
        AnswerBlock secondAnswer = new AnswerBlock("text2", "link2",
                20, 22, new String[] {"tag1", "tag2"});

        DefaultListModel<AnswerBlock> listModel = new DefaultListModel<>();
        listModel.addElement(firstAnswer);
        listModel.addElement(secondAnswer);

        JList<AnswerBlock> answerBlockJList = new JList<>(listModel);
        add(new JScrollPane(answerBlockJList));
        answerBlockJList.setCellRenderer(new AnswersListCellRenderer());
    }
    /*MAIN METHOD*/
    public static void main(String[] args) {
        FlatDarculaLaf.install();
        SimpleMiniWebBrowser browser = new SimpleMiniWebBrowser();
        browser.setVisible(true);
    }//main()

}

