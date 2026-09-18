class dayTemplate implements Cloneable {
    

    private String schedule;
    private int power;

    public dayTemplate(String schedule, int power) {
        this.schedule = schedule;
        this.power = power;
    }

   
    public void setPower(int power) {
        this.power = power;
    }

    public void display() {
        System.out.println("Entity [Type=" + schedule + ", Power=" + power + "]");
    }

    
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        dayTemplate original = new dayTemplate ("Warrior", 100);
        original.display();

        daytemplclone = (dayTemplate) original.clone();
        

        clone.setPower(150);
        
        System.out.println(" After Cloning ");
        original.display(); 
        clone.display();    
    }
}
