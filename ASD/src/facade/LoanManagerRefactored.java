package facade;

public class LoanManagerRefactored {
	public void Process(LoanApplication application) {
		ILoanApplicationVerifier loanApplicationVerifier = new LoanApplicationVerifier();
		boolean isEligible = loanApplicationVerifier.isEligible(application);
		if (isEligible) {
			NotificationService notificationService = new NotificationService();
			notificationService.notify(application);
		}
	}

}
