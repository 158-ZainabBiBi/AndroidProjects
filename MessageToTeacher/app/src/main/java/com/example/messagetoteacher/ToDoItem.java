package com.example.messagetoteacher;

public class ToDoItem {
    private String Title;
    private boolean Iscompleted;
    private String Description;

    @Override
    public String toString(){
        return Title + "," + Description + "," + Iscompleted;
    }

    public ToDoItem(){
        Title = "NoTitle";
        Description = "Nothing";
        Iscompleted = false;
    }

    public ToDoItem(String s){
        String[] values = s.split(",");
        Title = values[0];
        Description = values[1];
        if values[2].equals(true)


    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public boolean isIscompleted() {
        return Iscompleted;
    }

    public void setIscompleted(boolean iscompleted) {
        Iscompleted = iscompleted;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
