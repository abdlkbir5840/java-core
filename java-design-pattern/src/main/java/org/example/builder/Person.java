package org.example.builder;

public class Person {
    private String fname;
    private String lname;
    private String email;
    private int age;
    private Person (Builder builder){
        this.fname = builder.fname;
        this.lname = builder.lname;
        this.email = builder.email;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public  static class Builder{
        private String fname;
        private String lname;
        private String email;
        private int age;
        public Builder(){}
        public Builder fname(String fname){
            this.fname = fname;
            return this;
        }
        public Builder lname(String lname){
            this.lname = lname;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }

}
