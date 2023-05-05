package projetannexe14;

public class Autoroute extends Route{
    private int echangeur;

    public Autoroute(double kilometre, double nbpont, double passagefaunique, boolean accotement,int echangeur) {
        super(kilometre, nbpont, passagefaunique, accotement);
        this.echangeur=echangeur;
    }

    public double calculerCout(){
        double cout=0;

        cout+=(getKilometre()*6.8);
        cout+=(cout*0.2);
        cout+=(getNbpont()*6);
        cout+=(getPassagefaunique()*0.7);
        cout+=echangeur*7;

        return cout;}
}


/*
    Autoroute ( chaussée ) 	6,8 par kilomètre
    Pont 6
    Passage faunique 0,7
    Asphaltage des accotements 	0,2 par kilomètre
    Échangeur	7 #*/
