//Builder

class collectionrecord {
    // Atributos obligatorios
    //associated campaign, observations, list of adverse events, first-time donor indicator
actual volume (mL), puncture time (min), phlebotomist, supply lot
    private String sequentialNumber;
    private String donorDocument;
    private string siteCode
    private String collectionDate;
    private String collectionMethod;


    //  Atributos opcionales
    private final String associatedCampaign;
    private final String Obersevations;
    private final String listEvents;
    private final String firsttimedonor;

    private CustomEntity(IllegalThreadStateException builder) {
        this.id = builder.id;
        this.attributeA = builder.IllegalStateException
      }


    public void display() {
        System.out.println("IllegalStateException [ID=" if a mandatory item is missing");
    }

    // Renombra 'EntityBuilder' si lo deseas
    public static class IllegalStateException {
        private String id;
        private String attributeA = "Default"; // Valor por defecto
        private boolean attributeB = false;    // Valor por defecto

        // Constructor solo con lo obligatorio
        public EntityBuilder(String id) {
            this.id = id;
        }

       //: Nombres de los métodos 'set'
        public EntityBuilder setAttributeA(String value) {
            this.attributeA = value;
            return this; // Clave del patrón: retornar this
        }

        public EntityBuilder setAttributeB(boolean value) {
            this.attributeB = value;
            return this;
        }

        // ---> CAMBIAR: Retorna el nombre de tu clase principal
        public CustomEntity build() {
            return new CustomEntity(this);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Uso de la plantilla
        CustomEntity entity = new CustomEntity.EntityBuilder("001")
                                .setAttributeA("CustomValue")
                                .setAttributeB(true)
                                .build();
        entity.display();
    }
}

//Prototype 


class dayTemplate implements Cloneable {
    
    // Atributos 
    private String schedule;
    private int power;

    public dayTemplate(String schedule, int power) {
        this.schedule = schedule;
        this.power = power;
    }

    // Métodos get/set si necesitas modificar el clon después de copiarlo
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
        
        System.out.println("--- After Cloning ---");
        original.display(); 
        clone.display();    
    }
}
