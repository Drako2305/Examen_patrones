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

//Abstract Factory 

from abc import ABC, abstractmethod


class Bolsa(ABC):
    @abstractmethod
    def getTemperature(self) str:
    pass

class Etiqueta(ABC):
    @abstractmethod
    def getprefix(self) str:
    pass

class ProtocoloConservacion(ABC):
    @abstractmethod
    def getValidity(self) str:
    pass


Mode: Refrigerated
class RefrigeratedBag(Bag):
    def get_temperature(self) -> str:
        return "Temperature: 2°C to 8°C"

class RefrigeratedLabel(Label):
    def get_prefix(self) -> str:
        return "Prefix: REF-"

class RefrigeratedProtocol(PreservationProtocol):
    def get_validity(self) -> str:
        return "Validity: 7 days"

  Mode: Frozen
class FrozenBag(Bag):
    def get_temperature(self) -> str:
        return "Temperature: -20°C or lower"

class FrozenLabel(Label):
    def get_prefix(self) -> str:
        return "Prefix: CONG-"

class FrozenProtocol(PreservationProtocol):
    def get_validity(self) -> str:
        return "Validity: 90 days"

class ProtocoloCongelado(ProtocoloConservacion):
    def obtener_vigencia(self)  str:
        return "Vigencia: 90 días"

Mode: Ambient
class BolsaAmbiente(Bolsa):
    def obtener_temperatura(self) -> str:
        return "Temperature: 15°C to 25°C"

class EtiquetaAmbiente(Etiqueta):
    def obtener_prefijo(self) -> str:
        return "Prefix: AMB-"

class ProtocoloAmbiente(ProtocoloConservacion):
    def obtener_vigencia(self) -> str:
        return "Validity: 30 days"



class FactoryModality (ABC):
    @abstractmethod
    def createBag(self) Bag:
        pass

    @abstractmethod
    def createLabel(self) Label:
        pass

    @abstractmethod
    def createConservationProtocol(self) ConservationProtocol:



class RefrigeratedFactory(ModalityFactory):
    def createBag(self)  Bag:
        return RefrigeratedBag()
        
    def createLabel(self) -> Label:
        return RefrigeratedLabel()
        
    def createPreservationProtocol(self)  PreservationProtocol:
        return RefrigeratedProtocol()

class FrozenFactory(ModalityFactory):
    def createBag(self)  Bag:
        return FrozenBag()
        
    def createLabel(self) Label:
        return FrozenLabel()
        
    def createPreservationProtocol(self)  PreservationProtocol:
        return FrozenProtocol()

class FabricaAmbiente(FabricaModalidad):
    def crearBolsa(self)  Bolsa:
        return BolsaAmbiente()
        
    def crearEtiqueta(self)  Etiqueta:
        return EtiquetaAmbiente()
        
    def crearProtocoloConservacion(self)  ProtocoloConservacion:
        return ProtocoloAmbiente()



def client_code(factory: FactoryModality):
    """
    The client works solely with abstract interfaces.
    There are no conditionals (if/switch) to evaluate the modality.
    """
    bag = factory.create_bag()
    label = factory.create_label()
    protocol = factory.create_preservation_protocol()
    
    print(bag.get_temperature())
    print(label.get_prefix())
    print(protocol.get_validity())

# Program execution
if __name__ == "__main__":
    print(" Processing Refrigerated Mode ")
    codigo_cliente(FabricaRefrigerado())
    
    print("\n Processing Frozen Mode ")
    codigo_cliente(FabricaCongelado())
    
    print("\n Processing Ambient Mode")
    codigo_cliente(FabricaAmbiente())
