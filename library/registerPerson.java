public class registerPerson {
    private String personName;
    private String dateOfBirth;
    private int cpf;    //SOCIAL IDENTIFICATION NUMBER

    public String getPersonName(){
        return personName;
    }
    public String getDateOfBirt(){
        return dateOfBirth;
    }
    public int getCpf(){    
        return cpf;
    }

    public void setPersonName(String personName){
        this.personName = personName;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }

}
