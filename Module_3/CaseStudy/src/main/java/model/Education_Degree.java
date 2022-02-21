package model;

public class Education_Degree {
    private int education_degree_id;
    private String education_name;

    public Education_Degree() {
    }

    public Education_Degree(int education_degree_id, String education_name) {
        this.education_degree_id = education_degree_id;
        this.education_name = education_name;
    }

    public int getEducation_degree_id() {
        return education_degree_id;
    }

    public void setEducation_degree_id(int education_degree_id) {
        this.education_degree_id = education_degree_id;
    }

    public String getEducation_name() {
        return education_name;
    }

    public void setEducation_name(String education_name) {
        this.education_name = education_name;
    }
}
