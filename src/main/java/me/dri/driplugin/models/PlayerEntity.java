package me.dri.driplugin.models;


public class PlayerEntity {

    private String name;

    private String currentItemName;


    public PlayerEntity() {

    }

    public PlayerEntity(String name, String currentItemName) {
        this.name = name;
        this.currentItemName = currentItemName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentItemName() {
        return currentItemName;
    }

    public void setCurrentItemName(String currentItemName) {
        this.currentItemName = currentItemName;
    }
}
