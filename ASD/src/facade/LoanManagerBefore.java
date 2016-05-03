package facade;

public class LoanManagerBefore {
	public void Process(LoanApplication application) {
		boolean personalDetailsAreValid = new PersonalDetailVerifier().verifyDetails(application);
		boolean professionalDetailsAreValid = new ProfessionalDetailVerifier().verifyDetails(application);
		boolean creditHistoryVerified = new CreditHistoryVerifier().verify(application);
		boolean isPreferredDeveloper = new DeveloperVerifier().isPreferredDeveloper(application.getDeveloperName());
		boolean isProjectApproved = isPreferredDeveloper ? true
				: new ProjectVerifier().isBlackListedProject(application.getProjectName());
		boolean isEligible = personalDetailsAreValid && professionalDetailsAreValid && creditHistoryVerified
				&& isProjectApproved;
		if (isEligible) {
			NotificationService notificationService = new NotificationService();
			notificationService.notifyCustomer();
		}
	}
}
