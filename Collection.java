//Builder
 public static class Builder {
 private Long consecutivo;
 private String documentoDonante;
 private String codigoSede;
 private LocalDate fechaColecta;
 private String modalidad;
 private Double volumenRealMl;
 private Integer tiempoPuncionMin;
 private String flebotomista;
 private String loteInsumos;
 private String campanaAsociada;
 private String observaciones;
 private List<String> eventosAdversos = new ArrayList<>();
 private Boolean donantePrimeraVez = false;

       public Builder() {}

     public Builder consecutive(Long consecutive) {
           this.consecutive = consecutive;
           return this;
     }
     public Builder documentDonor(String documentDonor) {
           this.documentDonor = documentDonor;
           return this;

     }

      public Builder locationCode(String locationCode) {
            this.locationCode = locationCode;
            return this;

}

  public Builder collectionDate(LocalDate collectionDate) {
          this.collectionDate = collectionDate;
          return this;

}

 public Builder method(String method) {
         this.method = method;
         return this;

}

public Builder realVolume(Double realVolume) {
this.realVolume = realVolume;
return this;

}

       public Builder minutePunchTime(Integer minutePunchTime) { this.minutePunchTime = minutePunchTime;
return this;
        }

        public BuilderPunTimeMin(IntegerPunTimeMin) {
            this.MinPunTime = MinPunTime;
            return this;
        }

        public Builder phlebotomist(String phlebotomist) {
            this.phlebotomist = phlebotomist;
            return this;
        }

        public Builder lotInputs(String lotInputs) {
            this.lotInputs = lotInputs;
            return this;
        }

        public BuilderAssociatedCampaign(StringAssociatedCampaign) {
            this.associatedCampaign = associatedCampaign;
            return this;
        }

        public Builder observations(String observations) {
            this.observations = observations;
            return this;
        }

        public Builder addAdverseEvent(String event) {
            if (event != null) {
                this.adverseevents.add(event);
            }
            return this;
        }

        public Builder AdverseEvents(List<String> AdverseEvents) {
            this.AdverseEvents = AdverseEvents != null ? new ArrayList<>(adverseevents) : new ArrayList<>();
            return this;
        }

        public Builder firsttimedonor(Booleanfirsttimedonor) {
            this.firsttimedonor = firsttimedonor;
            return this;
        }

        
        public collectionRecord build() {
            
            if (consecutivo == null || documentoDonante == null || documentoDonante.isBlank() ||
                codigoSede == null || codigoSede.isBlank() || fechaColecta == null ||
                modalidad == null || modalidad.isBlank() || volumenRealMl == null ||
                tiempoPuncionMin == null || flebotomista == null || flebotomista.isBlank() ||
                loteInsumos == null || loteInsumos.isBlank()) {
                throw new IllegalStateException("Error: Mandatory fields for the collection record are missing.");
            }

            
            if (tiempoPuncionMin > 15 && (observaciones == null || observaciones.isBlank())) {
                throw new IllegalStateException("Error: Puncture time exceeds 15 minutes. " +
                        "An observation is required.");
            }

            
            if (!eventosAdversos.isEmpty() && (flebotomista == null || flebotomista.isBlank())) {
                throw new IllegalStateException("Error: Adverse events cannot be recorded without a responsible phlebotomist.");
            }

            return new RegistroDeColecta(this);
        }
    }
}
