package org.example.design_patterns.povedencheskie.chainofresponsibility;

public class BugTracker {

    public static void main(String[] args) {
        Notifier reportN = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailN = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsN = new SMSNotifier(Priority.ASAP);

        reportN.setNextNotifier(emailN);
        emailN.setNextNotifier(smsN);

        reportN.notifyManager("Everything is OK.", Priority.ROUTINE);
        reportN.notifyManager("Something went wrong!!!", Priority.IMPORTANT);
        reportN.notifyManager("Sam, we've had a problem here!!!", Priority.ASAP);
    }
}
