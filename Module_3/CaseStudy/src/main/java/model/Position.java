package model;

public class Position {
    private int position_id;
    private String positton_name;

    public Position() {
    }

    public Position(int position_id, String positton_name) {
        this.position_id = position_id;
        this.positton_name = positton_name;
    }

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id(int position_id) {
        this.position_id = position_id;
    }

    public String getPositton_name() {
        return positton_name;
    }

    public void setPositton_name(String positton_name) {
        this.positton_name = positton_name;
    }
}
