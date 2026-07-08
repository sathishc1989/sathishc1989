package interfaceExamples;

 class AadhaarService extends Citizen implements Service {

    AadhaarService(String CitizenName) {
        super(CitizenName);
    }


    public void applyService() {
        System.out.println("\n----- Aadhaar Service -----");
        System.out.println("Citizen Name : " + CitizenName);
        System.out.println("Service Applied : Aadhaar Card");
    }
}