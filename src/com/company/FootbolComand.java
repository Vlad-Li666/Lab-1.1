package com.company;

public class FootbolComand {
    private String lastName;
    private int age;
    private int numbergames;
    private int  numberheads;
    public String getLastName() {return lastName;}

    public int getAge() {return age;}

    public int getNumberGames() {return numbergames;}

    public int getNumberHeads() {return numberheads;}

    public void setLastName(String lastName) {
        if(lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
        else{
            throw new Error("lastName must not be empty.");
        }
    }

    public void setAge(int age) {
        if(age > 0 && age < 120) {
            this.age = age;
        }
        else{
            throw new Error("age must be more than 0 and less than 120,monkey.");
        }
    }
    public void setNumberGames(int numbergames) {
        if(numbergames > 0 && numbergames < 1000) {
            this.numbergames = numbergames;
        }
        else{
            throw new Error("too many games, monkey.");
        }
    }
    public void setNumberHeads(int numberheads) {
        if(numberheads > 0 && numberheads < 1000) {
            this.numberheads = numberheads;
        }
        else{
            throw new Error("Too many goals scored, monkey.");
        }
    }

}
