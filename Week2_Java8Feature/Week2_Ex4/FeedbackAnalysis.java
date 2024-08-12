import java.util.List;
import java.util.stream.Collectors;

public class FeedbackAnalysis {
    public static void main(String[] args) {
        List<Feedback> feedbacks = new ArrayList<>();
        // add sample feedbacks

        FeedbackFilter ratingFilter = feedback -> feedback.getRating() > 3;
        FeedbackProcessor commentProcessor = feedback -> System.out.println("Comment: " + feedback.getComments());

        processFeedbacks(feedbacks, ratingFilter, commentProcessor);
    }

    public static void processFeedbacks(List<Feedback> feedbacks, FeedbackFilter filter, FeedbackProcessor processor) {
        feedbacks.stream()
                .filter(filter)
                .forEach(processor);
    }

    public static void flexibleProcessing(List<Feedback> feedbacks) {
        FeedbackFilter ratingFilter = feedback -> feedback.getRating() > 3;
        FeedbackProcessor commentProcessor = feedback -> System.out.println("Comment: " + feedback.getComments());

        processFeedbacks(feedbacks, ratingFilter, commentProcessor);

        FeedbackFilter nameFilter = feedback -> feedback.getCustomerName().startsWith("A");
        FeedbackProcessor ratingProcessor = feedback -> System.out.println("Rating: " + feedback.getRating());

        processFeedbacks(feedbacks, nameFilter, ratingProcessor);
    }
}
