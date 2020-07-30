package com.example.savelife.Model;

public class PatientsDetails {
    private int id;
    private String name;
    private int age;
    private String address;
    private int ward;
    private int bed;
    private String guardian;
    private String nurseNote;

    public PatientsDetails() {
    }

    public PatientsDetails(int id, String name, int age, String address, int ward, int bed, String guardian, String nurseNote) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.ward = ward;
        this.bed = bed;
        this.guardian = guardian;
        this.nurseNote = nurseNote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getWard() {
        return ward;
    }

    public void setWard(int ward) {
        this.ward = ward;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public String getGuardian() {
        return guardian;
    }

    public void setGuardian(String guardian) {
        this.guardian = guardian;
    }

    public String getNurseNote() {
        return nurseNote;
    }

    public void setNurseNote(String nurseNote) {
        this.nurseNote = nurseNote;
    }
}
