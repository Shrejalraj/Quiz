package Quiz;

	import java.util.List;

	public class Question {
	    private String questionText;
	    private List<String> options;
	    private int correctOptionIndex;
	    private int pointValue;

	    public Question(String questionText, List<String> options, int correctOptionIndex, int pointValue) {
	        this.questionText = questionText;
	        this.options = options;
	        this.correctOptionIndex = correctOptionIndex;
	        this.pointValue = pointValue;
	    }

	    public List<String> getOptions() {
	        return options;
	    }

	    public int getCorrectOptionIndex() {
	        return correctOptionIndex;
	    }

	    public int getPointValue() {
	        return pointValue;
	    } // Getter methods for the attributes

		public String getQuestionText() {
			return questionText;
		}
	}
