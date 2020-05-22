public class AnswerBlock {
    private String questionText;
    private String questionLink;
    private int numVotes;
    private int numAnswers;
    private String[] tagsQuestion;

    public AnswerBlock(String questionText, String questionLink, int numVotes, int numAnswers, String[] tagsQuestion) {
        this.questionText = questionText;
        this.questionLink = questionLink;
        this.numVotes = numVotes;
        this.numAnswers = numAnswers;
        this.tagsQuestion = tagsQuestion;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionLink() {
        return questionLink;
    }

    public void setQuestionLink(String questionLink) {
        this.questionLink = questionLink;
    }

    public int getNumVotes() {
        return numVotes;
    }

    public void setNumVotes(int numVotes) {
        this.numVotes = numVotes;
    }

    public int getNumAnswers() {
        return numAnswers;
    }

    public void setNumAnswers(int numAnswers) {
        this.numAnswers = numAnswers;
    }

    public String getTagsQuestion() {
        String result = "";
        for (String s:tagsQuestion
             ) {
            result = result + " " + s;
        }
        return result;
    }

    public void setTagsQuestion(String[] tagsQuestion) {
        this.tagsQuestion = tagsQuestion;
    }
}
