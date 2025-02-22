package io.regres.services.rest.models;

public class Usuario {
    private String name;
    private String job;

    public Usuario(String name, String job){
        this.name = name;
        this.job = job;
    }

    public String getName(){
        return this.name;
    }

    public String getJob(){
        return this.job;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setJob(String job){
        this.job = job;
    }

    @Override
    public String toString()
    {
        return "{" +
                "\"name\":" + '\"' + name + "\", " +
                "\"job\":" + '\"' + job + "\"" +
                '}';
    }
}
