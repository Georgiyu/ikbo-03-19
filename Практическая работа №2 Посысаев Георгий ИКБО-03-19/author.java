package Mirea.practice.second;

public class author {
    public author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
     private String name,email;
     private char gender;
      public String getName() {
             return  name;
      }
      public String getEmail(){
          return email;
      }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}


