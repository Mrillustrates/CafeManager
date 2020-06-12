package com.example.android.cafemanager;

public class Status {

    //Candidate name
    private String candidateName;

    //Check for checkbox of status
    private boolean isSelected;

    private int nImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private String jobPosition;



    public Status(String newCandidateName, boolean candidateIsSelected, String jPosition, int imageReourseId) {
        this.candidateName = newCandidateName;
        this.isSelected = candidateIsSelected;
        this.nImageResourceId = imageReourseId;
        this.jobPosition = jPosition;


    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public int getnImageResourceId() {
        return nImageResourceId;
    }

    public boolean hasImage(){
        return nImageResourceId != NO_IMAGE_PROVIDED;}
    }
