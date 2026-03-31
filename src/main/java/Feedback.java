public enum Feedback {

    TOOHIGH("Too high"),
    TOOLOW ("Too low"),
    CORRECT("Correct!");


    private final String feedback;

    Feedback(String feedback) {
        this.feedback = feedback;
    }

    public String getFeedback() {
        return feedback;
    }
    }
