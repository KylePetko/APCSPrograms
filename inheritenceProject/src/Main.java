public class Main {

    private int charge;
    private int size;
    private boolean atomCreated;

    public class Proton extends SubAtomicParticle{



    }

    public class Electron extends SubAtomicParticle{
        int charge = -1;
        int size = 0;
        boolean electronMoving = false;


    }

    public class Neutron extends SubAtomicParticle{
        int charge = 0;
        int size = 1;
        boolean inNucleus = true;


    }
}