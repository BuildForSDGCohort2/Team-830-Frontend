package com.example.ayena;

public class Model {

    int image;
    String name,description;

   public Model(int image, String name, String description){
       this.image = image;
       this.name = name;
       this.description = description;
   }

    public Model(int amanda, String amanda1) {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
