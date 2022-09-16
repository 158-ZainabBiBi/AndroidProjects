package com.ali.testrecyclerview;

public class TodoItem {
    public String Title;
    public String Description;
    public boolean Status;

    public TodoItem(String title, String description, boolean status) {
        Title = title;
        Description = description;
        Status = status;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "Title='" + Title + '\'' +
                ", Description='" + Description + '\'' +
                ", Status=" + Status +
                '}';
    }
}
