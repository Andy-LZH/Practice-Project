package Project;

public class Humanbeing
{
    // fields (instance variables)
    private int age;
    private double height;
    private String mood;

    // constructor
    public Humanbeing()
    {
        print();
    };
    public Humanbeing(int age, double height, String mood)
    {
        this.age = age;
        this.height = height;
        this.mood = mood;
    }

    public int getAge()
    {
        return age;
    }
    public double getHeight()
    {
        return height;
    }

    public String getMood()
    {
        return mood;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public void setAge(int newAge)
    {
        age = newAge;

    }
    public void growOld(int increment)
    {
        age += increment;
    }
    public boolean isOld()
    {
        if (age > 65)
        {
            return true;
        }else{
            return false;
        }
    }
    public double growHeight(int age)
    {
        int growingHeight;
        if (age <18)
        {
            growingHeight = 10;
        } else if (age < 35)
        {
            growingHeight = 3;
        }else{
            growingHeight = 0;
        }
        height += growingHeight;
        return height;
    }
    public void print()
    {
        System.out.println("Init sucess!");
    }


    public static void main(String[] args) {

    }
}