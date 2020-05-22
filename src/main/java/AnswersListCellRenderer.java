import javax.swing.*;
import java.awt.*;

public class AnswersListCellRenderer extends JPanel implements ListCellRenderer<AnswerBlock> {
    private JTextField jNumVotes;
    private JTextField jNumAnswers;
    private JTextField jQuestionsText;
    private JTextField jQuestionsTags;
    private JPanel listPanel;

    public AnswersListCellRenderer() {
        setLayout(new BorderLayout(0,0));

        jNumAnswers = new JTextField();
        jNumVotes = new JTextField();
        jQuestionsTags = new JTextField();
        jQuestionsText = new JTextField();
        listPanel = new JPanel();

        add(jNumAnswers);
        add(jNumVotes);
        add(jQuestionsTags);
        add(jQuestionsText);

        add(listPanel);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends AnswerBlock> list, AnswerBlock answerBlock, int index, boolean isSelected, boolean cellHasFocus) {
        int numVotes = answerBlock.getNumVotes();
        int numAnswers = answerBlock.getNumAnswers();
        String questionText = answerBlock.getQuestionText();
        String questionTags = answerBlock.getTagsQuestion();
        jNumAnswers.setText(String.valueOf(answerBlock.getNumAnswers()));
        jNumVotes.setText(String.valueOf(answerBlock.getNumVotes()));
        jQuestionsText.setText(answerBlock.getQuestionText());
        jQuestionsTags.setText(answerBlock.getTagsQuestion());

        return this;
    }
}
