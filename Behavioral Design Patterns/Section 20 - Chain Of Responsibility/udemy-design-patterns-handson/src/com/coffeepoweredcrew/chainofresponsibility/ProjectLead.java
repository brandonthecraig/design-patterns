package com.coffeepoweredcrew.chainofresponsibility;

//A concrete handler
public class ProjectLead extends Employee{

    public ProjectLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        if(isAllowedToProcess(application)) {
            application.approve(getApproverRole());
            return true;
        }
        return false;
    }

    private boolean isAllowedToProcess(LeaveApplication application) {
        return application.getType().equals(LeaveApplication.Type.Sick) && application.getNoOfDays() <=2;
    }
}
