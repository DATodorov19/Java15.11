public class ImmutableAnimal {
    private int age;
    private String food;
    public ImmutableAnimal(int age,String food){
        this.age=age;
        setFood(food);
    }

    public ImmutableAnimal changeAge(int age){
        return new ImmutableAnimal(age,this.food);
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
}