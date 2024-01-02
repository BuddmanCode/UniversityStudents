package org.example;

public enum StudyProfile {
    MEDICINE("Медицина"),
    ROBOTICS("Робототехника"),
    NEURAL_NETWORKS("Нейросети"),
    ARCHITECTURE("Архитектура"),
    CULTUROLOGY("Культурология");
    private String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}
