package com.example.android.cafemanager;

public class Candidate {

    /**
     * Create variables for job applicant with relevant details Name, phone #, position, email
     */
    private String candidateName;
    private String phoneNumber;
    private String position;
    private String email;
    private String cafeNumber;

    private int nImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Constructor if you just have name, ph # and position
     * @param applicantName
     * @param contactNumber
     * @param positionApplied
     */
    public Candidate(String applicantName, String contactNumber, String positionApplied, String cafe , int imageResourceId) {
        candidateName = applicantName;
        phoneNumber = contactNumber;
        position = positionApplied;
        cafeNumber = cafe;
        nImageResourceId = imageResourceId;
    }

    /**
     * Constructor if you have name, ph#, position, and candidate's email
     * @param applicantName
     * @param contactNumber
     * @param candidateEmail
     * @param positionApplied
     */

    public Candidate(String applicantName, String contactNumber,String positionApplied, String candidateEmail, String cafe){
        candidateName=applicantName;
        phoneNumber = contactNumber;
        email= candidateEmail;
        position = positionApplied;
        cafeNumber = cafe;

    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getPosition(){
        return position;
    }
    public String getEmail(){
        return email;
    }

    public int getnImageResourceId() {
        return nImageResourceId;
    }

    public void setnImageResourceId(int nImageResourceId) {
        this.nImageResourceId = nImageResourceId;
    }

    public String getCafeNumber(){
        return cafeNumber;


}
    public boolean hasImage(){
        return nImageResourceId != NO_IMAGE_PROVIDED;}
}


