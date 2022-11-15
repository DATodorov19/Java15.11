public class Animal {
    private int age;
    private String food;
    public Animal(int age,String food){
        this.age=age;
        setFood(food);
    }

    public Animal changeAge(int age){
        return new Animal(age,this.food);
    }

    public void setFood(String food) {
        this.food = food;
    }
    public String getFood(String food)
    {
        return this.food;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
}