//Builder

class collectionrecord {
    
actual volume (mL), puncture time (min), phlebotomist, supply lot
    private String sequentialNumber;
    private String donorDocument;
    private string siteCode
    private String collectionDate;
    private String collectionMethod;


 
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

    
    public static class IllegalStateException {
        private String id;
        private String attributeA = "Default"; 
        private boolean attributeB = false;    

        
        public EntityBuilder(String id) {
            this.id = id;
        }

     
        public EntityBuilder setAttributeA(String value) {
            this.attributeA = value;
            return this; 
        }

        public EntityBuilder setAttributeB(boolean value) {
            this.attributeB = value;
            return this;
        }

        
        public CustomEntity build() {
            return new CustomEntity(this);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        
        CustomEntity entity = new CustomEntity.EntityBuilder("001")
                                .setAttributeA("CustomValue")
                                .setAttributeB(true)
                                .build();
        entity.display();
    }
}
