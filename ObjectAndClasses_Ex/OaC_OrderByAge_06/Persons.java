package OaC_OrderByAge_06;

public class Persons {
    private String name;
    private String id;
    private int age;

    //konstr

    public Persons(String name,String id,int age){
        this.name=name;
        this.id=id;
        this.age=age;
    }
    //getters
    public String getName(){
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }
}
