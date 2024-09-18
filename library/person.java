public class person {
    private String personName;
    private String dateOfBirth;
    private int cpf;    //SOCIAL IDENTIFICATION NUMBER
    private String address;
    private String father;
    private String mother;

    public String getPersonName(){
        return personName;
    }
    public String getDateOfBirt(){
        return dateOfBirth;
    }
    public int getCpf(){    
        return cpf;
    }
    public String getAddress(){
        return address;
    }
    public String getFather(){
        return father;
    }
    public String getMother(){
        return mother;
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
    public void setAddress(String address){
        this.address = address;
    }
    public void setFather(String father){
        this.father = father;
    }
    public void setMother(String mother){
        this.mother = mother;
    }
}
