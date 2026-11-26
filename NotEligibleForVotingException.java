package ExceptionHandlingPrograms;

public class NotEligibleForVotingException extends RuntimeException {
	public NotEligibleForVotingException(String message) {
		super(message);
	}

}
