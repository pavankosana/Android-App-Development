package com.marking.farmlygo;

import com.google.firebase.firestore.Exclude;

public class StatesList {

    @Exclude private String id;
    private String commodity, stateName1, statePrice1, stateName2, statePrice2, stateName3, statePrice3, stateName4, statePrice4, stateName5, statePrice5, stateName6, statePrice6, stateName7, statePrice7, stateName8, statePrice8, stateName9, statePrice9;

    public StatesList(){

    }

    public StatesList(String commodity, String stateName1,String statePrice1,String stateName2,String statePrice2,String stateName3,String statePrice3,String stateName4,String statePrice4,String stateName5,String statePrice5,String stateName6,String statePrice6,String stateName7,String statePrice7,String stateName8,String statePrice8,String stateName9,String statePrice9) {
        this.commodity = commodity;
        this.stateName1 = stateName1;
        this.statePrice1 = statePrice1;
        this.stateName2 = stateName2;
        this.statePrice2 = statePrice2;
        this.stateName3 = stateName3;
        this.statePrice3 = statePrice3;
        this.stateName4 = stateName4;
        this.statePrice4 = statePrice4;
        this.stateName5 = stateName5;
        this.statePrice5 = statePrice5;
        this.stateName6 = stateName6;
        this.statePrice6 = statePrice6;
        this.stateName7 = stateName7;
        this.statePrice7 = statePrice7;
        this.stateName8 = stateName8;
        this.statePrice8 = statePrice8;
        this.stateName9 = stateName9;
        this.statePrice9 = statePrice9;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommodity() {
        return commodity;
    }

    public String getStateName1() {
        return stateName1;
    }

    public String getStateName2() {
        return stateName2;
    }

    public String getStateName3() {
        return stateName3;
    }

    public String getStateName4() {
        return stateName4;
    }

    public String getStateName5() {
        return stateName5;
    }

    public String getStateName6() {
        return stateName6;
    }

    public String getStateName7() {
        return stateName7;
    }

    public String getStateName8() {
        return stateName8;
    }

    public String getStateName9() {
        return stateName9;
    }

    public String getStatePrice1() {
        return statePrice1;
    }

    public String getStatePrice2() {
        return statePrice2;
    }

    public String getStatePrice3() {
        return statePrice3;
    }

    public String getStatePrice4() {
        return statePrice4;
    }

    public String getStatePrice5() {
        return statePrice5;
    }

    public String getStatePrice6() {
        return statePrice6;
    }

    public String getStatePrice7() {
        return statePrice7;
    }

    public String getStatePrice8() {
        return statePrice8;
    }

    public String getStatePrice9() {
        return statePrice9;
    }
}