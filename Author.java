public class Author {
    private String name;
    private String email;
    private char gender = 'U';

    Author(String name, String email, char gender){
        this.name = name;
        this.email= email;

        if(gender == 'M' || gender == 'F') {
            this.gender = gender;
        }
    }


    public void SetEmail(String email){
        this.email = email;
    }


    public String GetName(){
        return this.name;
    }


    public String GetEmail(){
        return this.email;
    }


    public char GetGender(){
        return this.gender;
    }

    public String toString(){
        return this.name + " ("+ this.gender+") " + "at " +this.email;
    }


}
