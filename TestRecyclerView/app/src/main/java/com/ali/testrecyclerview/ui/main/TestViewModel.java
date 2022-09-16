package com.ali.testrecyclerview.ui.main;

import androidx.lifecycle.ViewModel;

public class TestViewModel extends ViewModel {
    public String Title;
    public String Description;
    public boolean Status;

    public TestViewModel(String title, String description, boolean status) {
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