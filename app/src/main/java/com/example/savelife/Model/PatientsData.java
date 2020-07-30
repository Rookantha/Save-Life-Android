package com.example.savelife.Model;

public class PatientsData {
    private Integer id;
    private String name;
    private Integer age;
    private String address;
    private Integer ward;
    private Integer bed;
    private String guardian;
    private String nurseNote;

    public PatientsData() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getWard() {
        return ward;
    }

    public void setWard(Integer ward) {
        this.ward = ward;
    }

    public Integer getBed() {
        return bed;
    }

    public void setBed(Integer bed) {
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

    public void setNurseNote(String nurursNote) {
        this.nurseNote = nurursNote;
    }
}
