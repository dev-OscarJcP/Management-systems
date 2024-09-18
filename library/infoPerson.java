class infoPerson extends person{
    @Override
   public void informationPerson(){
        System.out.print("Name: ");
        System.out.println(super.getPersonName());
        System.out.print("CPF: ");
        System.out.println(super.getCpf());
        System.out.print("Date of birth: ");
        System.out.println(super.getDateOfBirt());
        System.out.print("Phone number: ");
        System.out.println(super.getAddress());
        System.out.print("Address: ");
        System.out.println(super.getFather());
        System.out.print("Father: ");
        System.out.println(super.getMother());
        System.out.print("Mother: ");
   }
}