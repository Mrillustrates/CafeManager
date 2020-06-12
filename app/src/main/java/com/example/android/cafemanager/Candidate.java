package com.example.android.cafemanager;

public class Candidate {

    /**
     * Create variables for job applicant with relevant details Name, phone #, position, email
     */
    private String candidateName;
    private String phoneNumber;
    private String position;
    private String email;


    /**
     * Constructor if you just have name, ph # and position
     * @param applicantName
     * @param contactNumber
     * @param positionApplied
     */
    public Candidate(String applicantName, String contactNumber, String positionApplied) {
        candidateName = applicantName;
        phoneNumber = contactNumber;
        position = positionApplied;
    }

    /**
     * Constructor if you have name, ph#, position, and candidate's email
     * @param applicantName
     * @param contactNumber
     * @param candidateEmail
     * @param positionApplied
     */

    public Candidate(String applicantName, String contactNumber,String positionApplied, String candidateEmail){
        candidateName=applicantName;
        phoneNumber = contactNumber;
        email= candidateEmail;
        position = positionApplied;

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
}
