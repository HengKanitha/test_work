package Work;

public class Work implements Employee {
   public int id=1;
   public String name="SreyLin";
   public String gender="Female";
   public String job="HR";


    @Override
    public void employ(int id,String name,String gender,int age) {
        System.out.println("ID:" +id+"\t" +"Name: "+ name+ "\t"+ "Gender: "+gender +"\t"+"Age: " +age);

    }
}


