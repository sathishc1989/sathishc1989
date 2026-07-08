package interfaceExamples;


class PassportService extends Citizen implements Service {

    PassportService(String citizenName) {
        super(citizenName);
    }

    @Override
    public void applyService() {
        System.out.println("\n----- Passport Service -----");
        System.out.println("Citizen Name : " + citizenName);
        System.out.println("Service Applied : Passport");
    }
}